import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Persona{

    private List<Tarea> tareasRealizadas = new ArrayList<>();
    private List<Turno> turnos = new ArrayList<>();
    private Capacitacion capacitacion;

    public Voluntario(String nombre, String dni, String email) {
        super(nombre, dni, email);
    }

    public List<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(List<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public void realizarTarea (Tarea tarea) {
        if (tarea != null) {
            this.tareasRealizadas.add(tarea);
        }
    }

    public void removerTarea (Tarea tarea) {
        if (tarea != null) {
            this.tareasRealizadas.remove(tarea);
        }
    }

    public void addTurno (LocalDate fecha, String horario) {
        if (fecha != null && horario != null) {
            this.turnos.add(new Turno(fecha, horario));
        }
    }

    public List<Turno> getTurnos() {
        return turnos;
    }




    @Override
    public String toString() {
        return "Voluntario{" +
                "tareasRealizadas=" + tareasRealizadas +
                ", turnos=" + turnos +
                '}';
    }
}
