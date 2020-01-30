/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donaciones;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ventas
 */
public class donacioncomestibles extends donacion {
   private String []comestibles;
   private int año_de_expiracion;
   private String fecha_de_expedicion;

    public donacioncomestibles(String[] comestibles, int año_de_expiracion, String fecha_de_expedicion, String codigo, donante.donante donante, String motivo) {
        super(codigo, donante, motivo);
        this.comestibles = comestibles;
        this.año_de_expiracion = año_de_expiracion;
        this.fecha_de_expedicion = fecha_de_expedicion;
    }

  
    public donacioncomestibles() {
    }

    public String[] getComestibles() {
        return comestibles;
    }

    public void setComestibles(String[] comestibles) {
        this.comestibles = comestibles;
    }

    public int getFecha_de_expiracion() {
        return año_de_expiracion;
    }

    public void setFecha_de_expiracion(int año_de_expiracion) {
        this.año_de_expiracion = año_de_expiracion;
    }

    public String getFecha_de_expedicion() {
        return fecha_de_expedicion;
    }

    public void setFecha_de_expedicion(String fecha_de_expedicion) {
        this.fecha_de_expedicion = fecha_de_expedicion;
    }
    public void Ingresar(){
      
        super.Ingresar();
        System.out.print("Ingrese la fecha de expedicion dd/mm/yyyy: " );
       
        fecha_de_expedicion=scn.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fecha_de_expedicion;
        try{
            testDate = df.parse(date);
            System.out.println(testDate);
        } catch (Exception e){ System.out.println("Fecha no valida");}
 
        if (!df.format(testDate).equals(date)){
            System.out.println("Fecha invalida!!");
        } else {
            System.out.println("Fecha valida");
        }
         System.out.print("Ingrese año de expiracion: " );
         año_de_expiracion=scn.nextInt();
    
        System.out.println("Ingrese la cantidad de lista comestibles");
        int i=0;
        int lis=scn.nextInt();     
        scn.nextLine();
        comestibles = new String[lis];
        do{
            System.out.println("Comestible donado"+(i+1)+"");
                    comestibles[i]=scn.nextLine();
            i++;
        }while(i<comestibles.length);
     
        

        
    }
   
    @Override
    public String toString() {
        return super.toString()+"Datos de la donacion de comestibles{" + 
                " \n La lista de comestibles donado =" + comestibles + 
                ",\n Fecha de expiracion de sus comestibles donados: =" + año_de_expiracion + 
                ",\n Fecha de expedicion de sus comestibles donados=" + fecha_de_expedicion + '}';
    }
    
}
