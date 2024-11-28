/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tower_defense_edd;

/**
 *
 * @author Manu
 */
public class Tropa {

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPuntosDaño() {
        return puntosDaño;
    }

    public void setPuntosDaño(double puntosDaño) {
        this.puntosDaño = puntosDaño;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(String fortaleza) {
        this.fortaleza = fortaleza;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Tropa(String tipo, double puntosDaño, String fortaleza, String debilidad) {
        this.tipo = tipo;
        this.puntosDaño = puntosDaño;
        this.fortaleza = fortaleza;
        this.debilidad = debilidad;
    }
    private String tipo; // Arquero, Mago, Caballero
    private double puntosDaño;
    private String fortaleza; // Contra qué es fuerte
    private String debilidad; // Contra qué es débil
}
