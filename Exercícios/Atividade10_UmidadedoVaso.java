import java.util.Scanner;

public class Atividade10_UmidadedoVaso {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual umidade do solo do vaso?: ");
        int umidade = sc.nextInt();

        if (umidade < 30) {
            System.out.print("Acionar irrigação");
        } else {
            System.out.print("Umidade Ok");
        }
        sc.close();
    }
    
}
