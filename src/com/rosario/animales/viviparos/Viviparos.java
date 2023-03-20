package com.rosario.animales.viviparos;

import com.rosario.animales.Animal;

public class Viviparos extends Animal {
    int numeroHijos;

    public Viviparos() {
    }

    public Viviparos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
}
