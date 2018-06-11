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
public class Usuario2 {
    private static Usuario2 instance;
    
    private Usuario2(){}
    
    public static Usuario2 getInstance(){
        if(instance == null){
            instance = new Usuario2();
        }
        return instance;
    }
    
}
