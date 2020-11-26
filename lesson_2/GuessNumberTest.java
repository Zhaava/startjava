import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.nextLine());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());

        String exit = "";
        while(!exit.equals("нет")) {
            do {
                game.launch(player1, player2);
                System.out.println("Хотите продолжить? [да/нет]:");
                exit = scan.nextLine();
            } while (!exit.equals("да") && !exit.equals("нет"));
        }
    }
}
