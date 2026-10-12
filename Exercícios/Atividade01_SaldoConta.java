import java.util.Scanner;

public class Atividade01_SaldoConta {
   public static void main(String [] args){
   
      Scanner leitor = new Scanner (System.in);
   
     System.out.print("Digite o saldo da conta: ");
   
     double saldo = leitor.nextDouble();

     System.out.print("Quanto você deseja sacar?: ");
     
     double saque = leitor.nextDouble();

       if (saque <= saldo) {
         
         double restante = (saldo - saque);
       
         System.out.println ("Saque aprovado,saldo restante " + restante);
      } else {
        System.out.println("Saque Reprovado, você tem somente " + saldo + " reais na conta");
      }
      leitor.close();
  }
}