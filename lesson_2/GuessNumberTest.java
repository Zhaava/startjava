import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        player1.setName(scan.nextLine());
        
        System.out.println("Введите имя второго игрока");
        player2.setName(scan.nextLine());

        String exit = "";
        while(!exit.equals("нет")) {
            do {
                GuessNumber beginGame = new GuessNumber();
                while (true) {
                    beginGame.testComputerNumber();
                    System.out.println(player1.getName() + " вводит число");
                    player1.setNumber(scan.nextInt());
                    
                    if (beginGame.guessing(player1.getNumber())) {
                        System.out.println(player1.getName()+ " победил!");
                        break;
                    }

                    System.out.println(player2.getName() + " вводит число");
                    player2.setNumber(scan.nextInt());

                    if(beginGame.guessing(player2.getNumber())) {
                    	System.out.println(player2.getName()+ " победил!");
                    	break;
                    }
                    System.out.println("Пока никто не угадал");
                }

                System.out.println("Хотите продолжить? [да/нет]:");
                scan.nextLine();
                exit = scan.nextLine();
            } while (!exit.equals("да") && !exit.equals("нет"));
        }
    }
}
