package entidades;

import io.Leer;
import io.NombreDuplicadoException;

import java.util.ArrayList;
/**
 * @author Carlos Mogort Brines
 */

public abstract class Participante {
    private String nombre;
    private int puntosGanados;
    private int[] flags;
    private int nintentos;
    private Equipo equipo;

    public Participante(String nombre, Equipo equipo, int[] flags, int nintentos, int puntosGanados) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.flags = flags;
        this.nintentos = nintentos;
        this.puntosGanados = puntosGanados;
    }

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public Participante(String nombre, Equipo equipo, int[] flags, int puntosGanados) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.flags = flags;
        this.puntosGanados = puntosGanados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Participante() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public int[] getFlags() {
        return flags;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public int getNintentos() {
        return nintentos;
    }

    public void setNintentos(int nintentos) {
        this.nintentos = nintentos;
    }

    @Override
    public String toString() {
        return "- "+getNombre()+" PG: "+getPuntosGanados()+" / NF: "+getFlags()+" / NI: "+getNintentos();
    }
    public abstract void compiteCon(Participante p);
    protected abstract void retado(int idReto);
    public static void agregarParticipante(Participante p, ArrayList<Participante> participantes) throws NombreDuplicadoException {
        if (participantes.isEmpty()){
            participantes.add(p);
        } else {
            for (Participante participante : participantes) {
                if (participante.getNombre().equals(p.getNombre())) {
                    throw new NombreDuplicadoException("El nombre ya existe");
                }
            }
            participantes.add(p);
        }
    }
    public static void agregarParticipanteConNombreUnico(Participante p, ArrayList<Participante> participantes) {
        boolean agregado = false;
        while (!agregado) {
            try{
                agregarParticipante(p,participantes);
                agregado = true;
            } catch (NombreDuplicadoException e) {
                System.out.println(e.getMessage());
                String nouNom = Leer.leerTexto("Introduce un nuevo nombre: ");
                p.setNombre(nouNom);
            }
        }
    }
}
