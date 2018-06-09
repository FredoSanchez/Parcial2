/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.aztecas.Azteca;
import AbstractFactory.chinos.Chino;
import AbstractFactory.vikingos.Vikingo;

/**
 *
 * @author fredy
 */
public interface AbstractFactory {
    Azteca getRazaAzteca(String raza);
    Chino getRazaChina(String type);
    Vikingo getRazaVikinga(String type);
}
