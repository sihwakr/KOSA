import java.util.Random;

/**
 * 숫자 야구 게임의 핵심 로직(난수 생성, 스트라이크/볼 계산)을 담당하는 클래스
 */
public class BaseballGame {
    private int[] answer;       // 정답을 저장할 배열 (3자리)
    private int tryCount;       // 시도 횟수
    public static final int MAX_TRIES = 8; // 최대 시도 횟수

    /**
     * 생성자: 게임 시작 시 난수 생성
     */
    public BaseballGame() {
        answer = new int[3];
        setRandomAnswer();
        tryCount = 0;
    }

    /**
     * 중복되지 않는 1~9 범위의 난수 3개를 생성해 answer 배열에 저장
     */
    private void setRandomAnswer() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int temp = rand.nextInt(9) + 1; // 1~9
            boolean duplicate = false;

            // 중복 체크
            for (int j = 0; j < i; j++) {
                if (answer[j] == temp) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                i--; // 다시 뽑기 위해 i 감소
            } else {
                answer[i] = temp;
            }
        }
    }

    /**
     * 사용자 추측 배열(userGuess)과 answer를 비교해 스트라이크/볼 갯수를 문자열("xS xB")로 반환
     * 
     * @param userGuess 사용자가 입력한 3자리 배열
     * @return "xS xB" 형태의 결과 문자열
     */
    public String checkStrikeAndBall(int[] userGuess) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (userGuess[i] == answer[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        return strike + "S " + ball + "B";
    }

    /**
     * 3스트라이크(정답)인지 여부 반환
     * 
     * @param result "xS xB" 형태의 결과 문자열
     * @return 정답이면 true, 그렇지 않으면 false
     */
    public boolean isCorrect(String result) {
        return result.startsWith("3S");
    }

    /**
     * 시도 횟수를 1회 증가
     */
    public void incrementTryCount() {
        tryCount++;
    }

    /**
     * 현재 시도 횟수 반환
     */
    public int getTryCount() {
        return tryCount;
    }

    /**
     * 정답(3자리)을 문자열로 반환
     */
    public String getAnswerString() {
        StringBuilder sb = new StringBuilder();
        for (int num : answer) {
            sb.append(num);
        }
        return sb.toString();
    }
}
