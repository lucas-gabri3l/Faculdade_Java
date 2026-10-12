import java.util.Scanner;

public class Atividade40_ExtensaoArquivo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual a extensão do seu arquivo?(pdf ou outros): ");
        String extensao = sc.nextLine();

        if(!extensao.equals("pdf")){
            System.out.print("Apenas PDFs são aceitos para currículos");
        }
        sc.close();
    }
}