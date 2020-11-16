import java.util.Random;

public class GuessNumber {
    private int computerNumber;

    public GuessNumber() {
        Random random = new Random();
        this.computerNumber = random.nextInt(100);
    }

    public boolean guessing(int playerNumber) {
        return playerNumber == this.computerNumber;
    }

    public void testComputerNumber() {
        System.out.println("Компьютер загадал " + computerNumber);
    }
}
