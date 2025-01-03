public class Alquiler {
    //atributos
    public Vehiculo vehiculo;
    public int duracionAlquiler;
    public double costoTotal;

    public Alquiler(Vehiculo vehiculo, int duracionAlquiler){
        this.vehiculo = vehiculo;
        this.duracionAlquiler = duracionAlquiler;
        this.costoTotal = vehiculo.calcularAlquiler(duracionAlquiler);
    }
    //metodos
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public int getDuracionAlquiler(){
        return duracionAlquiler;
    }
    public double getCostoTotal(){
        return costoTotal;
    }
    public String detallesSistemaTransporte(){
        return "Modelo: "+ vehiculo.getModeloVehiculo() + ", Dias: " + duracionAlquiler + ", Costo: " + costoTotal;
    }
}
