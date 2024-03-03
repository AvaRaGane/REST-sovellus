package com.teppo.kasarinviihdevisailu;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    public Random random = new Random();
    private String kayttaja = "";
    private int pisteet = 0, rKysymys = 0, hiScrore = 0;
    private Questions questions;
    private String kysymys = "Paljonko kello on? A) 13.07 B) 17.09 C) 22.45 D) 02.36";
    private String vastaus = "e";
    private boolean voikoJatkaa = false;


    public MyRestController() {
        this.questions = new Questions();
    }

    //funktio jolla haetaan kysymys
    public void haeKysymys(int id) {
        Kysymys haluttuKysymys = questions.getKysymykset().get(id);
        // Tulosta kysymyksen tiedot
        if (haluttuKysymys != null) {
            //System.out.println("Kysymys ID: " + haluttuKysymys.getId());
            //System.out.println("Koko kysymys: " + haluttuKysymys.getKokoKysymys());
            //System.out.println("Oikea vastaus: " + haluttuKysymys.getOikeaVastaus());
            this.kysymys = haluttuKysymys.getKokoKysymys();
            this.vastaus = haluttuKysymys.getOikeaVastaus();
            //System.out.println("this.kysymys= " + this.kysymys);
            //System.out.println("this.vastaus= " + this.vastaus);
        } else {
            //System.out.println("Kysymystä ei löytynyt annetulla ID:llä.");
        }
    }

    //Juurimappaus, antaa pelaajalle infon, miten peliä pelataan.
    @GetMapping("/")
    public String homepage() {
        this.pisteet = 0;
        this.kayttaja = "";
        this.rKysymys = 0;
        //System.out.println("Pyyntö juureen");
        String aloitus = "<html><body>"
        + "<h3>Tervetuloa pelaamaan kasarin viihdevisaa!</h3>"
        + "<p>Peliä pelataan REST-endpointeilla, esim. Postmanilla.</p>"
        + "<p>Aluksi sinun pitää antaa nimesi. Voit antaa sen /kayttaja (parametrina kayttaja)</p>"
        + "<p>Tämän jälkeen voit hakea ensimmäisen kysymyksen /kysymys. Tällä voit myös milloin tahansa aloittaa pelin alusta.</p>"
        + "<p>Vastauksen kysymykseen voit antaa /vastaus (parametrina vastaus (pelkkä kirjain))</p>"
        + "<p>Mikäli vastaus on oikein, haetaan seuraava kysymys automaattisesti. Mikäli vastaus meni väärin, peli loppuu ja halutessasi voit aloittaa sen alusta hakemalla ensimmäisen kysymyksen /kysymys</p>"
        + "<p>Mikäli haluat hakea jonkun tietyn kysymyksen tai selata kysymyksiä, löytyy siihen ratkaisuna /hajeKysymys (parametrina iidee(int))</p>"
        + "</body></html>";
        return aloitus;
    }

    //Post mappaus, asetetaan pelaajalle nimi. Tässähän ei oikeastaan pelillisesti ole mitään merkitystä, mutta hauskempi kutsua käyttäjää nimeltä kuin pelkästään käyttäjäksi tai pelaajaksi. Jos nimeä ei ole annettu, ei peliä pääse pelaamaan.
    @PostMapping("/kayttaja")
    public String addUser(@RequestParam String kayttaja) {
        this.kayttaja = kayttaja;
        //System.out.println("Adding user " + kayttaja);
        this.voikoJatkaa = true;
        return ("Succeed " + this.kayttaja
                + ". Next we can start game. Go to postman /kysymys and get random question.");
    }

    //Get mappaus ilman parametria. Nimen antamisen jälkeen haetaan ensimmäinen kysymys. Tällä myös aloitetaan peli alusta.
    @GetMapping("/kysymys")
    public String kysymys() {
        if (this.kayttaja == "") {
            return "Annatko ensin nimesi";
        } else {
            this.pisteet = 0;
            this.rKysymys = arvoKysymys();
            haeKysymys(this.rKysymys);
            this.voikoJatkaa = true;
            //System.out.println("pyyntö kysymykselle");
            String tervehdys = ("Hei " + this.kayttaja
                    + ". Aloitetaan uusi peli. Ensimmäinen kysymys:\nKysymyksen ID on: " + this.rKysymys + ". \n");
            return tervehdys + this.kysymys;
        }
    }

    //Get mappaus parametrilla. Tällä pääsee selaamaan kysymyksiä, jos vaikka haluaa joskus tutkia kysymystä uudestaan. Parametrinä kysymyksen id. 
    @GetMapping("/hajeKysymys")
    public String kyymymys(@RequestParam int iidee) {
        Kysymys haluttuKysymys = questions.getKysymykset().get(iidee);
        if (haluttuKysymys != null) {
            //System.out.println("Haettu kysymys halutulla ID:llä: " + iidee);
            //System.out.println("Kysymys ID: " + haluttuKysymys.getId());
            //System.out.println("Koko kysymys: " + haluttuKysymys.getKokoKysymys());
            //System.out.println("Oikea vastaus: " + haluttuKysymys.getOikeaVastaus());
            return ("Haettu kysymys on:\n" + haluttuKysymys.getKokoKysymys() + "\nOikea vastaus on: "
                    + haluttuKysymys.getOikeaVastaus());
        } else {
            //System.out.println("Kysymystä ei löytynyt annetulla ID:llä." + iidee);
            return ("Kysymystä ei löytynyt annetulla ID:llä. ID: " + iidee);
        }
    }

    //Postmappaus parametrilla. Tällä lähetetään vastaukset. Mikäli vastaus on oikein, haetaan automaattisesti uusi kysymys. Jos vastaus menee väärin, täytyy peli aloittaa alusta hakemalla uusi ensimmäinen kysymys.
    @PostMapping("/vastaus")
    public String lisaaVastaus(@RequestParam String vastaus) {
        //System.out.println("vastaus:" + vastaus.toLowerCase());
        String tulos = ("Tasapeli" + this.pisteet);
        if (voikoJatkaa == false) {
            return "Peli pitää aloittaa alusta hakemalla uusi kysymys.";
        } else {
            if (vastaus.toLowerCase().equals(this.vastaus.toLowerCase())) {
                pisteet++;
                //System.out.println("Oikein! Haetaan seuraava kysymys");
                this.rKysymys = arvoKysymys();
                haeKysymys(rKysymys);
                tulos = ("Oikein meni! Pisteesi ovat nyt " + this.pisteet + ".\nSeuraava kysymys:\n" + this.kysymys);
            } else {
                if (this.hiScrore < this.pisteet) {
                    this.hiScrore = this.pisteet;
                    tulos = ("Väärin meni. Oikea vastaus oli " + this.vastaus
                            + ". Rikoit kuitenkin tämän istunnon ennätyksesi. Pisteesi ovat: " + this.pisteet
                            + ".\nAloita peli alusta hakemalla uusi kysymys.");
                } else {
                    tulos = ("Väärin meni. Oikea vastaus oli " + this.vastaus + ".\nPisteesi ovat: " + this.pisteet
                            + ".\nAiempi ennätyksesi on: " + this.hiScrore
                            + ".\nAloita peli alusta hakemalla uusi kysymys.");
                }
                this.voikoJatkaa = false;
            }
            return tulos;
        }
    }

    //funktio jolla arvotaan kysymys.
    private int arvoKysymys() {
        int arvottuKysymys = random.nextInt(100) + 1;
        //System.out.println("arvottu kysymyksen id: " + arvottuKysymys);
        return arvottuKysymys;
    }
}
