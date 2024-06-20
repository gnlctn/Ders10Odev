package org.example;

public enum GunesSistemi {
    Merkur(1,"57 milyon km",2442,"88 dünya günü"),
    Venus(2,"110 milyon km",6173,"225 dünya günü"),
    Dunya(3,"148 milyon km",6355,"365 gün"),
    Mars(4,"230 milyon km",3384,"687 dünya günü"),
    Jupiter(5,"780 milyon km",71324,"4331 dünya günü"),
    Saturn(6,"1 milyar 438 milyon km",62155,"10747 dünya günü"),
    Uranus(7,"2 milyar 970 milyom km",25884,"30589 dünya günü"),
    Neptun(8,"4 milyar 568 milyon km",24569,"59800 dünya günü");

    private final int sira;
    private final String guneseMesafe;
    private final int yaricap;
    private final String donusSuresi;

    GunesSistemi(int sira,String guneseMesafe,int yaricap,String donusSuresi) {
        this.sira = sira;
        this.guneseMesafe = guneseMesafe;
        this.yaricap = yaricap;
        this.donusSuresi = donusSuresi;
    }
    public int getSira(){
        return sira;
    }
    public String getGuneseMesafe(){
        return guneseMesafe;
    }
    public int getYaricap(){
        return yaricap;
    }
    public String getDonusSuresi(){
        return donusSuresi;
    }

}
