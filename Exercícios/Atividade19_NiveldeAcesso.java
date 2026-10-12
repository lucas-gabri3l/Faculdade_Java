import java.util.Scanner;

public class Atividade19_NiveldeAcesso {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual seu nível de acesso?(Gestor, Admin, Outros): ");
        String nivelAcesso = sc.next();

        if(nivelAcesso.equals("Admin") || nivelAcesso.equals("Gestor")){
            System.out.print("Acesso ao Relatório");
        }else {
            System.out.print("Acesso Negado");
        }

        sc.close();

    }
}