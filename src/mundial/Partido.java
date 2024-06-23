/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;

import java.util.Random;

/**
 *
 * @author Carla Daniela
 */
public class Partido {
    private static Equipo equipoLocal;
    private static Equipo equipoVisitante;
    private static Estadio estadio;
    private static String resultado;

    // Constructor
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Estadio estadio) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.resultado = null;
    }

    // Métodos get
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public String getResultado() {
        return resultado;
    }

    // Métodos set
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    // Método para simular el partido
    public static void jugarPartido() {
        // Simula un resultado aleatorio
        Random random = new Random();
        int golesLocal = random.nextInt(6);
        int golesVisitante = random.nextInt(6);
        Partido.resultado = golesLocal + " - " + golesVisitante;
    }

    // Método para mostrar el resultado del partido
    public static String mostrarResultado() {
        return "Resultado: " + resultado + ", Local: " + equipoLocal.getNombre() + ", Visitante: " + equipoVisitante.getNombre();
    }    
}
