package net.oufkir.pres;

import net.oufkir.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.oufkir.dao", "net.oufkir.metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES = "+ metier.calcul());

    }
}
