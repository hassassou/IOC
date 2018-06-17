package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {
    public static void main(String[] args){
        // ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        // Au démarage on demande a spring d'aller scanner les classes qui se trouvent dans les packages passer en paramétres
        ApplicationContext springContext = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
