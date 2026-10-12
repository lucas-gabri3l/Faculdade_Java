import java.util.Scanner;

public class Atividade15_PesoBagagem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual o peso da Bagagem em KG?: ");
        double peso = sc.nextDouble();

        if (peso <= 10){
            System.out.print("Bagagem de Mão Livre");
        }else if (peso >= 11 && peso <= 23) {
            System.out.print("Bagagem Despachada");
        }else {
            System.out.print("Excesso de Peso");
        }

        sc.close();
    }
}        