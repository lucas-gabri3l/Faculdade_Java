import java.util.Scanner;

public class Atividade36_RegiaoEntrega{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Qual a Região de Entrega?('Norte', 'Sul') ");
        String regiao = sc.next();
        String regiaoformatada = regiao.toUpperCase();

        if(regiaoformatada.equals("NORTE")){
            System.out.print("Valor do Frete R$ 50");
        }else if(regiaoformatada.equals("SUL")){
            System.out.print("Valor do Frete R$ 30");
        }else {
            System.out.print("Região não Cadastrada para entrega");
        }
        sc.close();
    }
}


