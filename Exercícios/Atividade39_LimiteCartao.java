import java.util.Scanner;

public class Atividade39_LimiteCartao{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual o Limite do cartão?: ");
        double limite = sc.nextDouble();

        System.out.print("Qual o valor do produto?: ");
        double vproduto = sc.nextDouble();

        double saldo = limite - vproduto;

        if(saldo < 0){
            System.out.print("Transação Recusada!");
        }
        sc.close();
    }
}