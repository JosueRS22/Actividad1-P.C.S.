package seleccion;
    /* 
     * Regla 3.4.1 Exactly one top-level class declaration
     * Cada clase de nivel superior reside en un archivo fuente propio.
     * Regla 4.8.2.1 One variable per declaration
     * Cada declaración de variable (de campo o local) declara sólo una variable: 
     * declaraciones como int a, b; no se utilizan. A excepción de variables en bucles for.
     */
public abstract class Persona {
    private int identificador;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int identificador, String nombre, String apellido, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void viajar();

    public abstract void concentrarse();
}