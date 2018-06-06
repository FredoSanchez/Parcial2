/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas;

import AbstractFactory.AbstractFactory;
import AbstractFactory.aztecas.construcciones.ConstruccionesFactory;

/**
 *
 * @author fredy
 */
public class AztecasFactory implements AbstractFactory {

    @Override
    public Azteca getRazaAzteca(String type) {
       switch (type) {
            case "construccion":
                return new ConstruccionesFactory();
        }
        return null;
    }
}
