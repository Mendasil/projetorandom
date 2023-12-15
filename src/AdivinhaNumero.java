import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        System.out.println("""
                *********************************
                Olá! Seja bem-vindo e/ou bem-vinda!
                *********************************""");
        byte opcao = 1;
        byte opcao2 = 1;

        while(opcao==1) {
            Scanner digitaNum = new Scanner(System.in);
            int numAleatorio = (int)(201*Math.random());
            int chute = 0;

            System.out.println("Digite seu palpite");
            chute = digitaNum.nextInt();

            if (chute == numAleatorio)
                System.out.println("Parabéns! Você acertou. O número secreto é " + chute);
            else
                System.out.println("Errou! O número correto é "+numAleatorio);
            System.out.println("Gostaria de continuar? (1 para sim, 2 para não)");
            opcao = digitaNum.nextByte();

            while(opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Digite novamente: ");
                opcao = digitaNum.nextByte();
            }
        }
        System.out.println("Até mais!");
    }
}
