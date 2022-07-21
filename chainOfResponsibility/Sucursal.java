/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.chainofresponsability;

/**
 *
 * @author FxFF
 */
public class Sucursal implements Handler{
    boolean aprobado;
    public boolean AprovarPedido(Producto p){
        if(p.valor>1000){
            System.out.println("Producto aprobado");
            aprobado=true;
            return true;
        }
        else return false;
    }

    @Override
    public void iniciarProcesoCambio(Producto p) {
        if(this.AprovarPedido(p)){
            System.out.println("Cambio realizado con exito");
        }
        else
            System.out.println("Solicitud rechazada");
    }

}
