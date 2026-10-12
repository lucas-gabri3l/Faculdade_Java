import java.util.Scanner;

public class Atividade24_CPF {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual seu CPF?: ");
        String CPF = sc.next();

        if(CPF.length() != 11) {
            System.out.print("CPF Inválido");
        }else {
            System.out.print("CPF Válido");
            }    
        sc.close();
    }
}