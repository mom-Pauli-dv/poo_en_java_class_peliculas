package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int totalDeLasEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("el nombre de la pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Incluido en el plan: " + incluidoEnElPlan);
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;

    }
    public double calcularMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
