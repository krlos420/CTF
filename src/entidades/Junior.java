package entidades;
public class Junior extends Participante{
    private int bonificacion;

    public Junior(String nombre, Equipo equipo, int[] flags, int nintentos, int puntosGanados, int bonificacion) {
        super(nombre, equipo, flags, nintentos, puntosGanados);
        this.bonificacion = bonificacion;
    }

    public Junior() {
    }

    @Override
    public void competirCon(Participante p) {

    }

    @Override
    protected void retado(int idReto) {

    }

}
