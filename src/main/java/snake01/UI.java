package snake01;

import java.util.Scanner;

public class UI {

    Scanner scanner;
    SnakeSevice snakeSevice;

    public UI(SnakeSevice snakeSevice) {
        this.snakeSevice = snakeSevice;
        scanner = new Scanner(System.in);
    }

    public void display() {
        Integer playerNum = getPlayerNum();
        outer:
        while(true) {
            for (int i = 1; i <= playerNum; i++) {
                inputString("주사위를 굴립니다.(아무 글자나 입력)");
                System.out.println(snakeSevice.move(i)); // i번째 플레이어: 주사위 굴리고 이동
                Snake snake = snakeSevice.checkEvent(i); // 이벤트 확인
                if (snake != null) {
                    System.out.println(snakeSevice.event(i, snake)); // 이벤트 실행
                }
                if (snakeSevice.checkEnd(i)) {
                    System.out.println(i + "번 플레이어가 승리하셨습니다!");
                    break outer;
                }
            }
        }
    }

    // 몇명?
    public Integer getPlayerNum() {
        Integer playerNum = inputInteger("몇명이 플레이 하시나요?");
        snakeSevice.makePlayer(playerNum);
        System.out.println(playerNum + "명의 플레이어가 준비되었습니다.");
        return playerNum;
    }


    public void informMove(int pno) {

    }

    public void informEvent(int pno) {
        //
    }

    public void endGame() {

    }

    private String inputString(String msg) {
        System.out.println(msg);
        System.out.print(">> ");
        return scanner.nextLine();
    }

    private Integer inputInteger(String msg) {
        return Integer.parseInt(inputString(msg));
    }
}
