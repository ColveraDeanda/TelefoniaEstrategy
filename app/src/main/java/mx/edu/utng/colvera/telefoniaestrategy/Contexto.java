package mx.edu.utng.colvera.telefoniaestrategy;

/**
 * Created by Ganzo on 24/09/2017.
 */

public class Contexto {
    private Telefonica strategy;

    public  Contexto(Telefonica strategy){
        this.strategy= strategy;
    }

    public double calcularTarifaLocal(int minutosLocal){
        return strategy.calcularTarifaLocal(minutosLocal);
    }
    public double calcularTafifaLD(int minutosLD){
        return strategy.calcularTafifaLD(minutosLD);
    }
}
