/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Carla Daniela
 */
public class Equipo {
    private String nombre;
    private String entrenador;
    private List<Jugador> jugadores;

    // Constructor
    public Equipo(String nombre, String entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }

    public String getEntrenador() {
        return this.entrenador;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    // Método para agregar jugador
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    // Método para mostrar la información del equipo
    public String mostrarInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Equipo: ").append(this.nombre).append(", Entrenador: ").append(this.entrenador);
        for (Jugador jugador : this.jugadores) {
            info.append(jugador.mostrarInfo()).append("\n");
        }
        return info.toString();
    }
}    
