import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int opcao=0;
        while(opcao!=7){
            System.out.println("******************************************************");
            System.out.println(" Conversor de Moedas ");
            System.out.println("-----------------------");
            System.out.print("1)Dólar >> Peso argentino\n2)Peso argentino >> Dólar\n3)Dólar >> Real brasileiro\n4)Real brasileiro >> Dólar\n5)Dólar >> Peso colombiano\n6)Peso colombiano >> Dólar\n7)Sair\n");
            System.out.println("--------------------------");
            System.out.println("Escolha uma opção válida:");
            System.out.println("******************************************************");
            opcao= leia.nextInt();
            if (opcao != 7) {
                System.out.println("Digite o valor que deseja converter");
                double valor = leia.nextDouble();
                Conversor conversor = new Conversor();
                switch (opcao){
                    case 1:
                        System.out.println((conversor.converte("USD","ARS", valor)));
                        break;
                    case 2:
                        System.out.println((conversor.converte("ARS","USD",valor)));
                        break;
                    case 3:
                        System.out.println((conversor.converte("USD","BRL",valor)));
                        break;
                    case 4:
                        System.out.println((conversor.converte("BRL","USD",valor)));
                        break;
                    case 5:
                        System.out.println((conversor.converte("USD","COP",valor)));
                        break;
                    case 6:
                        System.out.println((conversor.converte("COP","USD",valor)));
                        break;

                }
            }
        }

    }
}
