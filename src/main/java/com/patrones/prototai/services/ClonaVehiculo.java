package com.patrones.prototai.services;

import com.patrones.prototai.domains.Carro;
import com.patrones.prototai.domains.Moto;
import com.patrones.prototai.domains.Vehiculo;
import com.patrones.prototai.domains.prototype.RegistryPrototype;
import org.springframework.stereotype.Service;

@Service
public class ClonaVehiculo {


    public Vehiculo clonarVehiculo(Vehiculo vehiculo){
        //Vehiculo clon = new Vehiculo(); ya no es necesaria
        /*
        if(vehiculo instanceof Carro){
            Carro carro = new Carro("2");
            carro.setLine(vehiculo.getLine());
            carro.setMotor(vehiculo.getMotor());
            carro.setModelo(vehiculo.getModelo());
            carro.setMarca(vehiculo.getMarca());
            carro.setMatricula(vehiculo.getMatricula());
            carro.setNoPuerta(((Carro)vehiculo).getNoPuerta());
            return  carro;
        }else if(vehiculo instanceof Moto){
            Moto moto = new Moto("2");
            moto.setLine(vehiculo.getLine());
            moto.setMotor(vehiculo.getMotor());
            moto.setModelo(vehiculo.getModelo());
            moto.setMarca(vehiculo.getMarca());
            moto.setMatricula(vehiculo.getMatricula());
            moto.setSuspension(((Moto)vehiculo).getSuspension());
            return  moto;
        }else{
            Vehiculo v = new Vehiculo();
            v.setLine(vehiculo.getLine());
            v.setMotor(vehiculo.getMotor());
            v.setModelo(vehiculo.getModelo());
            v.setMarca(vehiculo.getMarca());
            v.setMatricula(vehiculo.getMatricula());
            return v;
        }
         */
        return RegistryPrototype.GetPrototipo(vehiculo.getMatricula());
    }
}
