package Futbol;

import java.util.ArrayList;

public class Main {

    /*Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.*/
    public static void main(String[] args) {

        //Creamos de forma automatica a cada objeto "jugador"
        Jugador pana1 = new Jugador("Seba", "Girolmini", "Defensor", 6);
        Jugador pana2 = new Jugador("Ezequiel", "Delon", "Medio", 5);
        Jugador pana3 = new Jugador("Fran", "Berot", "Latera", 3);
        Jugador pana4 = new Jugador("Nico", "Pipo", "Delantero", 9);

        //Creamos un ArrayLis aux para guardar a los jugadores
        ArrayList<Jugador> aux = new ArrayList();
        aux.add(pana1);
        aux.add(pana2);
        aux.add(pana3);
        aux.add(pana4);
        //Mostramos los jugadores cargados por medio de un ForE
        System.out.println("****************************EQUIPASO**************************");
        for (Jugador equipaso : aux) {
            System.out.println("--------------------------------------------------------------");

            System.out.println(equipaso);
            System.out.println("--------------------------------------------------------------");

        }

    }

}
