package snake02;

import snake02.player.dao.PlayerDAO;
import snake02.service.SnakeService;
import snake02.tile.dao.TileDAO;
import snake02.ui.UI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlayerDAO playerDAO = new PlayerDAO();
        TileDAO tileDAO = new TileDAO();

        SnakeService snakeService = new SnakeService(playerDAO, tileDAO);
        Scanner scanner = new Scanner(System.in);

        UI ui = new UI(snakeService,scanner);
        ui.display();


    }

}
