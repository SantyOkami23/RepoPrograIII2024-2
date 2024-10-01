package SistemaTransporte;

class Avion extends Transporte {
    private double tarifaPorKm = 2.0;

    // Constructor que inicializa la distancia del avión
    public Avion(double distancia) {
        super(distancia);
    }

    // Implementación del método viajar para Avion
    @Override
    public void viajar() {
        System.out.println("Viajando en avión por " + distancia + " km.");
    }

    // Implementación del método calcularTarifa para Avion
    @Override
    public double calcularTarifa() {
        return distancia * tarifaPorKm;
    }
}