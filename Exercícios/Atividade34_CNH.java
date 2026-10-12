import java.util.Scanner;

public class Atividade34_CNH{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual a categoria da sua CNH? ('A','B','C'): ");
        String categoria = sc.next();
        String categoriaformatada = categoria.toUpperCase();

        if(categoriaformatada.equals("C")){
            System.out.print("Habilitado para Caminhões");
        }
        sc.close();
    }
}