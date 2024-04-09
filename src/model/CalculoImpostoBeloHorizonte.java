package model;

public class CalculoImpostoBeloHorizonte implements CalculoImposto {
    @Override
    public double calcularImposto(double areaTotal, int idadeImovel, int numeroQuartos, int numeroComodos, double areaGaragem) {
        return areaTotal * 7 + numeroQuartos * 4;
    }
}
