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
import java.util.ArrayList;

/**
 *
 * @author fredy
 */
public class Menu {

    private static Menu menu;
    public Scanner input = new Scanner(System.in);
    public ArrayList<Object> objetos1= new ArrayList();
    public ArrayList<Object> objetos2= new ArrayList();

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        menu.juego();

    }

    public void juego() {
        String p1Name, p2Name;
        int optn = 4;
        Usuario P1 = new Usuario(), P2 = new Usuario();
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
                switch (optn) {
                    case 1:

                        razaP1 = FactoryProducer.getFactory("Azteca");
                        P1.setRace("Azteca");
                        P1.setRaza(razaP1);
                        break;
                    case 2:
                        razaP1 = FactoryProducer.getFactory("China");
                        P1.setRace("China");
                        P1.setRaza(razaP1);
                        break;
                    case 3:
                        razaP1 = FactoryProducer.getFactory("Vikinga");
                        P1.setRace("Vikinga");
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

        }
        optn = 4;

        System.out.println("----------------------------------------------------------------");
        System.out.print("Ingrese nombre del jugador 2: ");
        //BUG extraño
        p2Name = input.nextLine();
        P2.setNombre(input.next());
        while (optn != 1 && optn != 2 && optn != 3) {
            System.out.println("");
            System.out.println("1. Aztecas.");
            System.out.println("2. Chinos.");
            System.out.println("3. Vikingos.");
            System.out.println("¿Que raza desea elegir?: ");
            try {
                optn = input.nextInt();
                switch (optn) {
                    case 1:
                        razaP2 = FactoryProducer.getFactory("Azteca");
                        P2.setRace("Azteca");
                        P2.setRaza(razaP2);
                        break;
                    case 2:
                        razaP2 = FactoryProducer.getFactory("China");
                        P2.setRace("China");
                        P2.setRaza(razaP2);
                        break;
                    case 3:
                        razaP2 = FactoryProducer.getFactory("Vikinga");
                        P2.setRace("Vikinga");
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

        if (P1.getRace() == "Azteca") {
            menuAzteca(P1);
        }

    }

    public void menuAzteca(Usuario playerA) {
        int optn = 8;

        while (optn != 1 && optn != 2 && optn != 3 && optn != 4 && optn != 5 && optn != 6 && optn != 7) {
            System.out.println("---------------------------------------");
            System.out.println(playerA.getNombre() + " ¿Qué desea hacer?");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Construir Centro de mando");
            System.out.println("2. Construir Choza de guerrero Aguila");
            System.out.println("3. Construir cuartel de guerreros Guecha (defensa)");
            System.out.println("4. Construir cuartel de guerreros Jaguar (ataque)");
            System.out.println("5. Construir recolector de cultivo");
            System.out.println("6. Construir recolector de pesca");
            System.out.println("7. Construir templo de sacrificios");
            try {
                optn = input.nextInt();
                switch (optn) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
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

    public void menuChino() {
        System.out.println("hfjjrtjrtj");
    }

    public void menuVikingo() {
        System.out.println("trewwqx");
    }

}
