import java.util.Scanner;

public class Atividade37_NumeroVisualizacao{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Quantas visualizações o video teve?: ");
        int views = sc.nextInt();

        if(views > 1000000){
            System.out.print("Video Viral!");
        }
        sc.close();
    }
}
