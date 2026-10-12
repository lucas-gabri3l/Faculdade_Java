import java.util.Scanner;

public class Atividade30_PassosSmartWatch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantos passos você deu hoje?: ");
        int passos = sc.nextInt();

        if(passos >= 10000){
            System.out.print("Meta Diária Atingida");
        }else{
            System.out.print("Continue Caminhando");
        }

        sc.close();
    }
}