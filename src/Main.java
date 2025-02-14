import seleccion.*;

public class Main {
    public static void main(String[] args) throws Exception {
    /* 
     * Regla 4.3 One statement per line
     * Cada afirmación va seguida de un salto de línea.
     */
        Futbolista futbolista1 = new Futbolista(001,"Rodrigo","Huescas", 21, 19, "Lateral");

        Entrenador entrenador1 = new Entrenador(002,"Javier","Aguirre",66, 20);

        Masajista masajista1 = new Masajista(003,"Luis", "Rosas", 40, "Fisioterapeuta", 7);

        System.out.println(futbolista1.toString());
        System.out.print(futbolista1.getNombre());
        futbolista1.jugarPartido();

        System.out.println(entrenador1.toString());
        System.out.print(entrenador1.getApellido());
        entrenador1.dirigirPartido();

        System.out.println(masajista1.toString());
        System.out.print("El " + masajista1.getProfesion());
        masajista1.darMasaje();
    }
}
