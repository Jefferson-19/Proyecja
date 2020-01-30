/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donaciones;

import donante.donante;
import interfaces.ingreso;
import java.util.Scanner;

/**
 *
 * @author ventas
 */
public abstract class donacion implements ingreso {
    protected String codigo;
    protected donante donante;
    protected String motivo;
Scanner scn = new Scanner(System.in);
    public donacion() {
    }

    public donacion(String codigo, donante donante, String motivo) {
        this.codigo = codigo;
        this.donante = donante;
        this.motivo = motivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public donante getDonante() {
        return donante;
    }

    public void setDonante(donante donante) {
        this.donante = donante;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    @Override
 public void Ingresar(){
        System.out.print("Ingrese el codigo de la donacion: " );
       codigo=scn.nextLine();
        System.out.print("Ingrese el motivo de su donacion: " );
        motivo=scn.nextLine();
    }
    
    @Override
    public String toString() {
        return "Datos de la donacion{" + 
                " \n codigo=" + codigo + 
                ",\n donante=" + donante +
                ",\n motivo=" + motivo + '}';
    }
    
}
