/*Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual
e o número de dependentes do contribuinte. A renda líquida é calculada sobre a renda
anual com um desconto de 2% para cada dependente do contribuinte. O contribuinte com
uma renda líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda
líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida;
para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00
 pagam 15% de imposto. */

import java.util.Scanner;

public class App17 {
    public App17() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da renda mensal: R$");
        double rendaMensal = entrada.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        int dependentes = entrada.nextInt();
        double rendaAnual = rendaMensal * 12;
        double depends = 0.02;

        if (rendaMensal <= 2000 || rendaMensal >= 0) {
            rendaAnual = rendaAnual - (rendaAnual * 0.05);
        } else if (rendaMensal >= 2000 || rendaMensal <= 5000) {
            rendaAnual = rendaAnual - (rendaAnual * 0.1);
        } else if (rendaMensal >= 5000 || rendaMensal < 10000) {
            rendaAnual = rendaAnual - (rendaAnual * rendaAnual * 0.15);
        }else if(rendaMensal>10000){
            rendaAnual = 
        }
        double rendaAnual2 = rendaAnual - (rendaAnual * 0.002);
        System.out.println("RENDA TOTAL: " + rendaAnual2);
        entrada.close();
    }

    public static void main(String[] args) {

    }
}
