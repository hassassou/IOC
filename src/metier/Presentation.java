package metier;

import dao.DaoImpl;

public class Presentation {
    public static void main(String[] args){
        /**
         * Injection des dependances par instanciation statique
         */
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
