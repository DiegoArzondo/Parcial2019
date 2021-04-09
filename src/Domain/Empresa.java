package Domain;

public class Empresa extends Cliente {
    private int cuit;
    private String IVA;
    private  String pago = "tarjeta";
    private final static double DESCUENTO = 0.1;



    public Empresa(String codigo, String nombre, String apellido, String fechaNacimiento, int telefono, int dni, int cuit, String IVA) {
        super(codigo, nombre, apellido, fechaNacimiento, telefono, dni);
        this.cuit=cuit;
        this.IVA=IVA;
    }


    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public  String getPago() {
        return pago;
    }



    public static double getDESCUENTO() {
        return DESCUENTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Cuit= ").append(cuit);
        sb.append(" IVA= ").append(IVA);
        return sb.toString();
    }
}
