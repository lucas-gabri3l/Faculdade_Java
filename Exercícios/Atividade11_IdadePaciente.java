import java.util.Scanner;

public class Atividade11_IdadePaciente {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a idade do Paciente na Triagem?: 20");
        int idadepaciente = sc.nextInt();

        if(idadepaciente >= 60){
            System.out.print("Fila Prioritária");
        }else{
            System.out.print("Fila Comum");
        }
        sc.close();
    }
}
