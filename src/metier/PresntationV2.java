package metier;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresntationV2 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            //System.out.println(daoClassName);
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
            //System.out.println(dao.getTemperature());
            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();
            // Appel dynamique d'une méthode
            Method m = cMetier.getMethod("setDao",IDao.class);
            m.invoke(metier,dao); // l'invocation dynamique d'une méthode
            System.out.println(metier.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
