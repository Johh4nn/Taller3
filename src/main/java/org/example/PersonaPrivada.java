package org.example;

public class PersonaPrivada {
    private String nombre;
    private int edad;
    private double altura;

    public PersonaPrivada() {
    }

    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostarDatos(){
        System.out.println("El nombre es: "+ nombre+" la edad es: "+edad+"y su altura es: "+altura);
    }

    public void esMAyorDeEdad(){
        if(edad>18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("no es mayor de edad");
        }
    }
}
