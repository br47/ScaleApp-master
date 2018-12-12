package com.example.grupo6.scaleapp;

public class Peso {
    private double peso;
    private int altura;
    private String hora;

    public Peso(){}

    public Peso(double peso, int altura, String hora) {
        this.peso = peso;
        this.altura = altura;
        this.hora = hora;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pesos{" +
                ", peso=" + peso +
                ", altura=" + altura +
                ", hora=" + hora +
                '}';
    }
}
