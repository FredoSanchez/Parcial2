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
public class Usuario1 {
    private static Usuario1 instance;
    
    private Usuario1(){}
    
    public static Usuario1 getInstance(){
        if(instance == null){
            instance = new Usuario1();
        }
        return instance;
    }
    
}
