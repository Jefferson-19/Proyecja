/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import donaciones.donacion;
import donante.donante;

/**
 *
 * @author ventas
 */
public interface Usos {
  
    void mostrar_datos();
    void Agg_Donacion(donacion dn);
    void Agg_Donante(donante don);
    double montototal();
}
