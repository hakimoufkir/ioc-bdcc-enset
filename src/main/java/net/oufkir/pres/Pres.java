package net.oufkir.pres;

import net.oufkir.dao.DaoImpl;
import net.oufkir.metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
