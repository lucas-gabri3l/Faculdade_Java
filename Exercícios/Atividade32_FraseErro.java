import java.util.Scanner;

public class Atividade32_FraseErro{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Digite o seu problema: ");
        String mensagem = sc.nextLine();

        if(mensagem.startsWith("Erro:")){
            System.out.print("Redirecionando apra Suporte Técnico");
        }else{
            System.out.print("Ok, vamos verificar!");
        }
        sc.close();
    }
}