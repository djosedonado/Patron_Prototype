package com.patrones.prototai.domains;

import com.patrones.prototai.domains.prototype.IPrototype;

public class Vehiculo implements IPrototype {
    private String matricula;
    private String marca;
    private String line;
    private int modelo;
    private Motor motor;

    public Vehiculo(String matricula, String marca, String line, int modelo, Motor motor) {
        this.matricula = matricula;
        this.marca = marca;
        this.line = line;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Vehiculo(){

    }

    public Vehiculo(Vehiculo vehiculo){
        this.matricula = vehiculo.getMatricula();
        this.marca = vehiculo.getMarca();
        this.line = vehiculo.getLine();
        this.modelo = vehiculo.getModelo();
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", line='" + line + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public IPrototype clone() {
        Vehiculo vehiculo = new Vehiculo(this);
        vehiculo.setMotor(this.getMotor());
        return vehiculo;
    }

    @Override
    public IPrototype deepClone() {
        Vehiculo vehiculo = new Vehiculo(this);
        vehiculo.setMotor((Motor) this.getMotor().clone());
        return vehiculo;
    }
}
