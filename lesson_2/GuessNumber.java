import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int computerNumber;


    private boolean compareNumbers(int computerNumber, Player player) {
        if(player.getNumber() > computerNumber) {
            System.out.println("Число " + player.getName() + " больше того, что загадал компьютер");
        } else if(player.getNumber() < computerNumber) {
            System.out.println("Число " + player.getName() + " меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + " победил!!!");
            return true;
        }
        return false;
    }

    public void launch(Player player1, Player player2) {
        
        Scanner scan = new Scanner(System.in);
        
        Random random = new Random();
        computerNumber = random.nextInt(100);
        System.out.println("Компьютер загадал " + computerNumber);
        
        while (true) {
            System.out.println(player1.getName() + " вводит число");
            player1.setNumber(scan.nextInt());
            
            if (compareNumbers(computerNumber, player1)) {
                break;
            }

            System.out.println(player2.getName() + " вводит число");
            player2.setNumber(scan.nextInt());
            
            if (compareNumbers(computerNumber, player2)) {
                break;
            }
        }
    }
}
