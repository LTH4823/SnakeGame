package snake01;

public class Main {
    public static void main(String[] args) {
        SnakeSevice snakeSevice = new SnakeSevice();
        UI ui = new UI(snakeSevice);

        ui.display();
    }
}
