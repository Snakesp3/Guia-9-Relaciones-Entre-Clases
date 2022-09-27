/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver_de_agua;
import java.util.Scanner;

public class Servicio_ruleta {

    Scanner leer = new Scanner(System.in);
    Revolver_de_agua r1 = new Revolver_de_agua();
    Jugador j1 = new Jugador();

    /*llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.*/
    public void llenarRevolver() {
        System.out.println("***Vive o Mojate***");
        r1.setPosicionActual((int) (Math.random() * 6) + 1);
        r1.setPosicionAgua((int) (Math.random() * 6) + 1);
        System.out.println("-Posicion del tambor: " + r1.getPosicionActual() + "\n-Posicion de la bala de agua: " + r1.getPosicionAgua());

    }

    /*devuelve true si la posición del agua coincide con la posición actual*/
    public void mojar() {
        boolean mojado;
        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
            mojado = true;
            System.out.println("**************************");
            System.out.println("*Las posiciones coinciden*");
            System.out.println("**************************");
        } else {
            mojado = false;
            System.out.println("*****************************");
            System.out.println("*Las posiciones no coinciden*");
            System.out.println("*****************************");
        }
    }
    //cambia a la siguiente posición del tambor

    public void siguienteChorro() {
        String siguiente = "si";
        do {
           // llenarRevolver();
            mojar();
            System.out.println("Quiere seguir probando?");
            siguiente = leer.next();
        } while (siguiente.equalsIgnoreCase("si"));
    }

    //muestra información del revolver (posición actual y donde está el agua)
    public void posicionActualDeTodo() {
        System.out.println("Posicion del tambor: " + r1.getPosicionActual()
                + "\nPosicion de la bala de agua: " + r1.getPosicionAgua());
    }

    public void disparar() {

        llenarRevolver();
        mojar();
       // boolean mojado;
//        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
//            mojado = true;
//            System.out.println("Fin del Juego");
//          }else{
//            mojado=false;
        siguienteChorro();
    }

}
