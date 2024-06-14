package entidades;

import java.util.ArrayList;

/**
 * @author Carlos Mogort Brines
 */

public class Equipo {
    private String nombre;
    private ArrayList<Participante> participantes;

    public Equipo(String nombre, ArrayList<Participante> participantes) {
        this.nombre = nombre;
        this.participantes = participantes;
    }

    public void añadirParticipante(Participante p) {
        participantes.add(p);
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + nombre + "\n");
        for (Participante p : participantes){
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
