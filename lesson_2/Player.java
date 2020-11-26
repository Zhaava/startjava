public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    
    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return this.number;
    }
}
