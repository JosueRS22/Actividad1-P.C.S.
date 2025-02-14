package seleccion;

public class Entrenador extends Persona {
    /*
     * Regla 5.2.7 Local variable names
     * Los nombres de las variables locales se escriben en lowerCamelCase.
     */
    private int idFederacion;

    public Entrenador(int identificador, String nombre, String apellido, int edad, int idFederacion) {
        super(identificador, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion(){
        return idFederacion;
    }
    
    public void dirigirPartido(){
        System.out.println(" esta dirigiendo el partido...");
    }

    public void dirigirEntrenamiento(){
        System.out.println(" esta dirigiendo el entrenamiento...");
    }

    @Override
    public void concentrarse() {
        System.out.println(" esta concentrandose en el entrenamiento...");
    }

    @Override
    public void viajar() {
        System.out.println(" esta viajando al juego...");
    }

    @Override
    public String toString() {
        return super.toString() + ", ID Federacion: " + idFederacion;
    }
}
