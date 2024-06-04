package entidades;
public class Especialista extends Participante{
    private String especialidad;
    private int penalizacion;

    public Especialista(String nombre, Equipo equipo, int[] flags, int nintentos, int puntosGanados, String especialidad, int penalizacion) {
        super(nombre, equipo, flags, nintentos, puntosGanados);
        this.especialidad = especialidad;
        this.penalizacion = penalizacion;
    }

    public Especialista() {
    }

    @Override
    public void competirCon(Participante p) {

    }

    @Override
    protected void retado(int idReto) {

    }

}
