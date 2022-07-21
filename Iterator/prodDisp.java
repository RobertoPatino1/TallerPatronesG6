package TallerDSTienda.Iterator;

import java.util.ArrayList;

public class prodDisp implements Iterator{

    int cursor = 0;
    Inventario i = new Inventario("B");
    ArrayList<Producto> copia = new ArrayList<>();

    public prodDisp(){
        for (Producto producto : i.getDatos()) {
            if (producto.getEstado().equals("Disponible")) {
                copia.add(producto);
            }
        }
    }

    @Override
    public boolean hasNext() {
        

        return cursor < copia.size();
    }

    @Override
    public Producto getNext() {
        Producto temp = copia.get(cursor);
        if (copia.get(cursor).getEstado().equals("Disponible")){
            temp = copia.get(cursor++);
        } else {
            while (!copia.get(cursor).getEstado().equals("Disponible")) {
                cursor++;
            }
        }
        return temp;
    }
}
