package mx.edu.utng.colvera.telefoniaestrategy;

/**
 * Created by Ganzo on 24/09/2017.
 */

public class Telcel implements Telefonica {
    @Override
    public double calcularTarifaLocal(int minutosLocal) {
        return minutosLocal*2.0;
    }

    @Override
    public double calcularTafifaLD(int minutosLD) {
        return minutosLD*5.0;
    }
}
