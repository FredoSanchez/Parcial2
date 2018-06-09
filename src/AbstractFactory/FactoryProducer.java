/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.aztecas.AztecasFactory;
import AbstractFactory.chinos.ChinosFactory;
import AbstractFactory.vikingos.VikingosFactory;

/**
 *
 * @author fredy
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Azteca":
                return new AztecasFactory();
            case "China":
                return new ChinosFactory();
            case "Vikinga":
                return new VikingosFactory();
        }
        return null;
    }
}
