/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

import Interfaz.Menu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Carla Daniela
 */
public class Main {
    public static List<Jugador> listaJugadores = new ArrayList<>();
    public static List<Estadio> listaEstadios = new ArrayList<>();
    public static List<Equipo> listaEquipos = new ArrayList<>();
    public static List<Partido> listaPartidos = new ArrayList<>();
    public static void main(String[] args) {
        // Crear lista de jugadores
        listaJugadores.add(new Jugador("Lionel Messi", 35, "Delantero"));
        listaJugadores.add(new Jugador("Cristiano Ronaldo", 37, "Delantero"));
        listaJugadores.add(new Jugador("Neymar Jr", 30, "Delantero"));
        listaJugadores.add(new Jugador("Kylian Mbappé", 23, "Delantero"));
        listaJugadores.add(new Jugador("Kevin De Bruyne", 31, "Centrocampista"));
        listaJugadores.add(new Jugador("Robert Lewandowski", 34, "Delantero"));
        listaJugadores.add(new Jugador("Mohamed Salah", 30, "Delantero"));
        listaJugadores.add(new Jugador("Virgil van Dijk", 31, "Defensa"));
        listaJugadores.add(new Jugador("Luka Modric", 36, "Centrocampista"));
        listaJugadores.add(new Jugador("Sergio Ramos", 36, "Defensa"));

        // Crear lista de estadios
        listaEstadios.add(new Estadio("Camp Nou", "Barcelona", 99354));
        listaEstadios.add(new Estadio("Santiago Bernabéu", "Madrid", 81044));
        listaEstadios.add(new Estadio("Old Trafford", "Manchester", 74879));
        listaEstadios.add(new Estadio("Allianz Arena", "Múnich", 75000));
        listaEstadios.add(new Estadio("San Siro", "Milán", 80018));
        listaEstadios.add(new Estadio("Maracaná", "Río de Janeiro", 78838));
        listaEstadios.add(new Estadio("Wembley", "Londres", 90000));
        listaEstadios.add(new Estadio("Signal Iduna Park", "Dortmund", 81365));
        listaEstadios.add(new Estadio("Parc des Princes", "París", 47929));
        listaEstadios.add(new Estadio("Stamford Bridge", "Londres", 41837));

        // Crear lista de equipos y agregar jugadores a los equipos
        listaEquipos.add(new Equipo("FC Barcelona", "Xavi Hernández"));
        listaEquipos.add(new Equipo("Real Madrid", "Carlo Ancelotti"));

        // Crear lista de partidos
        List<Partido> partidos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < listaEquipos.size(); i++) {
            for (int j = i + 1; j < listaEquipos.size(); j++) {
                Estadio estadio = listaEstadios.get(random.nextInt(listaEstadios.size()));
                Partido partido = new Partido(listaEquipos.get(i), listaEquipos.get(j), estadio);
                partido.jugarPartido(); // Simular resultado del partido
                partidos.add(partido);


            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
            });
                    }
        }
    }
}

        
