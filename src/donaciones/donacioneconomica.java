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
public class donacioneconomica extends donacion {
  private double monto;
  private String forma_de_pago;
  private String nombre_de_banco;

    public donacioneconomica() {
    }

    public donacioneconomica(double monto, String forma_de_pago, String nombre_de_banco, String codigo, donante.donante donante, String motivo) {
        super(codigo, donante, motivo);
        this.monto = monto;
        this.forma_de_pago = forma_de_pago;
        this.nombre_de_banco = nombre_de_banco;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public String getNombre_de_banco() {
        return nombre_de_banco;
    }

    public void setNombre_de_banco(String nombre_de_banco) {
        this.nombre_de_banco = nombre_de_banco;
    }
  public void Ingresar(){
      int ban;
        
        super.Ingresar();
        do{
            try{//validar numero//
                ban=0;
           
        System.out.print("Ingrese el monto: " );
      
       monto=scn.nextDouble();}
            catch(Exception e){
                System.out.println("Monto no es correcto");
                ban=1; scn.nextLine();}}
            while(ban!=0);
        scn.nextLine();
       System.out.println("Ingrese la forma de pago: ");
      // scn.nextLine();
       forma_de_pago=scn.nextLine();
       
       
        System.out.print("Ingrese el nombre del banco : " );
       
       nombre_de_banco=scn.nextLine();
    }
    @Override
    public String toString() {
        return super.toString()+
                "Datos de la donacion economica" + 
                "\n El monto a donar fue =" + monto
                + ",\n La forma en que usted pago ="  + forma_de_pago +
                ",\n El nombre del banco es =" + nombre_de_banco + '}';
    }

}
