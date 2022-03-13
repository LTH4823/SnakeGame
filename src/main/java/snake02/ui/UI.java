package snake02.ui;

import lombok.AllArgsConstructor;
import snake02.service.SnakeService;
import java.util.Scanner;

@AllArgsConstructor

public class UI {

    SnakeService snakeService;
    Scanner scanner;

    public void display(){
        int playerNum = inputPlayerNum();

        outer:
        while(true){
            for(int i = 0 ; i < playerNum ; i++){
                int location = playTurn(i+1);
                if(location >=100) {
                    System.out.println( (i+1) + "번째 플레이어가 승리하였습니다. 종료합니다.");
                    break outer;
                }
            }
        }
    }

    public int inputPlayerNum(){
        System.out.println("플레이어 수를 입력하세요.");
        int playerNum = Integer.parseInt(scanner.nextLine());
        snakeService.makePlayers(playerNum);
        return playerNum;
    }

    public int playTurn(int pno){
        System.out.println("턴을 진행해주세요.");
        scanner.nextLine();
        int location = snakeService.rollDice(pno);
        System.out.println( (pno) + "번째 플레이어가 " + location + "으로 이동하였습니다.");
        return location;
    }
}
