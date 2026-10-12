import java.util.Scanner;

public class Atividade27_HorasJogadas {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantas horas você jogou?: ");
        int horas = sc.nextInt();

        if(horas > 100) {
            System.out.print("Jogador hardcore");
        }else {
            System.out.print("Jogador Casual");
        }
        sc.close();
    }
}