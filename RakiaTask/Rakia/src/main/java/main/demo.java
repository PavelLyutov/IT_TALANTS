package main;

import people.Harvester;
import people.RakiaMaker;
import rakia.Fruit;
import rakia.Kazan;
import rakia.RakiaBrewery;

public class demo {
    public static void main(String[] args) {
        RakiaBrewery rakidjiinica = new RakiaBrewery();
        Harvester pesho = new Harvester(20,"pesho",rakidjiinica);
        Harvester ivan = new Harvester(30,"ivan",rakidjiinica);
        Harvester gosho = new Harvester(24,"Georgi",rakidjiinica);
        Harvester sasho = new Harvester(20,"Aleksandur",rakidjiinica);
        Harvester maria = new Harvester(33,"Mariq",rakidjiinica);
        Harvester petka = new Harvester(28,"Petkata",rakidjiinica);
        Harvester krisi = new Harvester(45,"Kristina",rakidjiinica);



        rakidjiinica.getBerachi().add(pesho);
        rakidjiinica.getBerachi().add(ivan);
        rakidjiinica.getBerachi().add(gosho);
        rakidjiinica.getBerachi().add(sasho);
        rakidjiinica.getBerachi().add(maria);
        rakidjiinica.getBerachi().add(petka);
        rakidjiinica.getBerachi().add(krisi);

        RakiaMaker stavri = new RakiaMaker(60,"Stavri",rakidjiinica);
        RakiaMaker mile = new RakiaMaker(41,"Mile Kitic",rakidjiinica);
        RakiaMaker apostol = new RakiaMaker(66,"Apostol",rakidjiinica);
        RakiaMaker meto = new RakiaMaker(55,"Metodi",rakidjiinica);
        RakiaMaker kiro = new RakiaMaker(53,"Kiro",rakidjiinica);

        rakidjiinica.getRakidjii().add(stavri);
        rakidjiinica.getRakidjii().add(mile);
        rakidjiinica.getRakidjii().add(apostol);
        rakidjiinica.getRakidjii().add(meto);
        rakidjiinica.getRakidjii().add(kiro);

        rakidjiinica.startWorkProces();
        try {
            pesho.join();
            ivan.join();
            gosho.join();
            sasho.join();
            maria.join();
            petka.join();
            krisi.join();
            stavri.join();
            mile.join();
            apostol.join();
            meto.join();
            kiro.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of Working for RAKIA BREWERY");

    }
}
