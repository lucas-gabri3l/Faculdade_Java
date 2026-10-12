import java.util.Scanner;

public class Atividade06_RadarMulta {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual velocidade você passou no radar?: ");
        int velocidade = sc.nextInt();

        if (velocidade > 80){
            System.out.print("Multado");
        }else {
            System.out.print("Dentro do Limite");
        }
        sc.close();
    }
    
}
