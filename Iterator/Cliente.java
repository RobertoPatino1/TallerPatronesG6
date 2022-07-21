package TallerDSTienda.Iterator;

public class Cliente{

    public static void main(String[] args) {
        //System.out.println("nada");
        Inventario i = new Inventario("A");
        Iterator it = i.getDefectoIterator();

        while (it.hasNext()){
            Producto temp = it.getNext();
            System.out.println(temp.getNombre() + "\t" + temp.getEstado());
        }
    }

}