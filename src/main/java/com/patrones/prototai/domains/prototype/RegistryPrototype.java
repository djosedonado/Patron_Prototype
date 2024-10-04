package com.patrones.prototai.domains.prototype;

import com.patrones.prototai.domains.Vehiculo;

import java.util.HashMap;
import java.util.Map;

public class RegistryPrototype {

    private static Map<String,IPrototype> prototypeMap = new HashMap<>();

    public static void  AddPrototype(Vehiculo vehiculo) {
        prototypeMap.put(vehiculo.getMatricula(),vehiculo);
    }

    public static Vehiculo GetPrototipo(String matricula) {
        return (Vehiculo) prototypeMap.get(matricula).clone();
    }

}
