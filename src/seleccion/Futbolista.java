package seleccion;

/* 
 *Regla 5.2.2 Class names
 * El nombre de una clase debe utilizar notacion UpperCamelCase
 */
public class Futbolista extends Persona {
    private int numeroJugador;
    private String posicionEnCancha;

    public Futbolista(int identificador, String nombre, String apellido, int edad, int numeroJugador,
            String posicionEnCancha) {
        super(identificador, nombre, apellido, edad);
        this.numeroJugador = numeroJugador;
        this.posicionEnCancha = posicionEnCancha;
    }

    public int getNumeroJugador(){
        return numeroJugador;
    }

    public String getPosicionEnCancha(){
        return posicionEnCancha;
    }


    public void jugarPartido(){
        System.out.println(" esta jugando...");
    }

    public void entrenar(){
        System.out.println(" esta entrenando...");
    }

    @Override
    public void concentrarse() {
        System.out.println(" esta concentrado en el juego...");
    }

    @Override
    public void viajar() {
        System.out.println(" esta viajando al juego...");
    }

    @Override
    public String toString() {
        return super.toString() + " , Dorsal: " + numeroJugador + ", Posición: " + posicionEnCancha;
    }

}
