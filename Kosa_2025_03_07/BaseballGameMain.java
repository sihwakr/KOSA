import java.util.Scanner;

/**
 * 숫자 야구 게임을 실제로 실행(메인 메서드)하는 클래스
 */
public class BaseballGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseballGame game = new BaseballGame();

        System.out.println("★ 숫자야구 게임 시작! (서로 다른 1~9 숫자 3개를 맞춰보세요.)");
        System.out.println("★ 최대 " + BaseballGame.MAX_TRIES + "번의 시도가 가능합니다.\n");

        while (true) {
            game.incrementTryCount();
            int currentTry = game.getTryCount();

            // 사용자 입력 받기
            System.out.print(currentTry + "번째 시도, 숫자 3개를 입력하세요(띄어쓰기로 구분): ");
            int[] userGuess = new int[3];
            for (int i = 0; i < 3; i++) {
                userGuess[i] = sc.nextInt();
            }

            // 스트라이크/볼 계산
            String result = game.checkStrikeAndBall(userGuess);
            System.out.println(result);

            // 3스트라이크(정답)인지 확인
            if (game.isCorrect(result)) {
                System.out.println("축하합니다! 정답을 맞추셨습니다!");
                break;
            }

            // 최대 시도 횟수 도달 시 종료
            if (currentTry == BaseballGame.MAX_TRIES) {
                System.out.println("아쉽습니다. " + BaseballGame.MAX_TRIES + "번의 기회를 모두 소진했습니다!");
                System.out.println("정답은: " + game.getAnswerString() + " 이었습니다.");
                break;
            }
        }

        sc.close();
    }
}
