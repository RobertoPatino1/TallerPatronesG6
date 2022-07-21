package TallerDSTienda.Iterator;

import java.util.ArrayList;

public class prodTienda implements Iterator{

    int cursor = 0;
    Inventario i = new Inventario("B");
    ArrayList<Producto> copia = new ArrayList<>();
    String t;

    public prodTienda(String tienda){
        t = tienda;
        for (Producto producto : i.getDatos()) {
            if (producto.getEstado().equals(tienda)) {
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
        if (copia.get(cursor).getEstado().equals(t)){
            temp = copia.get(cursor++);
        } else {
            while (!copia.get(cursor).getEstado().equals(t)) {
                cursor++;
            }
        }
        return temp;
    }
}
