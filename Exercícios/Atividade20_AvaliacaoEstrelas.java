import java.util.Scanner;

public class Atividade20_AvaliacaoEstrelas {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantas estrelas o cliente avaliou nossa loja?(1 a 5): ");
        int estrelas = sc.nextInt();

        if(estrelas <= 3){
            System.out.print("Pedir Feedback");
        }else if (estrelas >= 4){
            System.out.print("Pedir Avaliação na loja!");
        }

        sc.close();




    }
}