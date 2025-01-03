public class Camion extends Vehiculo{
    public double capicidadCarga;

    public Camion(String modeloVehiculo, double precioAlquiler, double capicidadCarga){
        super(modeloVehiculo, precioAlquiler); //conector a la clase principal
        this.capicidadCarga = capicidadCarga;
    }
    public double calcularAlquiler(int dia){
        //double costo = dia * getPrecioAlquiler();
        return getPrecioAlquiler()*dia;
    }
}
