package com.patrones.prototai.domains;

public class Carro extends Vehiculo{
    private String noPuerta;

    public Carro(String matricula, String marca, String line, int modelo, Motor motor, String noPuerta) {
        super(matricula, marca, line, modelo, motor);
        this.noPuerta = noPuerta;
    }
    public Carro(){

    }
    public Carro(String noPuerta) {
        this.noPuerta = noPuerta;
    }

    public String getNoPuerta() {
        return noPuerta;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "noPuerta='" + noPuerta + '\'' +
                '}';
    }

    public void setNoPuerta(String noPuerta) {
        this.noPuerta = noPuerta;
    }
}
