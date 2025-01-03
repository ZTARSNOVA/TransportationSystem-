public abstract class Vehiculo {
    //atributos
    public String modeloVehiculo;
    public double precioAlquiler;

    public Vehiculo(String modeloVehiculo, double precioAlquiler){
        this.modeloVehiculo = modeloVehiculo;
        this.precioAlquiler = precioAlquiler;
    }

    //metodos
    public String getModeloVehiculo(){
        return modeloVehiculo;
    }
    public double getPrecioAlquiler(){
        return precioAlquiler;
    }

    public abstract double calcularAlquiler(int dia);
}
