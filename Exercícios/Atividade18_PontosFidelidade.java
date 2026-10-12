import java.util.Scanner;

public class Atividade18_PontosFidelidade {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantos pontos de fidelidade?: ");
        int pontosfidelidade = sc.nextInt();

        if(pontosfidelidade >= 500){
            System.out.print("Resgatar Produto");
        }else {
            System.out.print("Continue Comprando");
        }

        sc.close();

    
    }
}