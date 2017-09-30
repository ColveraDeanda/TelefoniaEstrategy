package mx.edu.utng.colvera.telefoniaestrategy;

/**
 * Created by Ganzo on 24/09/2017.
 */

public class Unefon implements  Telefonica {
    @Override
    public double calcularTarifaLocal(int minutosLocal) {
        return minutosLocal*1;
    }

    @Override
    public double calcularTafifaLD(int minutosLD) {
        return minutosLD*4.0;
    }
}
