package org.example;

public class Main {
    public static void main(String[] args) {

        PersonaPrivada pv1 = new PersonaPrivada("JOse",33,1.88);
        pv1.mostarDatos();

        PersonaPublica pp = new PersonaPublica("Enrique SEgoviano","099813194","naosdmoams@gmail.com");

        pp.mostar();

        System.out.println("-*-*--*-*--*-*-**-**---*-*");
        pp.incluidodosmetodos("12 de octubre");

        pp.mostar();
    }
}