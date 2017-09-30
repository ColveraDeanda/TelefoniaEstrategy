package mx.edu.utng.colvera.telefoniaestrategy;

/**
 * Created by Ganzo on 24/09/2017.
 */

public class MyCompany implements Telefonica  {
    @Override
    public double calcularTarifaLocal(int minutosLocal) {
        return minutosLocal*1.0;
    }

    @Override
    public double calcularTafifaLD(int minutosLD) {
        return minutosLD*1.50;
    }
}
