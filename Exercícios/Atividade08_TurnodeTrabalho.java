import java.util.Scanner;

public class Atividade08_TurnodeTrabalho {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual turno você trabalha? (M= Manhã, N= Noite): ");
        String turno = sc.next();

        if (turno.equals("N")) {
            System.out.print("Adicional Noturno aplicado");
        }
        sc.close();
    }

}
