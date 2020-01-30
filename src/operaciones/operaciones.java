/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import donaciones.donacion;
import donaciones.donacioneconomica;
import donante.donante;
import interfaces.Usos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ventas
 */
public class operaciones implements Usos{
    Scanner sc = new Scanner(System.in);
   protected String nom;
   protected String ape;
   protected String ced;
   private  donante donante = new donante();
    LinkedList<donante> ListaDonante; 
    ArrayList<donacion> ListaDonaciones;
     public operaciones(){
        this.ListaDonante = new LinkedList();
        this.ListaDonaciones = new ArrayList();
     }

    public donante getDonante() {
        return donante;
    }

    public void setDonante(donante donante) {
        this.donante = donante;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }
     
      public void Seleccionar() {
        int reco ;
          if(!(ListaDonante.size()==0)){
            for(donante man :ListaDonante ) {  
                if(man.getCedula().equals(ced)){
                    System.out.println("\n Donante encontrado");
                    System.out.println(man.toString());
                }
                else{
                    System.out.println("no existe");
                }
            }
        }
        else{
            System.out.println("Aun no se ha registrado");
        }
      
            } 
    
       public void mostrarListaDon() {
        int i=0;
        System.out.println("\nLISTA DE DONANTES");
        for (donante don : ListaDonante) {    
            System.out.println("["+(i+1)+"]"+" "+ don.getNombre() + " " + don.getApellido() + " " + don.getCedula());
            i++;
        }
    }
        
    @Override
    public void mostrar_datos(){
        for(int i=0; i<this.ListaDonante.size();i++){
            String objeto = this.ListaDonante.get(i).toString();
            System.out.println(objeto);
        }   
    }

   
    @Override
 public double montototal(){
     double total=0;
     for(donacion dona:ListaDonaciones){
         if(dona instanceof donacioneconomica ){
             donacioneconomica de=(donacioneconomica) dona;
             total+=de.getMonto();
         }
     }
     return total;
 }
 public void buscardonante(String ced){
   for (donante dona : ListaDonante){
       if (dona.cedula.equals(ced)){
           System.out.println("");
           System.out.println("Se ha encontrado al Donante solicitado");
           System.out.println(dona.toString());
           System.out.println("");
           break;
       }else {
           System.out.println("");
       }
   }
 }
 public void Buscar_Donacion(String cod){
        if(!(ListaDonaciones.size()==0)){
            for(donacion dona : ListaDonaciones) {  
                    if(dona.getCodigo().equals(cod)){
                        System.out.println("\n Se ha encontrado la donacion solicitada ");
                        System.out.println(dona.toString());
                    }
                    else{
                        System.out.println(" ");
                    }
            }
        }
        else{
            System.out.println("No se han registrado donaciones hasta el momento ");
        }
    }


   
 

  @Override
    public void Agg_Donacion(donacion dn) {
         this.ListaDonaciones.add(dn);
    }

    @Override
    public void Agg_Donante(donante don) {
        this.ListaDonante.add(don);
    }
}
