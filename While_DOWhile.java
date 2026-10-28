import java.util.Scanner;

public class While_DOWhile{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        while(idade< 40) {
            System.out.printf("Você é jovem ainda, tem %d anos %n ", idade);
            System.out.println("Digite a sua idade");
            idade = sc.nextInt();
        }
        System.out.println("Você é Experiente");
        sc.close();
    }   
}
