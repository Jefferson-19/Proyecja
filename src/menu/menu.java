/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import donaciones.donacion;
import donaciones.donacioncomestibles;
import donaciones.donacioneconomica;
import donaciones.donacionjuguetes;
import donante.donante;
import java.util.Scanner;
import operaciones.operaciones;

/**
 *
 * @author ventas
 */
public class menu {
     Scanner sc = new Scanner(System.in); 
       String dife;
       int opcion;
       int op;
       int va;
       operaciones accion = new operaciones();
       public void menu_d(){
         donante donant = new donante("Darth", "Vader", "0950150169"); 
           accion.Agg_Donante(donant);
       do{
        do{
            try{//validar si son numeros del menu
                va=0;
            
         
           System.out.println("\n     BIENVENIDOS AL MENU    ");
            System.out.println("1. Registar donante");
            System.out.println("2. Registrar donacion");
             System.out.println("3. Lista Donante");
            System.out.println("4. Busquedas: donante/donacion ");
            System.out.println("5. Monto total donacion economica ");
             System.out.println("6. Salir");
             System.out.println("Digite una de las opciones");
           opcion=sc.nextInt();
            
            switch(opcion){
                case 1:{
                        do{
                        donante don = new donante();
                        don.Ingresar();
                        accion.Agg_Donante(don);
                        sc.nextLine();
                        System.out.print("\n¿Desea ingresar otro registro? (S/N)");
                        dife = sc.nextLine();
                        }while (dife.equals("S") || dife.equals("s"));
                     break;
                } 
                case 2:{
                    accion.mostrarListaDon();
                    
               
                    String ced;
                  System.out.print("Ingrese el numero de cedula del donante a buscar: ");
                  sc.nextLine();
                  ced= sc.nextLine();
                  accion.buscardonante(ced);
                    
                    System.out.println("\nTIPOS DE DONACIONES ");
                    System.out.println("1. DONACION ECONOMICA");
                    System.out.println("2. DONACION DE COMESTIBLES");
                    System.out.println("3. DONACION DE JUGUETES");
                    do{
                    System.out.print("\n Escoja el tipo de donacion a donar: ");
                    op=sc.nextInt(); 
                    }while(op<1 || opcion>3);
                    
                    switch(op){
                    case 1:{
                           
                            donacion dn= new donacioneconomica();
                            dn.Ingresar();
                           
                            dn.setDonante(accion.getDonante());
                            accion.Agg_Donacion(dn);
                            System.out.println(dn.toString());
                            sc.nextLine();
                    break;
                    } 
                    case 2:{
                            donacion dn= new donacioncomestibles();
                            dn.Ingresar();
                            dn.setDonante(accion.getDonante());
                            accion.Agg_Donacion(dn);
                            System.out.println(dn.toString());
                            sc.nextLine();
                    break;
                    }
                    case 3:{
                            donacion dn= new donacionjuguetes();
                            dn.Ingresar();
                            dn.setDonante(accion.getDonante());
                            accion.Agg_Donacion(dn);
                            System.out.println(dn.toString());
                            sc.nextLine();
                    break;
                    }
                    default:
                    System.out.println("Seleccione una opcion existente");
                    break;
                    }          
                break;
                }
                case 3:{
                  
                    accion.mostrar_datos();
                   break;
        
                }
                case 4:{      
         System.out.println("\n     Solicite la busqueda que desea ");
            System.out.println("1. Busqueda de donante");
            System.out.println("2. Busqueda de donacion");
            do{
op=sc.nextInt();
            }while(op<1 || op>2);

            switch(op){
            case 1:{
               
                String ced;
         System.out.print("Ingrese el numero de cedula del donante a buscar: ");
        sc.nextLine();
        ced= sc.nextLine();
        accion.buscardonante(ced);
            break;} 
            case 2:{
                 String cod;
        System.out.print("Ingrese el codigo de la donacion a buscar: ");
        sc.nextLine();
        cod= sc.nextLine();
          accion.Buscar_Donacion(cod);
            break;}
            default:
                System.out.println("Escoja una opcion existente");
            break;}        
        
                      break;       
                }
                case 5:{
                    System.out.println("el monto total es: "+accion.montototal()   );
                    break;
                }  
                case 6:{
                    System.out.println("ADIOS!   Gracias por utilizar este servicio ");
                    break;
                }
                default:
                    System.out.println("Seleccione una opcion existente");
                break;
            }  
        
        
            }
            catch(Exception e){
                System.out.println("Error! ,digite los requisitos correctos");
                va=1;
                sc.nextLine();
            }
        
    }
        while(opcion!=6);
      
}while(va!=0);
       }
       
                  
}

