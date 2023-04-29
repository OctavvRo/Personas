
package clases;

import java.util.Scanner;

public class Persona {
   
    private String nombre;
    private String genero;
    private int edad;

    Scanner e =new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public void modificarAtributos(){
        
        System.out.println("Ingresa el nombre de la persona: ");
        this.nombre = e.nextLine();
        System.out.println("Ingresa el género de la persona: ");
        this.genero = e.nextLine();
        System.out.println("Ingresa la edad de la persona: ");
        this.edad = e.nextInt();
    }
      
}
