/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos.construcciones;

import AbstractFactory.chinos.Chino;
import AbstractFactory.chinos.personajes.Milicia;
import AbstractFactory.chinos.vehiculos.Transporte;

/**
 *
 * @author fredy
 */
public class EdificacionesFactory implements Chino{    
    @Override
    public Edificacion getEdificacion(String type){
        switch (type){
            case "castillo":
                return new Castillo();
            case "magia":
                return new CalderoHechizos();
            case "agricultura":
                return new RecolectorAgricultura();
            case "polvora":
                return new FabricaPolvora();
            case "cuartelFu":
                return new CuartelFu();
            case "cuartelTerracota":
                return new CuartelTerracota();
            case "chozaYaogai":
                return new ChozaYaogai();
        }
        return null;
    }
    
    @Override
    public Milicia getMilicia(String type){
        return null;
    }
    
    @Override
    public Transporte getTransporte(String type){
        return null;
    }
    
}
