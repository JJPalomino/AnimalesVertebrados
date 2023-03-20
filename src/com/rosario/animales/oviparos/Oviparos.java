package com.rosario.animales.oviparos;

import com.rosario.animales.Animal;

public class Oviparos extends Animal {
    int cantidadHuevos;
    String tipoFecundacion;

    public Oviparos() {
    }

    public Oviparos(int cantidadHuevos, String tipoFecundacion) {
        this.cantidadHuevos = cantidadHuevos;
        this.tipoFecundacion = tipoFecundacion;
    }

    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public String getTipoFecundacion() {
        return tipoFecundacion;
    }

    public void setTipoFecundacion(String tipoFecundacion) {
        this.tipoFecundacion = tipoFecundacion;
    }
}
