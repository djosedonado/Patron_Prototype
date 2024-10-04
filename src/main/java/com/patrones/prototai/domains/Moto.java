package com.patrones.prototai.domains;

public class Moto extends Vehiculo{
    private String suspension;

    public Moto(String matricula, String marca, String line, int modelo, Motor motor, String suspension) {
        super(matricula, marca, line, modelo, motor);
        this.suspension = suspension;
    }
    public Moto(){

    }

    public Moto(String suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "suspension='" + suspension + '\'' +
                '}';
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
}
