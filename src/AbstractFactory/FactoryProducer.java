/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.aztecas.AztecasFactory;

/**
 *
 * @author fredy
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Azteca":
                return new AztecasFactory();
        }
        return null;
    }
}
