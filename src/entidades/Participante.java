package entidades;
import io.NombreDuplicadoException;
import ctf.Main;
import ctf.Main.*;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        return "- "+getNombre()+" PG: "+getPuntosGanados()+" / NF: "+getFlags()+" / NI: "+getNintentos();
    }
    public abstract void compiteCon(Participante p);
    protected abstract void retado(int idReto);
    public void agregarParticipante(Participante p, ArrayList<Participante> participantes) throws NombreDuplicadoException {
        for (Participante participante: participantes){
            if (participante.getNombre().equals(p.getNombre())){
                throw new NombreDuplicadoException("El nombre ya existe");
            }
        }
        participantes.add(p);
    };
}
