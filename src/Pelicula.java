public class Pelicula {

    String nombre;

    int fechaDeLanzamiento;

    int duracionEnMinutos;

    boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("el nombre de la pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
        System.out.println("Incluido en el plan: " + incluidoEnElPlan);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;

    }
    double calcularMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
