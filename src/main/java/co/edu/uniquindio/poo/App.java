package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        var cliente = new Cliente("Jorge", "123456");

        Habitacion habitacion101 = new Habitacion(101, TipoHabitacion.DOBLE, 2000);

        GestionReservas gestorDeReservas = new GestionReservas();

        Reserva reserva1 = new Reserva(habitacion101, cliente, LocalDate.of(2024, 2, 21), LocalDate.of(2024, 3, 1));

        gestorDeReservas.agregarReserva(reserva1);
        gestorDeReservas.obtenerReservasActivasPorCliente(cliente);
    }
}
