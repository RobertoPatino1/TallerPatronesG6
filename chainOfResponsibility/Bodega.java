/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.chainofresponsability;

import java.util.ArrayList;

/**
 *
 * @author FxFF
 */
public class Bodega implements Handler{
    ArrayList<Integer>codigosProdBodega;
    public boolean existenciaProducto(Producto p){
        for(Integer i: this.codigosProdBodega){
            if(p.codigo==i){
                System.out.println("Producto encontrado en registros de bodega");
                return true;
            }
        }
        return false;
    }
    @Override
    public void iniciarProcesoCambio(Producto p) {
        if(this.existenciaProducto(p)){
            System.out.println("Cambio realizado con exito");
        }
        else
            System.out.println("Solicitud rechazada");
    }
}

