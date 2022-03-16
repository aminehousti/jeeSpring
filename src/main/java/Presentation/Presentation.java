package Presentation;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        /* injection des depandances par instanciations statiques */

     DaoImpl2 dao= new DaoImpl2();

        MetierImpl metier=new MetierImpl();

        metier.setDao(dao);
        System.out.println(" Résultat = "+metier.calcul());
    }
}
