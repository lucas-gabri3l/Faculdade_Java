import java.util.Scanner;

public class Atividade03_AnopagaIPVA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o Ano de Fabricação do seu Veículo?: ");
        int anocarro = sc.nextInt();

        if (anocarro < 2004) {
            System.out.println("Isento de IPVA");
        }else {
            System.out.println("Ipva Devido");
        }

       sc.close();
    }
    
}
