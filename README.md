# REST-sovellus
IN00CT05-3006 kurssin pieni REST-palvelu

*Tervetuloa pelaamaan kasarin viihdevisaa!*
Peliä pelataan REST-endpointeilla, esim. Postmanilla.
Aluksi sinun pitää antaa nimesi. Voit antaa sen /kayttaja (parametrina kayttaja)
Tämän jälkeen voit hakea ensimmäisen kysymyksen /kysymys. Tällä voit myös milloin tahansa aloittaa pelin alusta.
Vastauksen kysymykseen voit antaa /vastaus (parametrina vastaus (pelkkä kirjain))
Mikäli vastaus on oikein, haetaan seuraava kysymys automaattisesti. Mikäli vastaus meni väärin, peli loppuu ja halutessasi voit aloittaa sen alusta hakemalla ensimmäisen kysymyksen /kysymys
Mikäli haluat hakea jonkun tietyn kysymyksen tai selata kysymyksiä, löytyy siihen ratkaisuna /hajeKysymys (parametrina iidee(int))
        
