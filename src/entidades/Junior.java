package entidades;

import io.Leer;

public class Junior extends Participante{
    private int bonificacion;

    public Junior(String nombre, Equipo equipo, int[] flags, int nintentos, int puntosGanados, int bonificacion) {
        super(nombre, equipo, flags, nintentos, puntosGanados);
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
    protected void retado(int idReto) {

    }
    public Junior añadirJunior(){
        String nombre = Leer.leerTexto("Nombre: ");
        int bonificacion = Leer.leerEntero("Cuantos puntos extra ganaras por retos medios o dificiles? ");
        Junior junior = new Junior(nombre, bonificacion);
        return junior;
    }

}
