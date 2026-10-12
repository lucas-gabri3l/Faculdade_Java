import java.util.Scanner;

public class Atividade02_SenhaCorreta {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        String senhausuario = "Admin2026";

        System.out.println("Digite a Senha: ");
        String senha = sc.next();

        if (senha.equals(senhausuario)) {
            System.out.println("Acesso Liberado");
        
        }else { 
            System.out.println("Bloqueado");
        }

        sc.close();
    }
    
}
