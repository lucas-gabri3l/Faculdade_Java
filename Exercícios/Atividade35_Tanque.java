import java.util.Scanner;

public class Atividade35_Tanque{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Nível do tanque: ");
        double tanque = sc.nextDouble();
       
        if(tanque <= 5.0){
         System.out.print("Aviso: Entrando na Reserva");
        }
        sc.close();
    }
}