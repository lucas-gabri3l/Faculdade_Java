import java.util.Scanner;

public class Atividade26_CupomNatal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Digite seu Cupom: ");
        String cupom = sc.next();
        String cupomformatado = cupom.toUpperCase();

        if(cupomformatado.equals("NATAL26") || cupomformatado.equals("BLACKFRIDAY")){
            System.out.print("Desconto de 20% aplicado!");
        }else{
            System.out.print("Cupom Inválido!");
        }
        sc.close();
    }
}