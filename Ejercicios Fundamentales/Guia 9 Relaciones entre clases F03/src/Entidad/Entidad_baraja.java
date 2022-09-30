/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Snakesp2
 */
public class Entidad_baraja {
    private ArrayList<Entidad_carta> mazo = new ArrayList<Entidad_carta>();
    private ArrayList<Entidad_carta> repartidas = new ArrayList<Entidad_carta>();

    public Baraja() {
        for (Numero num_aux : Numero.values()) {
            for (Palo palo_aux : Palo.values()) {
                this.mazo.add(new Carta(num_aux, palo_aux));
            }
        }
    }

    // â€¢ barajar(): cambia de posiciÃ³n todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(this.mazo);
    }

    // â€¢ siguienteCarta(): devuelve la siguiente carta que estÃ¡ en la baraja, cuando
    // no haya mÃ¡s o
    // se haya llegado al final, se indica al usuario que no hay mÃ¡s cartas.
    public Entidad_carta siguienteCarta() {
        Entidad_carta siguiente_carta = this.mazo.get(0);
        this.mazo.remove(0);
        this.repartidas.add(siguiente_carta);
        if (this.cartasDisponibles() == 0) {
            System.out.println("No hay mas cartas para repartir");
        }
        return siguiente_carta;
    }

    // â€¢ cartasDisponibles(): indica el nÃºmero de cartas que aÃºn se puede repartir.
    public int cartasDisponibles() {
        return this.mazo.size();
    }

    // â€¢ darCartas(): dado un nÃºmero de cartas que nos pidan, le devolveremos ese
    // nÃºmero de cartas.
    // En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // debemos indicÃ¡rselo al usuario.
    public ArrayList<Entidad_carta> darCartas(int cantidad) {
        if (this.cartasDisponibles() >= cantidad) {
            ArrayList<Entidad_carta> reparto = new ArrayList<Entidad_carta>();
            for (int i = 0; i < cantidad; i++) {
                reparto.add(this.siguienteCarta());
            }
            return reparto;
        }
        System.out.println("Se pidio mas cartas de las que hay disponibles");
        return new ArrayList<Entidad_carta>();
    }

    // â€¢ cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
    // salido ninguna indicÃ¡rselo al usuario
    public void cartasMonton() {
        if (this.repartidas.size() == 0) {
            System.out.println("No hay cartas repartidas");
            return;
        }
        System.out.println("Las cartas repartidas fueron:");
        for (Entidad_carta carta_aux : this.repartidas) {
            System.out.println(carta_aux);
        }
    }

    // â€¢ mostrarBaraja(): muestra todas las cartas hasta el final.
    // Es decir, si se saca una carta y luego se llama al mÃ©todo, este no mostrara
    // esa primera carta.
    public void mostrarCartas() {
        if (this.mazo.size() == 0) {
            System.out.println("No hay cartas en el mazo");
            return;
        }
        System.out.println("Las cartas en el mazo eran:");
        for (Entidad_carta carta_aux : this.mazo) {
            System.out.println(carta_aux);
        }
    }
}
