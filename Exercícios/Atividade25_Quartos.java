import java.util.Scanner;

public class Atividade25_Quartos {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantos quartos você deseja?: ");
        int quartos = sc.nextInt();

        if(quartos > 5){
            System.out.print("Encaminhar para Setor de Grupos");
        }else {
            System.out.print("Reserva Padrão");
        }
        sc.close();
    }
}