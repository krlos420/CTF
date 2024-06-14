package ctf;

import entidades.Equipo;
import entidades.Especialista;
import entidades.Junior;
import entidades.Participante;
import io.Leer;
import io.NombreDuplicadoException;

import java.util.ArrayList;

/**
 * @author Carlos Mogort Brines
 */

public class Main {
    static ArrayList <Participante> participantesTotales = new ArrayList<>();
    static ArrayList <Equipo> equipos = new ArrayList<>();
    static int numIntentosIni;
    static int puntosRetoFacil;
    static int puntosRetoMedio;
    static int puntosRetoDificil;
    static int rondasMax;
    public static void main(String[] args) {
        boolean av = true;
        while (av = true) {
            System.out.println("CAPTURE THE FLAG");
            System.out.println("--Menu--");
            System.out.println("1. Configurar");
            System.out.println("2. COMPETIR");
            System.out.println("3. Salir");
            int menu = Leer.leerEntero("Que quieres hacer? ");
            if (menu == 1) {
                boolean av2 = true;
                while (av2) {
                    System.out.println("1. Parámetros");
                    System.out.println("2. Gestionar participantes");
                    System.out.println("3. Gestionar equipos");
                    System.out.println("4. Importar datos");
                    System.out.println("5. Exportar datos");
                    System.out.println("6. Salir");
                    int menuC = Leer.leerEntero("Que quieres hacer? ");
                    if (menuC == 1) {
                        numIntentosIni = Leer.leerEntero("Numero de intentos iniciales");
                        puntosRetoFacil = Leer.leerEntero("Puntos reto fácil: ");
                        puntosRetoMedio = Leer.leerEntero("Puntos reto medio: ");
                        puntosRetoDificil = Leer.leerEntero("Puntos reto difícil: ");
                        rondasMax = Leer.leerEntero("Rondas máximas: ");
                    }
                    if (menuC == 2) {
                        System.out.println("1. Listar participantes");
                        System.out.println("2. Dar de alta participantes");
                        System.out.println("3. Dar de baja participantes");
                        System.out.println("4. Asignar participantes a un equipo");
                        int menuG = Leer.leerEntero("Que quieres hacer? ");
                        if (menuG == 1) {

                        }
                        if (menuG == 2) {
                            String volver = "s";
                            do {
                                System.out.println("Tipo de participante");
                                System.out.println("1. entidades.Junior");
                                System.out.println("2. entidades.Especialista");
                                int menuAp = Leer.leerEntero("Que tipo de participante eres? ");
                                if (menuAp == 1) {
                                    Junior j = new Junior();
                                    j.añadirJunior();
                                    try {
                                        j.agregarParticipante(j, participantesTotales);
                                    } catch (NombreDuplicadoException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    volver = Leer.leerTexto("Quieres añadir otro participante? (s/n) ");
                                }
                                if (menuAp == 2) {
                                    Especialista e = new Especialista();
                                    e.añadirEspecialista();
                                    try {
                                        e.agregarParticipante(e, participantesTotales);
                                    } catch (NombreDuplicadoException f) {
                                        System.out.println(f.getMessage());
                                    }
                                    volver = Leer.leerTexto("Quieres añadir otro participante? (s/n) ");
                                }
                            } while (volver.equalsIgnoreCase("s"));
                        }
                        if (menuC == 3) {
                            for (int i = 0; i < participantesTotales.size(); i++) {
                                System.out.println(i + " - " + participantesTotales.get(i));
                            }
                            int baja = Leer.leerEntero("Que participante quieres dar de baja?  ");
                            participantesTotales.remove(baja);
                        }
                        if (menuC == 4) {
                            for (int i = 0; i < participantesTotales.size(); i++) {
                                System.out.println(i + " - " + participantesTotales.get(i));
                            }

                        }
                    }
                    if (menuC == 3) {
                        System.out.println("1. Listar equipos");
                        System.out.println("2. Dar de alta equipos");
                        System.out.println("3. Dar de baja equipos");
                        int menuE = Leer.leerEntero("Que quieres hacer? ");
                        if (menuE == 1) {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(equipos.get(i));
                            }
                        }
                        if (menuE == 2) {
                            String seguir = "s";
                            do {
                                System.out.println("1. Con participantes");
                                System.out.println("2. Sin participantes");
                                int menuEP = Leer.leerEntero("Como quieres dar de alta el equipo? ");
                                if (menuEP == 1) {
                                    ArrayList<Participante> participantesEquipo = new ArrayList<>();
                                    String nombreEquipo = Leer.leerTexto("Nombre del equipo: ");
                                    int numParticipantes = Leer.leerEntero("Cuantos participantes tiene el equipo? ");
                                    for (int i = 0; i < numParticipantes; i++) {
                                        System.out.println("Tipo de participante");
                                        System.out.println("1. Junior");
                                        System.out.println("2. Especialista");
                                        int menuE5 = Leer.leerEntero("Que tipo de participante eres? ");
                                        if (menuE5 == 1) {
                                            Junior j = new Junior();
                                            j.añadirJunior();
                                            try {
                                                j.agregarParticipante(j, participantesTotales);
                                            } catch (NombreDuplicadoException e) {
                                                System.out.println(e.getMessage());
                                            }
                                            participantesEquipo.add(j);
                                        }
                                        if (menuE5 == 2) {
                                            Especialista e = new Especialista();
                                            e.añadirEspecialista();
                                            try {
                                                e.agregarParticipante(e, participantesTotales);
                                            } catch (NombreDuplicadoException f) {
                                                System.out.println(f.getMessage());
                                            }
                                            participantesEquipo.add(e);
                                        }
                                    }
                                    Equipo e = new Equipo(nombreEquipo, participantesEquipo);
                                    equipos.add(e);
                                    System.out.println(e);
                                    seguir = Leer.leerTexto("Quieres añadir otro equipo? (s/n) ");

                                }
                                if (menuEP == 2) {
                                    String nombreEquipo = Leer.leerTexto("Nombre del equipo: ");
                                    Equipo equipo = new Equipo(nombreEquipo);
                                    equipos.add(equipo);
                                    seguir = Leer.leerTexto("Quieres añadir otro equipo? (s/n) ");
                                }
                            } while (seguir.equalsIgnoreCase("s"));
                        }
                        if (menuE == 3) {
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i + " -" + equipos.get(i));
                            }
                            int borrar = Leer.leerEntero("Que equipo quieres borrar? ");
                            equipos.remove(borrar);
                        }

                    }
                    if (menuC == 4) {
                        //importar datos
                    }
                    if (menuC == 5) {
                        //exportar datos
                    }
                    if (menuC == 6) {
                        break;
                    }
                }//tancament while2
            }
            if (menu == 2) {
                //competir
            }
            if (menu == 3) {
                break;
            }


        }//tancament while

    }


    }
