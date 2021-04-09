package Domain;

public class ConsumidorFinal extends Cliente {
    private final String pago = "efectivo";
    private static final double DESCUENTO = 0.15;

    public ConsumidorFinal(String codigo, String nombre, String apellido, String fechaNacimiento, int telefono, int dni) {
        super(codigo, nombre, apellido, fechaNacimiento, telefono, dni);
    }

    public String getPago() {
        return pago;
    }

    public static double getDESCUENTO() {
        return DESCUENTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        return sb.toString();
    }
}
