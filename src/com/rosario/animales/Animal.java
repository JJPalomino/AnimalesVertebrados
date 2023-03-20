package com.rosario.animales;

public class Animal {

    String nombre,metodoReproduccion,peso,color,habitad,desplazamiento,alimentacion;
    float tamanio;
    int numeroPatas,numeroOjos;

    public Animal() {
    }

    public Animal(String nombre, String metodoReproduccion, String peso, String color, String habitad,
                  String desplazamiento, String alimentacion, float tamanio, int numeroPatas, int numeroOjos) {
        this.nombre = nombre;
        this.metodoReproduccion = metodoReproduccion;
        this.peso = peso;
        this.color = color;
        this.habitad = habitad;
        this.desplazamiento = desplazamiento;
        this.alimentacion = alimentacion;
        this.tamanio = tamanio;
        this.numeroPatas = numeroPatas;
        this.numeroOjos = numeroOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMetodoReproduccion() {
        return metodoReproduccion;
    }

    public void setMetodoReproduccion(String metodoReproduccion) {
        this.metodoReproduccion = metodoReproduccion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroOjos() {
        return numeroOjos;
    }

    public void setNumeroOjos(int numeroOjos) {
        this.numeroOjos = numeroOjos;
    }
}
