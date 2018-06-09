/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.aztecas.AztecasFactory;
import AbstractFactory.aztecas.construcciones.Construccion;
import AbstractFactory.aztecas.Azteca;
import AbstractFactory.aztecas.personajes.Personaje;
import AbstractFactory.aztecas.vehiculos.Vehiculo;

import AbstractFactory.chinos.Chino;
import AbstractFactory.chinos.construcciones.Edificacion;

/**
 *
 * @author fredy
 */
public class Main {
    public static void main(String[] args){
        AbstractFactory raza;
        
        raza = FactoryProducer.getFactory("China");
        Chino item = raza.getRazaChina("edificacion");
        Edificacion tipo = item.getEdificacion("castillo");
        tipo.labor();
        
    }
}
