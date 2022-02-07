import java.util.Scanner;

public class TreinandoIfElse {
    public static void main(String[] args){
        System.out.println("Digite sua idade: ");
        Scanner s = new Scanner(System.in);
        String age = s.nextLine();

        int idade = Integer.parseInt(age);

        if (idade <= 12){
            System.out.println("Criança!");
        }else if (idade > 12 && idade <= 17){
            System.out.println("Adolescente!");
        }else {
            System.out.println("Adulto!");
        }
    }
}
