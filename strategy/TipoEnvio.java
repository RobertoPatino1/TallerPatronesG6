/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleruml;

/**
 *
 * @author jaime
 */
public class TipoEnvio {
    
    private Envios estarategia;
    private String articulo;

    public TipoEnvio(Envios estarategia, String articulo) {
        this.estarategia = estarategia;
        this.articulo = articulo;
    }

    public Envios getEstarategia() {
        return estarategia;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setEstarategia(Envios estarategia) {
        this.estarategia = estarategia;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    
    public void SeleccionarArticulo(){
    }
    
}
