import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombre;
    private String descripcion;
    private List<Cultivo> cultivos = new ArrayList<>();
    private Tarea tarea;

    public Sector(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

//    public List<Cosecha> getCosechas() {
//        return cosechas;
//    }
//
//    public void setCosechas(List<Cosecha> cosechas) {
//        this.cosechas = cosechas;
//    }

    public List<Cosecha> getCosechasDelSector () {
        List<Cosecha> cosechaList = new ArrayList<>();
        for (Cultivo c : cultivos) {
            cosechaList.addAll(c.getCosechas());
        }
        return cosechaList;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public void addCultivo (Cultivo cultivo) {
        if (cultivo != null) {
            this.cultivos.add(cultivo);
        }
    }

    public void removerCultivo (Cultivo cultivo) {
        if (cultivo != null) {
            this.cultivos.remove(cultivo);
        }
    }

//    public void addCosechasDeCultivo (Cultivo cultivo) {
//        if (cultivo != null) {
//            this.cosechas.addAll(cultivo.getCosechas());
//        }
//    }

    @Override
    public String toString() {
        return "Sector{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tarea=" + tarea +
                '}';
    }
}
