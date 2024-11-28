/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tower_defense_edd;

/**
 *
 * @author Manu
 */
public class ListaEnLazada {
    private Nodo cabeza;

    private static class Nodo {
        private Tropa data;
        private Nodo next;

        public Nodo(Tropa data) {
            this.data = data;
        }
    }

    public void agregar(Tropa nuevaTropa) {
        Nodo nuevoNodo = new Nodo(nuevaTropa);
        nuevoNodo.next = cabeza;
        cabeza = nuevoNodo;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.data.getTipo() + " - " + actual.data.getPuntosDaño());
            actual = actual.next;
        }
    }
}
