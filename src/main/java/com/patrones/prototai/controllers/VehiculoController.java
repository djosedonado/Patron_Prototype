package com.patrones.prototai.controllers;

import com.patrones.prototai.domains.Motor;
import com.patrones.prototai.domains.Vehiculo;
import com.patrones.prototai.domains.prototype.RegistryPrototype;
import com.patrones.prototai.services.ClonaVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private ClonaVehiculo service;

    @GetMapping
    public Vehiculo getVehiculo() {
        Vehiculo orginal = new Vehiculo("f42s5d","yundai","vega18",2051,new Motor(1820,"electrico"));
        RegistryPrototype.AddPrototype(orginal);
        Vehiculo copia = service.clonarVehiculo(orginal);
        copia.getMotor().setCilindraje(5000);

        return orginal;
    }
}
