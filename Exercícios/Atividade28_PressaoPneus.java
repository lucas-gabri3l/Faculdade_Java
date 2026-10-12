import java.util.Scanner;

public class Atividade28_PressaoPneus {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual a pressão dos Pneus?: ");
        int pressao = sc.nextInt();

        if(pressao < 28) {
            System.out.print("Calibragem Necessária");
        }else {
            System.out.print("Pressão dos Pneus está boa!");
        }
        sc.close();
    }
}