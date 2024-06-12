package entidades;

import io.Leer;

public class Especialista extends Participante{
    private String especialidad;
    private int penalizacion;

    public Especialista(String nombre, Equipo equipo, int[] flags, int nintentos, int puntosGanados, String especialidad, int penalizacion) {
        super(nombre, equipo, flags, nintentos, puntosGanados);
        this.especialidad = especialidad;
        this.penalizacion = penalizacion;
    }

    public Especialista(String nombre, String especialidad, int penalizacion) {
        super(nombre);
        this.especialidad = especialidad;
        this.penalizacion = penalizacion;
    }

    public Especialista() {
    }

    @Override
    public void compiteCon(Participante p) {

    }

    @Override
    protected void retado(int idReto) {

    }
    public Especialista añadirEspecialista(){
        String nombre = Leer.leerTexto("Nombre: ");
        int penalizacion = Leer.leerEntero("Penalizacion por fallo: ");
        String especialidad = Leer.leerTexto("Especialidad: ");
        Especialista e = new Especialista(nombre, especialidad, penalizacion);
        return e;
    }

}
