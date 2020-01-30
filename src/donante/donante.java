/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donante;

import java.util.Scanner;

/**
 *
 * @author ventas
 */
public class donante {
   public String nombre;
   public String apellido;
   public String cedula;
 Scanner scn = new Scanner(System.in);
    public donante() {
    }

    public donante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
     
 public void Ingresar(){
     
        System.out.println(" DATOS DEL DONANTE");
        
        System.out.print("Por favor,ingrese el nombre del Donante: " );
       nombre=scn.nextLine();
        System.out.print("Por favor,ingrese el apellido del Donante: " );
       apellido=scn.nextLine();
        System.out.print("Por favor,ingrese la cedula del Donante: " );
       cedula=scn.nextLine();
        
       System.out.println("Donante ingresado con exito ");
    }
 
    @Override
    public String toString() {
        return "Datos del donante{" + 
                "\n nombre=" + nombre + 
                ",\n apellido=" + apellido + 
                ",\n cedula=" + cedula + '}';
    }
    
}
