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
public class Cliente {
    ArrayList<Producto>productos;
    int CI;
    String direccion;
    String NumTelf;
    public void solicitarCambio(Producto p) {
        boolean garantia=p.Garantia;
        int cantidad=p.cantidad;
        int codigo=p.codigo;
        String detalle=p.detalle;
        double valor=p.valor;
        Producto PDefectuoso=new Producto(cantidad,codigo,detalle,valor,garantia);
        IniciarCambio(PDefectuoso);
        System.out.println("Cambio en revision");
    }
    
    
     
    public void IniciarCambio(Producto p){
        Producto defectuoso=p;
    }
}
