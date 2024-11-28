/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tower_defense_edd;

/**
 *
 * @author Manu
 */
public class Pila {
    private Nodo top; // Elemento superior de la pila

    private static class Nodo {
        private Tropa data;
        private Nodo next;

        public Nodo(Tropa data) {
            this.data = data;
        }
    }

    public void push(Tropa nuevaTropa) {
        Nodo nuevoNodo = new Nodo(nuevaTropa);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }

    public Tropa pop() {
        if (top == null) return null; // Pila vacía
        Tropa data = top.data;
        top = top.next;
        return data;
    }

    public Tropa peek() {
        return (top != null) ? top.data : null;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

