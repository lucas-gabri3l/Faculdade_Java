import java.util.Scanner;

public class Atividade38_BatimentosCardiacos{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantos BPM?: ");
        int bpm = sc.nextInt();
        
        if(bpm < 40 || bpm > 120){
            System.out.print("Alerta Médico Imediato!");
        }
        sc.close();
    }
}