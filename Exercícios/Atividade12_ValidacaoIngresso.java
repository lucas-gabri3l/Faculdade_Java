import java.util.Scanner;

public class Atividade12_ValidacaoIngresso {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu Ingresso?: ");
        String ingresso = sc.next();

        String ingressoFormatado = ingresso.toUpperCase();

        if (ingressoFormatado.equals("VIP")){
            System.out.print("Acesso ao Lounge");
        }else{
            System.out.print("Acesso a pista");
        }
        sc.close();
    }
}
