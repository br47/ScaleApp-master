package com.example.grupo6.scaleapp;

public interface Pesos {
    Peso elemento(int id); //Devuelve el elemento dado su id
    void anyade(Peso peso); //Añade el elemento indicado
    int nuevo(); //Añade un elemento en blanco y devuelve su id
    void borrar(int id); //Elimina el elemento con el id indicado
    int tamanyo(); //Devuelve el número de elementos
    void actualiza(int id, Peso peso); //Reemplaza un elemento
}
