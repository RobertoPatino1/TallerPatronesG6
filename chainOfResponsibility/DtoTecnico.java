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
public class DtoTecnico implements Handler{
    ArrayList<String>TiposGarantia;
    public boolean ValidarTipoGarantia(Producto p){
        for(String s:this.TiposGarantia){
            if(p.detalle.equals(s)){
                System.out.println("Cubre la garantia");
                return true;
            }
            else
                System.out.println("No cubre la garantia");
        }
        return false;
    }
    @Override
    public void iniciarProcesoCambio(Producto p) {
        if(ValidarTipoGarantia(p)){
            System.out.println("Proceso realizado exitosamente");
        }
        else
            System.out.println("Solicitud rechazada");
    }
}
