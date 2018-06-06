/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.aztecas.AztecasFactory;
import AbstractFactory.aztecas.construcciones.Construccion;
import AbstractFactory.aztecas.Azteca;

/**
 *
 * @author fredy
 */
public class Main {
    public static void main(String[] args){
        AbstractFactory raza;
        
        raza = FactoryProducer.getFactory("Azteca");
        Azteca item = raza.getRazaAzteca("construccion");
        Construccion tipo = item.getConstruccion("Sacrificio");
        tipo.labor();
        
    }
}
