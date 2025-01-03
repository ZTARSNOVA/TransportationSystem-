public class Main {
    public static void main(String[] arg){
        EmpresaTransporte empresa = new EmpresaTransporte();
        Vehiculo camion = new Camion("Honda", 250,12000);
        Vehiculo Furgoneta= new Furgoneta("Honda", 250, 10000);

        Alquiler alquilerCamion1 = new Alquiler(camion, 5);
        empresa.agregarAlquiler(alquilerCamion1);

        for(Alquiler alquiler : empresa.getListaAlquileres()){
            System.out.println("Vehiculo: "+ alquiler.getVehiculo().getModeloVehiculo()+ ", Costo Total: " + alquiler.getCostoTotal());
        }
    }
}
