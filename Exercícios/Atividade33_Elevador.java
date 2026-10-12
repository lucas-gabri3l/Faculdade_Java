import java.util.Scanner;

public class Atividade33_Elevador{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual o Andar do Elevador?: ");
        int andarElevador = sc.nextInt();

        if(andarElevador < 0){
            System.out.print("Subsolo");
        }else if(andarElevador == 0){
            System.out.print("Térreo");
        }else{
            System.out.print("Andar Superior");
        }
        sc.close();
    }
}