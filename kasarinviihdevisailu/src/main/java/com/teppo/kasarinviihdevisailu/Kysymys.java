package com.teppo.kasarinviihdevisailu;

public class Kysymys {
    private int id;
    private String kokoKysymys;
    private String oikeaVastaus;

    // Konstruktori
    public Kysymys(int id, String kokoKysymys, String oikeaVastaus) {
        this.id = id;
        this.kokoKysymys = kokoKysymys;
        this.oikeaVastaus = oikeaVastaus;
    }

    // Getterit
    public int getId() {
        return id;
    }

    public String getKokoKysymys() {
        return kokoKysymys;
    }

    public String getOikeaVastaus() {
        return oikeaVastaus;
    }
}
