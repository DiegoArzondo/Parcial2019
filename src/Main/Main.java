package Main;

import Domain.*;

public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();
        Pedido pedido = new Pedido();
        Producto producto1= new Producto("A-000", "Ladrillo Hueco", "Ladri",25.5,5500);
        Producto producto2 = new Producto("A-001","Ceramico","Ceramicola",125,300);
        Producto aux=new Producto();

        catalogo.agregarProducto(producto1);
        catalogo.agregarProducto(producto2);
        catalogo.mostrarCatalogo();
        //System.out.println(catalogo.listarProducto("A-001",aux));
        System.out.println("-------------------------------------------------------------");
        //catalogo.eliminarProducto("A-000");
        //catalogo.mostrarCatalogo();
        System.out.println("-------------------------------------------------------------");
        pedido.agregarProductoAlPedido(aux,catalogo,"A-000",200);
        pedido.agregarProductoAlPedido(aux,catalogo,"A-001",3);
        pedido.mostrarPedido();
        System.out.println(pedido.calcularTotalBruto());

    }
}
