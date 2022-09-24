/*Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.*/
package Persona;


public class dni {
    
    private String serie;
    private int numero;

    public dni() {
    }

    public dni(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
    
    
    
    
    
}
