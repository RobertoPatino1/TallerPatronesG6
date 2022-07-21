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
public class DtoAtencionalAusuario implements Handler{
    public boolean VerificarGarantia(Producto p){
        if(p.Garantia==true){
            System.out.println("Si tiene garantia");
            return true;
        }
        else{
            System.out.println("Notiene garantia");
        }
        return false;
    }

    @Override
    public void iniciarProcesoCambio(Producto p) {
        if(VerificarGarantia(p)){
            System.out.println("Proceso realizado con exito");
        }
        else
            System.out.println("Solicitud rechazada");
    }
}
