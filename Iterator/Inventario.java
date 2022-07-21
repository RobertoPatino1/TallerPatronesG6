package TallerDSTienda.Iterator;

import java.util.ArrayList;

public class Inventario implements IterableCollection{

    private ArrayList<Producto> datos = new ArrayList<>();

    private String t;

    public Inventario(String tienda) {
        Producto p1 = new Producto("1", "prod1", 50, "A", "Disponible");
        Producto p2 = new Producto("2", "prod2", 50, "A", "Reparacion");
        Producto p3 = new Producto("3", "prod3", 50, "A", "Defectuoso");
        Producto p4 = new Producto("4", "prod4", 50, "B", "Disponible");
        Producto p5 = new Producto("5", "prod5", 50, "B", "Reparacion");
        Producto p6 = new Producto("6", "prod6", 50, "B", "Defectuoso");
        Producto p7 = new Producto("7", "prod7", 50, "A", "Disponible");
        Producto p8 = new Producto("8", "prod8", 50, "A", "Reparacion");
        Producto p9 = new Producto("9", "prod9", 50, "A", "Defectuoso");
        Producto p10 = new Producto("10", "prod10", 50, "B", "Disponible");
        Producto p11 = new Producto("11", "prod11", 50, "B", "Reparacion");
        Producto p12 = new Producto("12", "prod12", 50, "B", "Defectuoso");
            
        datos.add(p1);
        datos.add(p2);
        datos.add(p3);
        datos.add(p4);
        datos.add(p5);
        datos.add(p6);
        datos.add(p7);
        datos.add(p8);
        datos.add(p9);
        datos.add(p10);
        datos.add(p11);
        datos.add(p12);

        this.t = tienda;


    }

    @Override
    public Iterator getDispIterator() {
        return new prodDisp();
    }

    @Override
    public Iterator getTiendaIterator() {
        return new prodTienda(t);
    }

    @Override
    public Iterator getDefectoIterator() {
        return new prodDefecto();
    }

    @Override
    public Iterator getReparacionIterator() {
        return new prodReparacion();
    }

    public ArrayList<Producto> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Producto> datos) {
        this.datos = datos;
    }

    

    

}
