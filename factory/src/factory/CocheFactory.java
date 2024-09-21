package factory;

public class CocheFactory extends VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new Coche();
    }
}