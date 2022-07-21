package TallerDSTienda.Iterator;

import java.util.ArrayList;

public class prodDefecto implements Iterator{

    int cursor = 0;
    Inventario i = new Inventario("A");
    ArrayList<Producto> copia = new ArrayList<>();

    public prodDefecto(){
        for (Producto producto : i.getDatos()) {
            if (producto.getEstado().equals("Defectuoso")) {
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
        if (copia.get(cursor).getEstado().equals("Defectuoso")){
            temp = copia.get(cursor++);
        } else {
            while (!copia.get(cursor).getEstado().equals("Defectuoso")) {
                cursor++;
            }
        }
        return temp;
    }
}
