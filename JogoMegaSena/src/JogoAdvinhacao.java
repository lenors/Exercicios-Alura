import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
while (tentativas < 5){
    int numeroDigitado = leitor.nextInt();
    tentativas++;

    if(numeroDigitado == numeroGerado){
        System.out.println("Parabens, você acertou um numero em " + tentativas + "tentativas" );
        break;
    }else if(numeroDigitado > numeroGerado){
        System.out.println("O numero digitado é menor que o numero gerado");
    }else {
        System.out.println("O número digitado é maior que o número gerado.");
    }
}
if(tentativas == 5){
    System.out.println("Você não conseguiu advinhar o numero em 5 tentativas. O numero era " + numeroGerado );
}
    }
}