package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {
    public static void main(String[] args){
        ApplicationContext SpringContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) SpringContext.getBean("metier");
        System.out.println(metier.calcul());
    }
}
