/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tower_defense_edd;
import java.util.Random;
/**
 *
 * @author Manu
 */
public class Jugador {
    private int puntosCastillo = 10; // Vida inicial del castillo
    private Pila tropasDisponibles; // Pila de tropas para organizar

    public Jugador() {
        this.tropasDisponibles = new Pila(); // Implementar la clase Pila
    }

    public int getPuntosCastillo() { return puntosCastillo; }
    
    public void recibirDaño(double daño) {
        puntosCastillo -= daño;
        if (puntosCastillo < 0) puntosCastillo = 0;
    }
    
    public void agregarTropa(Tropa tropa) {
        tropasDisponibles.push(tropa);
    }

    public Tropa enviarTropa() {
        if (!tropasDisponibles.isEmpty()) {
            return tropasDisponibles.pop();
        }
        return null; // Sin tropas disponibles
    }

    public Tropa enviarTropaAleatoria() {
        if (!tropasDisponibles.isEmpty()) {
            // Selección aleatoria de una tropa
            Random random = new Random();
            int index = random.nextInt(3); // Considera máximo 3 tropas disponibles
            Tropa tropaSeleccionada = null;

            for (int i = 0; i <= index && !tropasDisponibles.isEmpty(); i++) {
                tropaSeleccionada = tropasDisponibles.pop();
            }
            return tropaSeleccionada;
        }
        return null; // Sin tropas disponibles
    }
}

