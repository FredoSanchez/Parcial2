/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos;

import AbstractFactory.chinos.construcciones.Edificacion;
import AbstractFactory.chinos.personajes.Milicia;
import AbstractFactory.chinos.vehiculos.Transporte;

/**
 *
 * @author fredy
 */
public interface Chino {
    Edificacion getEdificacion(String type);
    Milicia getMilicia(String type);
    Transporte getTransporte(String type);
}
