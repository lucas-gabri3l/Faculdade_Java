import java.util.Scanner;

public class Atividade14_BateriaCelular {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    

        System.out.print("Qual a Bateria do celular?: ");
        int bateria = sc.nextInt();

        if(bateria <= 15) {
            System.out.print("Modo Economia Ativado");
        }else {
            System.out.print("Operação Normal");
        } 

        sc.close();
    }
}
