package Domain;

import java.util.ArrayList;

public class Catalogo {
    private final ArrayList<Producto> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.catalogo.add(producto);
    }

    public Producto listarProducto(String codigo,Producto producto){

        for (Producto aux: catalogo) {
            if(codigo.equalsIgnoreCase(aux.getCodigo())){
                producto=aux;
            }
        }
        return producto;
    }

    public void eliminarProducto(String codigo){
        catalogo.removeIf(aux -> codigo.equalsIgnoreCase(aux.getCodigo()));//FUE PROPUESTO POR EL IDE,INVESTIGAR
    }

    public void mostrarCatalogo(){
        System.out.println("Catalogo");
        for (Producto aux: catalogo) {
            System.out.println(aux);
        }
    }
}
