package SistemaTransporte;

class Autobus extends Transporte {
    private double tarifaPorKm = 0.5;

    // Constructor que inicializa la distancia del autobús
    public Autobus(double distancia) {
        super(distancia);  // Llama al constructor de la clase base
    }

    // Implementación del método viajar para Autobus
    @Override
    public void viajar() {
        System.out.println("Viajando en autobús por " + distancia + " km.");
    }

    // Implementación del método calcularTarifa para Autobus
    @Override
    public double calcularTarifa() {
        return distancia * tarifaPorKm;
    }
}