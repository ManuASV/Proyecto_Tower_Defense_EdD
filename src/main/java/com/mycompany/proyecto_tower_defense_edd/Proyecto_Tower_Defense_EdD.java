/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_tower_defense_edd;

/**
 * @Profesor Pablo Esteban Gómez Ramírez
 * @author   Manuel Antonio Sánchez Venegas
 *           Ronny Javier Salas León
 *           Tomas Gabriel Duque Garzón 

 */
public class Proyecto_Tower_Defense_EdD {

    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Jugador cpu = new Jugador();

        // Crear caminos
        Cola camino1 = new Cola();
        Cola camino2 = new Cola();

        // Crear tropas para el jugador
        jugador.agregarTropa(new Tropa("Arquero", 1, "Mago", "Caballero"));
        jugador.agregarTropa(new Tropa("Caballero", 2, "Arquero", "Mago"));
        jugador.agregarTropa(new Tropa("Mago", 1.5, "Caballero", "Arquero"));

        // Crear tropas para el CPU
        cpu.agregarTropa(new Tropa("Caballero", 2, "Arquero", "Mago"));
        cpu.agregarTropa(new Tropa("Arquero", 1, "Mago", "Caballero"));
        cpu.agregarTropa(new Tropa("Mago", 1.5, "Caballero", "Arquero"));

        // Simulación de una ronda
        System.out.println("Inicia la batalla en Camino 1");
        camino1.enqueue(jugador.enviarTropa()); // Jugador selecciona una tropa
        camino1.enqueue(cpu.enviarTropaAleatoria()); // CPU selecciona aleatoriamente

        while (!camino1.isEmpty()) {
            Tropa tropaJugador = camino1.dequeue();
            Tropa tropaCPU = camino1.dequeue();

            if (tropaJugador != null && tropaCPU != null) {
                System.out.println("Combate: " + tropaJugador.getTipo() + " vs " + tropaCPU.getTipo());
                // Resolver combate
                if (tropaJugador.getFortaleza().equals(tropaCPU.getTipo())) {
                    System.out.println("El jugador gana el combate.");
                    cpu.recibirDaño(tropaJugador.getPuntosDaño());
                } else if (tropaCPU.getFortaleza().equals(tropaJugador.getTipo())) {
                    System.out.println("El CPU gana el combate.");
                    jugador.recibirDaño(tropaCPU.getPuntosDaño());
                } else {
                    System.out.println("Empate, ambos reciben daño.");
                    cpu.recibirDaño(tropaJugador.getPuntosDaño());
                    jugador.recibirDaño(tropaCPU.getPuntosDaño());
                }
            }
        }

        System.out.println("Puntos del castillo del Jugador: " + jugador.getPuntosCastillo());
        System.out.println("Puntos del castillo del CPU: " + cpu.getPuntosCastillo());
    }
}

