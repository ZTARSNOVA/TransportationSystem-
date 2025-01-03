import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    public List<Alquiler> listaAlquileres;
    public EmpresaTransporte(){
        listaAlquileres = new ArrayList<>();
    }
    public void agregarAlquiler(Alquiler alquiler){
        listaAlquileres.add(alquiler);
    }
    public List<Alquiler> getListaAlquileres(){
        return listaAlquileres;
    }
}
