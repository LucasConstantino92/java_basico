import java.util.Random;

public class jogoParOuImpar{
    public static void main(String[] args){
    Random meuRandom = new Random();

    int player1 = meuRandom.nextInt(11);
    int player2 = meuRandom.nextInt(11);
    int soma = player1 + player2;

    System.out.println("Player 1, par - " + player1);
    System.out.println("Player 2, impar - " + player2);
    System.out.println("Valor total é " + soma);

    if ((player1 + player2)%2 == 0){
        System.out.println("É par! Player 1 ganhou!");
    }else {
        System.out.println("É impar! Player 2 ganhou!");
    }
    }
}
