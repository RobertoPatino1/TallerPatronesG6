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
public class Producto {
    int cantidad;
    int codigo;
    String detalle;
    double valor;
    boolean Garantia;

    public Producto(int cantidad, int codigo, String detalle, double valor,boolean garantia) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.detalle = detalle;
        this.valor = valor;
        this.Garantia=garantia;
    }
    
            
}
