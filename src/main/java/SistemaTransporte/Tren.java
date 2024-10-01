package SistemaTransporte;

class Tren extends Transporte {
    private double tarifaPorKm = 0.8;

    // Constructor que inicializa la distancia del tren
    public Tren(double distancia) {
        super(distancia);
    }

    // Implementación del método viajar para Tren
    @Override
    public void viajar() {
        System.out.println("Viajando en tren por " + distancia + " km.");
    }

    // Implementación del método calcularTarifa para Tren
    @Override
    public double calcularTarifa() {
        return distancia * tarifaPorKm;
    }
}