/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.construcciones;

import AbstractFactory.aztecas.Azteca;
import AbstractFactory.aztecas.personajes.Personaje;
import AbstractFactory.aztecas.vehiculos.Vehiculo;

/**
 *
 * @author fredy
 */
public class ConstruccionesFactory implements Azteca{    
    @Override
    public Construccion getConstruccion(String type){
        switch (type){
            case "mando":
                return new CentroMando();
            case "sacrificio":
                return new TemploSacrificios();
            case "cultivo":
                return new RecolectorCultivo();
            case "pesca":
                return new RecolectorPesca();
            case "cuartelGuecha":
                return new CuartelGuecha();
            case "cuartelJaguares":
                return new CuartelJaguares();
            case "chozaAguila":
                return new ChozaAguila();
        }
        return null;
    }
    
    @Override
    public Personaje getPersonaje(String type){
        return null;
    }
    
    @Override
    public Vehiculo getVehiculo(String type){
        return null;
    }
    
}
