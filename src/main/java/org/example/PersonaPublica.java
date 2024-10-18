package org.example;

public class PersonaPublica {
    public String direcccion;
    public String telefono;
    public String email;

    public PersonaPublica(String direcccion, String telefono, String email) {
        this.direcccion = direcccion;
        this.telefono = telefono;
        this.email = email;
    }

    private void cambiarDireccion(String direcccion) {
        this.direcccion = direcccion;
    }

    private void mostrarTelefono() {
        System.out.println("El número de teléfono es: " + telefono);
    }

    public void incluidodosmetodos( String dic) {
        System.out.println("El primer metodo");
        cambiarDireccion(dic);
        mostrarTelefono();
    }

    public void mostar(){
        System.out.println("la direccion es: "+direcccion+" el telefono es: "+telefono+" el email"+email);
    }
}
