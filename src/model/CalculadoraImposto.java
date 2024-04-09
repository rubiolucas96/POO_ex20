package model;

public class CalculadoraImposto {
    private CalculoImposto calculoImposto;

    public void setCalculoImposto(CalculoImposto calculoImposto) {
        this.calculoImposto = calculoImposto;
    }

    public double calcularImposto(double areaTotal, int idadeImovel, int numeroQuartos, int numeroComodos, double areaGaragem) {
        return calculoImposto.calcularImposto(areaTotal, idadeImovel, numeroQuartos, numeroComodos, areaGaragem);
    }
}