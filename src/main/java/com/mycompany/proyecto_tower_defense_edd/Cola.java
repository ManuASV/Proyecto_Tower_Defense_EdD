/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tower_defense_edd;

/**
 *
 * @author Manu
 */
public class Cola {
    private Nodo front, rear;

    private static class Nodo {
        private Tropa data;
        private Nodo next;

        public Nodo(Tropa data) {
            this.data = data;
        }
    }

    public void enqueue(Tropa nuevaTropa) {
        Nodo nuevoNodo = new Nodo(nuevaTropa);
        if (rear != null) {
            rear.next = nuevoNodo;
        }
        rear = nuevoNodo;
        if (front == null) {
            front = rear;
        }
    }

    public Tropa dequeue() {
        if (front == null) return null; // Cola vacía
        Tropa data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
