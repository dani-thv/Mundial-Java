/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Carla Daniela
 */
public class Mundial {
    private List<Grupo> grupos;
    private List<Estadio> estadios;

    // Constructor
    public Mundial() {
        this.grupos = new ArrayList<>();
        this.estadios = new ArrayList<>();
    }

    // Métodos get
    public List<Grupo> getGrupos() {
        return grupos;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }

    // Método para registrar grupo
    public void registrarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    // Método para registrar estadio
    public void registrarEstadio(Estadio estadio) {
        estadios.add(estadio);
    }

    // Método para generar el fixture
    public List<Partido> generarFixture() {
        List<Partido> fixture = new ArrayList<>();
        Random random = new Random();
        
        for (Grupo grupo : grupos) {
            List<Equipo> equipos = grupo.getEquipos();
            for (int i = 0; i < equipos.size(); i++) {
                for (int j = i + 1; j < equipos.size(); j++) {
                    Estadio estadio = estadios.get(random.nextInt(estadios.size()));
                    Partido partido = new Partido(equipos.get(i), equipos.get(j), estadio);
                    partido.jugarPartido(); // Se juega el partido inmediatamente
                    fixture.add(partido);
                }
            }
        }
        return fixture;
    }  
}
