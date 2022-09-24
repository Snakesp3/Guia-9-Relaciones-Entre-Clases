
package Futbol;

import java.util.ArrayList;

/*Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.*/
public class Equipo {
    
    //Creamos una list apara jugar jugadores
    
    ArrayList<Jugador>equipos= new ArrayList();

    public Equipo() {
    }

    public ArrayList<Jugador> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Jugador> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Equipo{" + "equipos=" + equipos + '}';
    }
    
    
    
    
    
    
    
    
}
