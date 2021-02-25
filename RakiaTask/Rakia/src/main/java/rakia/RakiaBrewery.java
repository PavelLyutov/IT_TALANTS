package rakia;

import people.Harvester;
import people.RakiaMaker;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public  class RakiaBrewery {
    ArrayList<Harvester> berachi;
    ArrayList<RakiaMaker> rakidjii;
    private CopyOnWriteArrayList<Kazan> kazani;
    private int totalRakiaMade;

    public RakiaBrewery() {
        berachi = new ArrayList<>();
        rakidjii = new ArrayList<>();
        kazani = new CopyOnWriteArrayList<>();
        Kazan kazan1 = new Kazan("kazan1", this);
        kazani.add(kazan1);


        Kazan kazan2 = new Kazan("kazan2", this);
        kazani.add(kazan2);
        Kazan kazan3 = new Kazan("kazan3", this);
        kazani.add(kazan3);
        Kazan kazan4 = new Kazan("kazan4", this);
        kazani.add(kazan4);
        Kazan kazan5 = new Kazan("kazan5", this);
        kazani.add(kazan5);


    }

    public ArrayList<Harvester> getBerachi() {
        return berachi;
    }

    public int getTotalRakiaMade() {
        return totalRakiaMade;
    }

    public void setTotalRakiaMade(int totalRakiaMade) {
        this.totalRakiaMade = totalRakiaMade;
    }

    public CopyOnWriteArrayList<Kazan> getKazani() {
        return kazani;
    }

    public RakiaMaker getRandomRakiaMaker() {
        Random r = new Random();
        RakiaMaker cur = rakidjii.get(r.nextInt(5));
        return cur;
    }

    public ArrayList<RakiaMaker> getRakidjii() {
        return rakidjii;
    }

    public synchronized Kazan chooseKazan(Fruit fruit) {
        for (Kazan k : this.getKazani()) {
            if (k.isEmpty()) {
                k.setEmpty(false);
                return k;
            } else {
                if (k.getPlodove().get(0).getType() == fruit.getType() && k.getPlodove().size() < 10) {
                    return k;
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public synchronized void addToKazan(Fruit f) {

        while (true) {
            Kazan k = chooseKazan(f);
            if (k == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                k.addFruitsToKazan(f);
                System.out.println(Thread.currentThread().getName() +" набра 1 кг " + f.getType() + " се добавиха в " + k.getNameOfKazan() +"(общо: " + k.getPlodove().size() + ")");
                if (k.checkFullness()) {
                    notifyAll();
                }
                break;
            }

        }
    }

    public synchronized void emptyKazan() {
        while (true) {
            Kazan k = findFullKazan();
            if (k == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random r = new Random();
                int litri = r.nextInt(7) + 1;
                System.out.println( "майстор " + Thread.currentThread().getName() +  " извари "+  litri + " " + k.getPlodove().get(0).getType() + " чудна ракийка(" +this.getTotalRakiaMade() + " още литри в мазата)");
                setTotalRakiaMade(this.getTotalRakiaMade() + litri);
                k.removeFruitsFromKazan();
                System.out.println();
                notifyAll();
                break;
            }
        }
    }


    public synchronized Kazan findFullKazan() {
        for (Kazan k : this.getKazani()) {
            if (k.checkFullness()) {
                return k;
            } else {
                continue;
            }
        }
        return null;
    }

   public void startWorkProces(){
        for (Harvester h: berachi
             ) {
            h.start();
        }
        for (RakiaMaker r: rakidjii
             ) {
            r.start();
        }
    }

}


