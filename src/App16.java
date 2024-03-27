import java.util.Scanner;

public class App16 {
public App16(){
    Scanner entrada  = new Scanner(System.in);
    System.out.println("Digite a idade do primeiro homem: ");
    int homem1 = entrada.nextInt();
    System.out.println("Digite a idade do segundo homem: ");
    int homem2 = entrada.nextInt();
    System.out.println("Digite a idade da primeiro mulher: ");
    int mulher1 = entrada.nextInt();
    System.out.println("Digite a idade da segunda mulher: ");
    int mulher2 = entrada.nextInt();
    int homi = Math.max(homem1, homem2);
    int muie = Math.min(mulher1, mulher2);
    int soma = homi+muie;
    System.out.println("A SOMA DAS IDADES DERAM:" +soma);
    entrada.close();
}
public static void main(String[] args) {
    
}
}
