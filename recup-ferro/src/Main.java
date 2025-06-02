import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cosecha cosecha1 = new Cosecha(LocalDate.now(), 1);
        Cosecha cosecha11 = new Cosecha(LocalDate.now(), 2);
        Cosecha cosecha2 = new Cosecha(LocalDate.now(), 1000);

        Cultivo cultivo1 = new Cultivo("Zanahoria", TipoCultivo.HORTALIZA);
        Cultivo cultivo2 = new Cultivo("Menta", TipoCultivo.AROMATICA);

        // Dos sectores ("Frutales" y "Aromáticas") con al menos un cultivo cada uno (1/2)
        Sector sector1 = new Sector("Frutal", "Frutas citricas");
        Sector sector2 = new Sector("Aromaticas", "Hojas verdes");

        // Un cultivo con al menos dos cosechas.
        cultivo1.addCosecha(cosecha1);
        cultivo1.addCosecha(cosecha11);

        cultivo2.addCosecha(cosecha2);

        // Dos sectores ("Frutales" y "Aromáticas") con al menos un cultivo cada uno (2/2)
        sector1.addCultivo(cultivo1);
        sector2.addCultivo(cultivo2);


        System.out.println("Cosechas Sector Frutas: " + sector1.getCosechasDelSector());
        System.out.println("Cosechas Sector Aromaticas: " + sector2.getCosechasDelSector());

        Tarea tarea1 = new Tarea("Arar", LocalDate.now(), sector1);
        Tarea tarea2 = new Tarea("Sembrar", LocalDate.now(), sector1);

        // Asociá un domicilio a cada persona involucrada.
        Domicilio d1 = new Domicilio("San Martin", "12", "Ciudad", "Mendoza");
        Voluntario v1 = new Voluntario("Tomas", "456456456", "tomas@example.com");
        v1.setDomicilio(d1);

        // Un voluntario con al menos dos tareas realizadas.
        v1.realizarTarea(tarea1);
        v1.realizarTarea(tarea2);

        // Un turno asignado al voluntario.
        v1.addTurno(LocalDate.now(), "12:30:PM");

        Domicilio d2 = new Domicilio("San Juan", "112", "Ciudad", "Mendoza");
        Voluntario v2 = new Voluntario("David", "564564564", "david@example.com");
        v2.setDomicilio(d2);

        Domicilio d3 = new Domicilio("San Martin", "12", "Ciudad", "Mendoza");
        Voluntario v3 = new Voluntario("Emilia", "456456456", "emilia@example.com");
        v3.setDomicilio(d3);

        Domicilio d4 = new Domicilio("Cordoba", "12", "Ciudad", "Mendoza");
        Domicilio d5 = new Domicilio("Rioja", "121", "Ciudad", "Mendoza");
        // Un capacitador y una capacitacion con al menos dos asistentes
        Capacitador c1 = new Capacitador("Alberto", "78978978", "alberto@example.com", "Gestion");
        Capacitacion capacitacion1 = new Capacitacion("Productividad", LocalDate.now(), c1);
        c1.setDomicilio(d4);

        capacitacion1.addAsistente(v1);
        capacitacion1.addAsistente(v2);
        capacitacion1.addAsistente(v3);

//        capacitacion1.mostrarAsistentes();

        Donante don1 = new Donante("Emma", "78978589", "emma@example.com");

        don1.setDomicilio(d5);

        Donacion donacion1 = new Donacion(TipoDonacion.DINERO, "$ 50.000", LocalDate.now());
        Donacion donacion2 = new Donacion(TipoDonacion.HERRAMIENTAS, "Cerrucho", LocalDate.now());
        Donacion donacion3 = new Donacion(TipoDonacion.SEMILLAS, "Cesamo", LocalDate.now());

        // Una donación realizada por un donante.
        don1.addDonacion(donacion1);
        don1.addDonacion(donacion2);
        don1.addDonacion(donacion3);

//        don1.mostrarDonaciones();

        don1.removerDonacion(donacion3);

//        don1.mostrarDonaciones();

    }
}