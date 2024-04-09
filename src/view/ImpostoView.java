package view;

import model.CalculadoraImposto;
import model.CalculoImpostoBeloHorizonte;
import model.CalculoImpostoCuritiba;
import model.CalculoImpostoPortoAlegre;
import model.CalculoImpostoSaoPaulo;

public class ImpostoView {
    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();

//area, idade ,numero quarto, comodos, garagem
        calculadora.setCalculoImposto(new CalculoImpostoSaoPaulo());
        double impostoSP = calculadora.calcularImposto(100.0, 30, 3, 5, 0);
        System.out.println("Imposto em São Paulo: R$ " + impostoSP);


        calculadora.setCalculoImposto(new CalculoImpostoBeloHorizonte());
        double impostoBH = calculadora.calcularImposto(120.0, 25, 4, 6, 0);
        System.out.println("Imposto em Belo Horizonte: R$ " + impostoBH);


        calculadora.setCalculoImposto(new CalculoImpostoPortoAlegre());
        double impostoPOA = calculadora.calcularImposto(150.0, 40, 0, 0, 0);
        System.out.println("Imposto em Porto Alegre: R$ " + impostoPOA);

        calculadora.setCalculoImposto(new CalculoImpostoPortoAlegre());
        double impostoPOA1 = calculadora.calcularImposto(100.0, 40, 0, 0, 50);
        System.out.println("Imposto em Porto Alegre: R$ " + impostoPOA1);


        calculadora.setCalculoImposto(new CalculoImpostoCuritiba());
        double impostoCTBA = calculadora.calcularImposto(80.0, 55, 0, 0, 0);
        System.out.println("Imposto em Curitiba: R$ " + impostoCTBA);
        calculadora.setCalculoImposto(new CalculoImpostoCuritiba());
        double impostoCTBA1 = calculadora.calcularImposto(80.0, 19, 0, 0, 0);
        System.out.println("Imposto em Curitiba: R$ " + impostoCTBA1);
        calculadora.setCalculoImposto(new CalculoImpostoCuritiba());
        double impostoCTBA2 = calculadora.calcularImposto(80.0, 25, 0, 0, 0);
        System.out.println("Imposto em Curitiba: R$ " + impostoCTBA2);
    }
}