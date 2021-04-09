package Domain;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> pedido;
    private String fechaPedido;

    public Pedido() {
        this.pedido = new ArrayList<>();
    }

    public void agregarProductoAlPedido(Producto producto, Catalogo catalogo, String codigo, int cantidad){
        for (int i=0; i<=cantidad; i++){
        producto=catalogo.listarProducto(codigo,producto);
        this.pedido.add(producto);
        producto.setStock(producto.getStock()-cantidad);
        }
    }

    public String asignarPago(Cliente cliente){
        String medioDePago="";
        if(cliente instanceof Empresa){
            medioDePago=((Empresa) cliente).getPago();
        }
        if(cliente instanceof ConsumidorFinal){
            medioDePago=((ConsumidorFinal) cliente).getPago();
        }
        return medioDePago;
    }



    public double calcularTotalBruto(){
        double total=0;
        for (Producto aux:this.pedido){
            total+=aux.getPrecio();
        }
        return total;
    }




    public void mostrarPedido(){
        System.out.println("Pedido");

    }
}
