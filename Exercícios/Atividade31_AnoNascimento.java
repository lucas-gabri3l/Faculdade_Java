import java.util.Scanner;

public class Atividade31_AnoNascimento{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual o ano do seu nascimento?: ");
        int anonascimento = sc.nextInt();
        int idade = 2026 - anonascimento;

        if(idade >= 18) {
            System.out.print("Pode Assinar Contrato");
        }else {
            System.out.print("Menor de Idade");
        }
        sc.close();
    }
}