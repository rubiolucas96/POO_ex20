package model;

public class CalculoImpostoPortoAlegre implements CalculoImposto {
    @Override
    public double calcularImposto(double areaTotal, int idadeImovel, int numeroQuartos, int numeroComodos, double areaGaragem) {
        if (areaGaragem > 0) {
            return areaTotal * 7.5 + areaGaragem * 2.5;
        } else {
            return areaTotal * 8;
        }
    }
}