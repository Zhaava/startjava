import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int computerNumber;


    public boolean guessing(int computerNumber, Player player) {
        if(player.getNumber() > computerNumber) {
            System.out.println("Число " + player.getName() + " больше того, что загадал компьютер");
            return false;
        } else if(player.getNumber() < computerNumber) {
            System.out.println("Число " + player.getName() + " меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(player.getName() + " победил!!!");
            return true;
        }
    }


    public void launch() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.nextLine());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.nextLine());


        String exit = "";

        while(!exit.equals("нет")) {
            do {
                Random random = new Random();
                computerNumber = random.nextInt(100);
                System.out.println("Компьютер загадал " + computerNumber);
                
                while (true) {
                    System.out.println(player1.getName() + " вводит число");
                    player1.setNumber(scan.nextInt());
                    
                    if (guessing(computerNumber, player1)) {
                        break;
                    }

                    System.out.println(player2.getName() + " вводит число");
                    player2.setNumber(scan.nextInt());
                    
                    if (guessing(computerNumber, player2)) {
                        break;
                    }
                }

                System.out.println("Хотите продолжить? [да/нет]:");
                scan.nextLine();
                exit = scan.nextLine();
            } while (!exit.equals("да") && !exit.equals("нет"));
        }
    }
}
