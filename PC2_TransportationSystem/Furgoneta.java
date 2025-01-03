public class Furgoneta extends Vehiculo{
    public double capacidadCarga;

    public Furgoneta(String modeloVehiculo, double precioAlquiler, double capacidadCarga){
        super(modeloVehiculo, precioAlquiler); //conector a la clase principal
        this.capacidadCarga = capacidadCarga;

    }
    @Override
    public double calcularAlquiler(int dia) {
        return getPrecioAlquiler()*dia;
    }
}
