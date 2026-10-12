import java.util.Scanner;

public class Atividade29_FormadePagamento{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual a forma de pagamento?(Pix ou Cartão): ");
        String formadepagamento = sc.next();
        String formadepagamentoformatada = formadepagamento.toUpperCase();

        if(formadepagamentoformatada.equals("PIX")){
            System.out.print("Pagamento Imediato");
        }else if(formadepagamentoformatada.equals("CARTÃO")){
            System.out.print("Pagamento em Análise");
        }
        sc.close();
    }
}