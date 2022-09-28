/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Entidad_baraja;
import Servicio.Creador;

/**
 *
 * @author Snakesp2
 */
public class Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidad_baraja baraja = Creador.crearBaraja();
        baraja.barajar();

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        baraja.cartasMonton();

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println(baraja.siguienteCarta());

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println(baraja.darCartas(5));

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println(baraja.darCartas(50));

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        baraja.cartasMonton();

        baraja.mostrarCartas();
    }
    
}
