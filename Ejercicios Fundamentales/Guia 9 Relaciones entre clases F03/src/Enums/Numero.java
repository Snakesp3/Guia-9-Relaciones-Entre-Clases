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
public class Numero {
    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), DIEZ(10), ONCE(11), DOCE(12);

    private int numero;

    private Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }
}
