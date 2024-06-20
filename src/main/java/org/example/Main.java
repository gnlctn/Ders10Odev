package org.example;

public class Main {
    public static void main(String[] args) {
        for (GunesSistemi gezegen: GunesSistemi.values()) {
            System.out.println("Gezegen Adı:"+gezegen+"\nGezegenin Güneşe Göre Sırası:"+ gezegen.getSira()+"\nGezegenin Güneşe Uzaklığı:" +gezegen.getGuneseMesafe()+ "\nGezegenin Yarıçap Uzunluğu"+gezegen.getYaricap()+"km"+"\nGezegenin Güneş Çevresinde Dönüş Süresi:"+gezegen.getDonusSuresi());
            System.out.println("~~~~~~~~~~");
        }
    }
}