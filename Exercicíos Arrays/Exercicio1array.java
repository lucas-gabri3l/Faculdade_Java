import java.util.Scanner;

public class Exercicio1array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double[] minutos = new double[5];
        double totaltempo = 0;

        for(int i=0; i<minutos.length; i++) {
            System.out.print("Digite o tempo da música: ");
            minutos[i] = sc.nextDouble();
        }
        
        for(int i=0; i<minutos.length; i++) {
            totaltempo += minutos[i];
        }
        System.out.println("Tempo total da playlist é :" + totaltempo);
        sc.close();
    }
}