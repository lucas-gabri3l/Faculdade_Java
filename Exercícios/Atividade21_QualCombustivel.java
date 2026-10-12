import java.util.Scanner;

public class Atividade21_QualCombustivel {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual o tipo de combustível?('A' para Álcool, 'G' para Gasolina): ");
        String combustivel = sc.next();

        if(combustivel.equals("A")){
            System.out.print("Bomba 1 Ativada");
        }else if(combustivel.equals("G")){
            System.out.print("Bomba 2 Ativada");
        }else {
            System.out.print("Não temos essa opção!");
        }

        sc.close();
    }
}