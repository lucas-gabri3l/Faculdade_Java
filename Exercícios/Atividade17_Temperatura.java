import java.util.Scanner;

public class Atividade17_Temperatura {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual a temperatura do servidor?: ");
        double tempservidor = sc.nextDouble();

        if(tempservidor > 85.0){
            System.out.print("Risco de Superaquecimento - Reduzindo Clock.");
        }else {
            System.out.print("Temperatura Normal");
        }

        sc.close();

    }
}