package com.patrones.prototai.domains;

import com.patrones.prototai.domains.prototype.IPrototype;

public class Motor implements IPrototype {
    private double cilindraje;
    private String tecnologia;

    public Motor(double cilindraje, String tecnologia) {
        this.cilindraje = cilindraje;
        this.tecnologia = tecnologia;
    }

    public Motor (Motor motor){
        this.cilindraje = motor.cilindraje;
        this.tecnologia = motor.tecnologia;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public IPrototype clone() {
        return new Motor(this);
    }

    @Override
    public IPrototype deepClone() {
        return this.deepClone();
    }
}
