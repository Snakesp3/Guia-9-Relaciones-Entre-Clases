package Persona;

public class Main {

    /*Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.*/
    public static void main(String[] args) {

        Persona persona = new Persona();
        dni p1 = new dni();
        persona.setNombre("Sebastian");
        persona.setApellido("Girolmini");
        p1.setSerie("A");
        p1.setNumero(32668773);
        System.out.println("Los datos de la persona son:\n" + "Nombre y Apellido: " + persona.getNombre() + " " + persona.getApellido()
                + "\nNumero de Serie: " + p1.getSerie() + "\nNumero DNI" + p1.getNumero());

    }

}
