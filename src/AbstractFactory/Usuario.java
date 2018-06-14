/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author fredy
 */
public class Usuario {
    private String nombre, race;
    private AbstractFactory Raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AbstractFactory getRaza() {
        return Raza;
    }

    public void setRaza(AbstractFactory Raza) {
        this.Raza = Raza;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    

    public Usuario() {
    }
    
}
