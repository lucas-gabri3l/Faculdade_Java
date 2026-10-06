import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número para verificar se é par ou impar: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.print("O número é par");
        }else {
                System.out.print("Seu númeroo é impar");
        }
        }

    }