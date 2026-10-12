import java.util.Scanner;

public class Atividade09_NotaFiscal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Status Nota Fiscal (Emitida, Pendente, Cancelada): ");
        String notafiscal = sc.next();

        if (notafiscal.equals("Pendente")){
            System.out.print("Aguardando Pagamento");
        }else if (notafiscal.equals("Emitida")){
            System.out.print("Pronta para Envio");
        }else {
            System.out.print("Cancelado");
        }

        sc.close();
    }
}
