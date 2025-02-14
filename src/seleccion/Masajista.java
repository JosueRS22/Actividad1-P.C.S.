package seleccion;

public class Masajista extends Persona{
    private String profesion;
    private int aniosExperiencia;
          
    /*
     * Regla 4.4 Column limit: 100
     * El código Java tiene un límite de columnas de 100 caracteres. Un "carácter" significa 
     * cualquier punto de código Unicode. 
     */
    public Masajista(int identificador, String nombre, String apellido, int edad, String profesion,
            int aniosExperiencia) {
        super(identificador, nombre, apellido, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesion(){
        return profesion;
    }

    public int getAniosExperiencia(){
        return aniosExperiencia;
    }

    public void darMasaje(){
        System.out.println(" esta dando masaje...");
    }

    @Override
    public void concentrarse() {
        System.out.println(" esta concentrandose en el masaje...");
    }

    @Override
    public void viajar() {
        System.out.println(" esta viajando al juego...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesion: " + profesion + ", Años: " + aniosExperiencia;
    }
}
