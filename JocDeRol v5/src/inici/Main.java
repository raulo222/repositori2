package inici;

import joc.*;
public class Main {
    public static void Part3() {
        Warriors huma1 = new Warriors("Raül",16,5,900);
        Alien alien1 = new Alien("ET",6,2,30);
        Human    alien2 = new Human("ruben",60,20,300);
        alien2.attack(huma1);
    }
        public static void Part4() {
            Alien ELM = new Alien("elm",0,2,3);
            Warriors ELMO = new Warriors("elm",0,2,3);
            Team reven =new Team("els reven");
            ELM.add(reven);
            reven.tString();
            ELM.delete(reven);
            reven.tString();
            ELM.equals(ELMO);

        }
    public static void Part5() {
        Alien ELM = new Alien("elm", 0, 2, 3);
        Warriors ELMO = new Warriors("elm", 0, 2, 3);
        Team reven = new Team("els reven");
        Item sun= new  Item ("sunglasses",12,13);
        Item suni= new  Item ("sunglasse",0,0);
        System.out.println(ELM);
        ELM.additem(sun);
        System.out.println(ELM);
        ELM.additem(suni);
        System.out.println(ELM);
    }
        public static void main(String[] args) {
            Part5();
        }
    }



