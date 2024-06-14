package entidades;

import io.Leer;

/**
 * @author Carlos Mogort Brines
 */

public class Junior extends Participante{
    private int bonificacion;

    public Junior(String nombre, Equipo equipo, int[] flags, int puntosGanados, int bonificacion) {
        super(nombre, equipo, flags, puntosGanados);
        setNintentos(Math.min(getNintentos(), 30));
        this.bonificacion = bonificacion;
    }

    public Junior(String nombre, int bonificacion) {
        super(nombre);
        this.bonificacion = bonificacion;
    }

    public Junior() {
    }

    @Override
    public void compiteCon(Participante p) {

    }
    @Override
    public void setNintentos(int nintentos){
        super.setNintentos(Math.min(nintentos, 30));
    }

    @Override
    protected void retado(int idReto) {

    }
    public Junior añadirJunior(){
        String nombre = Leer.leerTexto("Nombre: ");
        int bonificacion = Leer.leerEntero("Cuantos puntos extra ganaras por retos medios o dificiles? ");
        Junior junior = new Junior(nombre, bonificacion);
        return junior;
    }

}
