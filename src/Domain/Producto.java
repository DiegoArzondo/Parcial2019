package Domain;


public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String marca, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("Codigo='").append(codigo).append('\'');
        sb.append(", Nombre='").append(nombre).append('\'');
        sb.append(", Marca='").append(marca).append('\'');
        sb.append(", Precio=").append(precio);
        sb.append(", Stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }
}
