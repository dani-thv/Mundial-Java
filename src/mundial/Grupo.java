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
public class Grupo {
    private String nombre;
    private List<Equipo> equipos;

    // Constructor
    public Grupo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    // Método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar equipo al grupo
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Método para mostrar la información del grupo
    public String mostrarInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Grupo: ").append(nombre).append(", Equipos: ");
        for (int i = 0; i < equipos.size(); i++) {
            info.append(equipos.get(i).getNombre());
            if (i < equipos.size() - 1) {
                info.append(", ");
            }
        }
        return info.toString();
    }    
}
