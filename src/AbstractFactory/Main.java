/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.util.Scanner;
import java.util.InputMismatchException;

import AbstractFactory.aztecas.Azteca;
import AbstractFactory.aztecas.construcciones.Construccion;
import AbstractFactory.aztecas.vehiculos.Vehiculo;

import AbstractFactory.chinos.Chino;
import AbstractFactory.chinos.construcciones.Edificacion;

import AbstractFactory.vikingos.Vikingo;
import AbstractFactory.vikingos.construcciones.Building;

/**
 *
 * @author fredy
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p1Name, p2Name, p1Race, p2Race;
        int numFase = 0, optn = 4;
        Usuario P1=new Usuario(),P2=new Usuario();
        AbstractFactory razaP1, razaP2;

        System.out.print("Ingrese nombre del jugador 1: ");
        P1.setNombre(input.nextLine());
        while (optn != 1 && optn != 2 && optn != 3) {
            System.out.println("");
            System.out.println("1. Aztecas.");
            System.out.println("2. Chinos.");
            System.out.println("3. Vikingos.");
            System.out.println("¿Que raza desea elegir?: ");
            try {
                optn = input.nextInt();
                switch(optn){
                    case 1:
                        
                        razaP1 = FactoryProducer.getFactory("Azteca");
                        P1.setRaza(razaP1);
                        break;
                    case 2:
                        razaP1 = FactoryProducer.getFactory("China");
                        P1.setRaza(razaP1);
                        break;
                    case 3:
                        razaP1 = FactoryProducer.getFactory("Vikinga");
                        P1.setRaza(razaP1);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Caracter o caracteres no válidos.");
                input.nextLine();
            }
            
        }optn=4;
        
        System.out.println("----------------------------------------------------------------");
        System.out.print("Ingrese nombre del jugador 2: ");
        //BUG extraño
        p2Name = input.nextLine();
        p2Name = input.next();
        P2.setNombre(p2Name);
        while (optn != 1 && optn != 2 && optn != 3) {
            System.out.println("");
            System.out.println("1. Aztecas.");
            System.out.println("2. Chinos.");
            System.out.println("3. Vikingos.");
            System.out.println("¿Que raza desea elegir?: ");
            try {
                optn = input.nextInt();
                switch(optn){
                    case 1:
                        razaP2 = FactoryProducer.getFactory("Azteca");
                        P2.setRaza(razaP2);
                        break;
                    case 2:
                        razaP2 = FactoryProducer.getFactory("China");
                        P2.setRaza(razaP2);
                        break;
                    case 3:
                        razaP2 = FactoryProducer.getFactory("Vikinga");
                        P2.setRaza(razaP2);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Caracter o caracteres no válidos.");
                input.nextLine();
            }
            
        }
    }
    
}
