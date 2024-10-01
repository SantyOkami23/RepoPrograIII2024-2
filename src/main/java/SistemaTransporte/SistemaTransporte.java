package SistemaTransporte;

public class SistemaTransporte {
    public static void main(String[] args) {
        // Creación de diferentes tipos de transporte
        Transporte bus = new Autobus(50);      // Viaje en autobús por 50 km
        Transporte tren = new Tren(150);       // Viaje en tren por 150 km
        Transporte avion = new Avion(1000);    // Viaje en avión por 1000 km

        // Simulación de viajes
        realizarViaje(bus);
        realizarViaje(tren);
        realizarViaje(avion);
    }

    // Método que recibe un transporte y realiza el viaje
    public static void realizarViaje(Transporte transporte) {
        transporte.viajar();  // Invoca el método viajar (polimorfismo)
        System.out.println("Tarifa: $" + transporte.calcularTarifa());
        System.out.println("----------------------------");
    }
}
