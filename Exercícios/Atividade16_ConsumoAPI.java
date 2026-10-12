import java.util.Scanner;

public class Atividade16_ConsumoAPI {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual o consumo de API em chamadas?: ");
        int consumo = sc.nextInt();

        if(consumo > 1000){
            System.out.print("Plano Pro Necessário");
        }else {
            System.out.print("Dentro do Limite Gratuito");
        }

        sc.close();
    }
}