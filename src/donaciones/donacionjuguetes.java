/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donaciones;



/**
 *
 * @author ventas
 */
public class donacionjuguetes extends donacion{
   private int cantidad;
   private String material;

    public donacionjuguetes() {
    }

    public donacionjuguetes(int cantidad, String material, String codigo, donante.donante donante, String motivo) {
        super(codigo, donante, motivo);
        this.cantidad = cantidad;
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void Ingresar(){
        int ban;
        String ba;
        super.Ingresar();
        do{
            try{
                ban=0;
           
        System.out.print("Ingrese la cantidad de juguetes a donar: " );
        cantidad=scn.nextInt();}
            catch(Exception e){
                System.out.println("Cantidad incorrecta, digite un numero ");
                ban=1;
                scn.nextLine();}}
        while(ban!=0);        
        scn.nextLine();  
        System.out.print("Ingrese material de los juguetes : " );
        material=scn.nextLine();
    }
    @Override
    public String toString() {
        return super.toString()+"Datos de la donacion de juguetes{" + 
                "\n La cantidad de donacion fue=" + cantidad + 
                ",\n El material de los juguetes es=" + material + '}';
    }

    
}
