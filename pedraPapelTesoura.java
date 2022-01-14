import java.util.Random;

public class main{
    public static void main(String[] args){
        Random meuRandom = new Random();

        int player1 = meuRandom.nextInt(3);
        int player2 = meuRandom.nextInt(3);

        if (player1 == 0){
            System.out.print("Player 1: Pedra!");
        }else if (player1 == 1){
            System.out.print("Player 1: Papel!");
        }else {
            System.out.print("Player 1: Tesoura!");
        }

        if (player2 == 0){
            System.out.print("\nPlayer 2: Pedra!");
        }else if (player2 == 1){
            System.out.print("\nPlayer 2: Papel!");
        }else {
            System.out.print("\nPlayer 2: Tesoura!");
        }

        if (player1 == player2){
            System.out.print("\nEmpate!");
        }else if ((player1 == 0 && player2 == 1) ||
        (player1 == 1 && player2 == 2) ||
        (player1 == 2 && player2 == 0)){
            System.out.print("\nPlayer 2 ganhou!");
        }else {
            System.out.print("\nPlayer 1 ganhou!");
        }
    }
}
