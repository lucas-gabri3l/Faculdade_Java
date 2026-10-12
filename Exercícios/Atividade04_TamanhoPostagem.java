import java.util.Scanner;

public class Atividade04_TamanhoPostagem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a sua postagem?: ");    
        String postagem = sc.nextLine(); 

        int tamanhopostagem = postagem.length();

        if (tamanhopostagem > 280) {
            System.out.print("Tamanho Excedido");
        } else {
            System.out.print("Postagem Aceita");
        }
        sc.close();
    }
}
