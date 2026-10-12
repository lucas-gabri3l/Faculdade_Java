import java.util.Scanner;

public class Atividade13_Matricula {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    

        System.out.print("Qual sua Matrícula?: ");
        int matricula = sc.nextInt();

        if (matricula % 2 == 0 ){
            System.out.print("Você é da Turma A");
        }else {
            System.out.print("Você é da Turma B");
        }
    
        sc.close();  
    }
}
