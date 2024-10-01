package SistemaTransporte;

abstract class Transporte {
    protected double distancia;

    // Constructor que inicializa la distancia del viaje
    public Transporte(double distancia) {
        this.distancia = distancia;
    }

    // Método abstracto viajar(), será implementado en las subclases
    public abstract void viajar();

    // Método abstracto calcularTarifa(), será implementado en las subclases
    public abstract double calcularTarifa();
}
