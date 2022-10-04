/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import enums.Numero;
import Enums.Palo;

/**
 *
 * @author Snakesp2
 */
public class Entidad_carta {
      // Atributos
    private Numero numero;
    private Palo palo;

    public Entidad_carta() {
    }

    public Entidad_carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return this.numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return this.palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return this.getNumero() + " de " + this.getPalo().getNombre();
    }

}
