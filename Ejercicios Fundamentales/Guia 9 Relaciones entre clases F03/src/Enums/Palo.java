/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Snakesp2
 */
public class Palo {
    ORO("Oro"), ESPADA("Espada"), BASTO("Basto"), COPA("Copa");

    private String nombre;

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
