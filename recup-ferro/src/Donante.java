import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona {
    private List<Donacion> donaciones = new ArrayList<>();

    public Donante(String nombre, String dni, String email) {
        super(nombre, dni, email);
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public void addDonacion (Donacion donacion) {
        if (donacion != null) {
            this.donaciones.add(donacion);
            donacion.setDonante(this);
        }
    }

    public void removerDonacion (Donacion donacion) {
        this.donaciones.remove(donacion);
    }

    public void mostrarDonaciones() {
        for (Donacion d : donaciones) {
            System.out.println("Tipo: " + d.getTipo() + " Descripcion: " + d.getDescripcion() + " Fecha: " + d.getFecha());
        }
    }

    @Override
    public String toString() {
        return "Donante{" +
                "donaciones=" + donaciones +
                '}';
    }
}
