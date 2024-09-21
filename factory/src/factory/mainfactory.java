package factory;

public class mainfactory {
    public static void main(String[] args) {
        VehiculoFactory cocheFactory = new CocheFactory();
        Vehiculo coche = cocheFactory.crearVehiculo();
        coche.conducir();

        VehiculoFactory motoFactory = new MotoFactory();
        Vehiculo moto = motoFactory.crearVehiculo();
        moto.conducir();
    }
}
