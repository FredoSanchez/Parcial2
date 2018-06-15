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
import java.util.Iterator;

/**
 *
 * @author fredy
 */
public class Menu {

    private static Menu menu;
    public Scanner input = new Scanner(System.in);
    public int numFase;
    boolean gameOver = false;
    public ArrayList<Object> objetos1 = new ArrayList();
    public ArrayList<Object> objetos2 = new ArrayList();

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
                        Azteca itemA = P1.getRaza().getFromRazaAzteca("construccion");
                        Construccion tipoA = itemA.getConstruccion("mando");
                        tipoA.setVida(5000);
                        objetos1.add(tipoA);

                        break;
                    case 2:
                        razaP1 = FactoryProducer.getFactory("China");
                        P1.setRace("China");
                        P1.setRaza(razaP1);
                        Chino itemC = P1.getRaza().getFromRazaChina("edificacion");
                        Edificacion tipoC = itemC.getEdificacion("castillo");
                        objetos1.add(tipoC);
                        break;
                    case 3:
                        razaP1 = FactoryProducer.getFactory("Vikinga");
                        P1.setRace("Vikinga");
                        P1.setRaza(razaP1);
                        Vikingo itemV = P1.getRaza().getFromRazaVikinga("building");
                        Building tipoV = itemV.getBuilding("godhaus");
                        objetos1.add(tipoV);
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
                        Azteca itemA = P2.getRaza().getFromRazaAzteca("construccion");
                        Construccion tipoA = itemA.getConstruccion("mando");
                        tipoA.setVida(5000);
                        objetos2.add(tipoA);
                        break;
                    case 2:
                        razaP2 = FactoryProducer.getFactory("China");
                        P2.setRace("China");
                        P2.setRaza(razaP2);
                        Chino itemC = P2.getRaza().getFromRazaChina("edificacion");
                        Edificacion tipoC = itemC.getEdificacion("castillo");
                        objetos2.add(tipoC);
                        break;
                    case 3:
                        razaP2 = FactoryProducer.getFactory("Vikinga");
                        P2.setRace("Vikinga");
                        P2.setRaza(razaP2);
                        Vikingo itemV = P2.getRaza().getFromRazaVikinga("building");
                        Building tipoV = itemV.getBuilding("godhaus");
                        objetos2.add(tipoV);
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

        while (!gameOver) {
            System.out.println("---------------------------------------");
            System.out.println("----------------FASE " + (numFase + 1) + "-----------------");
            System.out.println("---------------------------------------");
            switch (P1.getRace()) {
                case "Azteca":
                    menuAzteca(P1, objetos1, P2, objetos2);
                    break;
                case "China":
                    menuChino(P1, objetos1);
                    break;
                case "Vikinga":
                    menuVikingo(P1, objetos1);
                    break;
            }
            switch (P2.getRace()) {
                case "Azteca":
                    menuAzteca(P2, objetos2, P1, objetos1);
                    break;
                case "China":
                    menuChino(P2, objetos2);
                    break;
                case "Vikinga":
                    menuVikingo(P2, objetos2);
                    break;
            }
            numFase += 1;

        }

    }

    public void menuAzteca(Usuario playerA, ArrayList listaA, Usuario playerX, ArrayList listaX) {
        int optn = 11;
        while (optn != 9) {
            System.out.println("---------------------------------------");
            System.out.println(playerA.getNombre() + " ¿Qué desea hacer?");
            System.out.println("1. Construir Choza de guerrero Aguila");
            System.out.println("2. Construir cuartel de guerreros Guecha (defensa)");
            System.out.println("3. Construir cuartel de guerreros Jaguar (ataque)");
            System.out.println("4. Construir recolector de cultivo");
            System.out.println("5. Construir recolector de pesca");
            System.out.println("6. Construir templo de sacrificios");
            System.out.println("7. Mostrar construcciones");
            System.out.println("8. Atacar a "+playerX.getNombre());
            System.out.println("9. Terminar turno");
            try {
                optn = input.nextInt();
                switch (optn) {
                    case 1:
                        Azteca item = playerA.getRaza().getFromRazaAzteca("construccion");
                        Construccion tipo = item.getConstruccion("chozaAguila");
                        tipo.setVida(500);
                        listaA.add(tipo);
                        tipo.labor();
                        break;
                    case 2:
                        item = playerA.getRaza().getFromRazaAzteca("construccion");
                        tipo = item.getConstruccion("cuartelGuecha");
                        tipo.setVida(600);
                        listaA.add(tipo);
                        tipo.labor();
                        break;
                    case 3:
                        item = playerA.getRaza().getFromRazaAzteca("construccion");
                        tipo = item.getConstruccion("cuartelJaguares");
                        tipo.setVida(600);
                        listaA.add(tipo);
                        tipo.labor();
                        break;
                    case 4:
                        item = playerA.getRaza().getFromRazaAzteca("construccion");
                        tipo = item.getConstruccion("cultivo");
                        tipo.setVida(600);
                        listaA.add(tipo);
                        tipo.labor();
                        break;
                    case 5:
                        item = playerA.getRaza().getFromRazaAzteca("construccion");
                        tipo = item.getConstruccion("pesca");
                        tipo.setVida(600);
                        listaA.add(tipo);
                        tipo.labor();
                        break;
                    case 6:
                        item = playerA.getRaza().getFromRazaAzteca("construccion");
                        tipo = item.getConstruccion("sacrificio");
                        tipo.setVida(600);
                        listaA.add(tipo);
                        tipo.labor();
                        break;
                    case 7:
                        System.out.println("----------------------------------");
                        System.out.println("Contruciones:");
                        int contador = 1;
                        for (Iterator<Construccion> iter = listaA.iterator(); iter.hasNext();) {
                            Construccion construccion = iter.next();
                            System.out.println(contador+". "+construccion.getNombre());
                            contador++;
                        }

                        break;
                    case 8:
                        break;
                    case 9:
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

    public void menuChino(Usuario playerC, ArrayList listaC) {
        int optn = 10;
        while (optn != 8) {
            System.out.println("---------------------------------------");
            System.out.println(playerC.getNombre() + " ¿Qué desea hacer?");
            System.out.println("1. Construir Choza de guerrero Yaogai");
            System.out.println("2. Construir cuartel de Leones Fu (defensa)");
            System.out.println("3. Construir cuartel de Soldados de Terracota (ataque)");
            System.out.println("4. Construir recolector de agricultura");
            System.out.println("5. Construir fabrica de polvora");
            System.out.println("6. Construir caldero de hechizos");
            System.out.println("7. Mostrar construcciones");
            System.out.println("8. Terminar turno");
            try {
                optn = input.nextInt();
                switch (optn) {
                    case 1:
                        Chino item = playerC.getRaza().getFromRazaChina("edificacion");
                        Edificacion tipo = item.getEdificacion("chozaYaogai");
                        listaC.add(tipo);
                        tipo.labor();
                        break;
                    case 2:
                        item = playerC.getRaza().getFromRazaChina("edificacion");
                        tipo = item.getEdificacion("cuartelFu");
                        listaC.add(tipo);
                        tipo.labor();
                        break;
                    case 3:
                        item = playerC.getRaza().getFromRazaChina("edificacion");
                        tipo = item.getEdificacion("cuartelTerracota");
                        listaC.add(tipo);
                        tipo.labor();
                        break;
                    case 4:
                        item = playerC.getRaza().getFromRazaChina("edificacion");
                        tipo = item.getEdificacion("agricultura");
                        listaC.add(tipo);
                        tipo.labor();
                        break;
                    case 5:
                        item = playerC.getRaza().getFromRazaChina("edificacion");
                        tipo = item.getEdificacion("polvora");
                        listaC.add(tipo);
                        tipo.labor();
                        break;
                    case 6:
                        item = playerC.getRaza().getFromRazaChina("edificacion");
                        tipo = item.getEdificacion("magia");
                        listaC.add(tipo);
                        tipo.labor();
                        break;
                    case 7:
                        int contador = 1;
                        System.out.println("----------------------------------");
                        System.out.println("Contruciones:");
                        for (Iterator<Edificacion> iter = listaC.iterator(); iter.hasNext();) {
                            Edificacion edificacion = iter.next();
                            System.out.println(contador+". "+edificacion.getNombre());
                            contador++;
                        }
                        break;
                    case 8:
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

    public void menuVikingo(Usuario playerV, ArrayList listaV) {
        int optn = 10;
        while (optn != 8) {
            System.out.println("---------------------------------------");
            System.out.println(playerV.getNombre() + " ¿Qué desea hacer?");
            System.out.println("1. Construir Choza de Gigante");
            System.out.println("2. Construir cuartel de valquirias (defensa)");
            System.out.println("3. Construir cuartel de barbaros (ataque)");
            System.out.println("4. Construir carniceria");
            System.out.println("5. Construir herrera");
            System.out.println("6. Construir recolector de maná");
            System.out.println("7. Mostrar construcciones");
            System.out.println("8. Terminar turno");
            try {
                optn = input.nextInt();
                switch (optn) {
                    case 1:

                        Vikingo item = playerV.getRaza().getFromRazaVikinga("building");
                        Building tipo = item.getBuilding("chozaGigante");
                        listaV.add(tipo);
                        tipo.labor();
                        break;
                    case 2:
                        item = playerV.getRaza().getFromRazaVikinga("building");
                        tipo = item.getBuilding("cuartelValquirias");
                        listaV.add(tipo);
                        tipo.labor();
                        break;
                    case 3:
                        item = playerV.getRaza().getFromRazaVikinga("building");
                        tipo = item.getBuilding("cuartelBarbaros");
                        listaV.add(tipo);
                        tipo.labor();
                        break;
                    case 4:
                        item = playerV.getRaza().getFromRazaVikinga("building");
                        tipo = item.getBuilding("carne");
                        listaV.add(tipo);
                        tipo.labor();
                        break;
                    case 5:
                        item = playerV.getRaza().getFromRazaVikinga("building");
                        tipo = item.getBuilding("herreria");
                        listaV.add(tipo);
                        tipo.labor();
                        break;
                    case 6:
                        item = playerV.getRaza().getFromRazaVikinga("building");
                        tipo = item.getBuilding("mana");
                        listaV.add(tipo);
                        tipo.labor();
                        break;
                    case 7:
                        System.out.println("----------------------------------");
                        System.out.println("Contruciones:");
                        int contador = 1;
                        for (Iterator<Building> iter = listaV.iterator(); iter.hasNext();) {
                            Building building = iter.next();
                            System.out.println(contador+". "+building.getNombre());
                            contador++;
                        }
                        break;
                    case 8:
                        
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
