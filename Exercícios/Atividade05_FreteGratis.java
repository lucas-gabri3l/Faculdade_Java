import java.util.Scanner;

public class Atividade05_FreteGratis{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor total da compra?: ");
        double valorcompra = sc.nextDouble();

        if (valorcompra > 300) {
            System.out.print("Frete Grátis");
        } else {
            valorcompra = valorcompra + 25;
            System.out.print("Frete R$ 25,00, valor total " + valorcompra);
        }

        sc.close();
    }
}