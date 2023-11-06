package constValue;

public enum ConstMessage {
    FIRST_PRIZE_MESSAGE("6개 일치 (2,000,000,000원) - "),
    SECOND_PRIZE_MESSAGE("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    THIRD_PRIZE_MESSAGE("5개 일치 (1,500,000원) - "),
    FOURTH_PRIZE_MESSAGE("4개 일치 (50,000원) - "),
    FIFTH_PRIZE_MESSAGE("3개 일치 (5,000원) - "),
    LOTTO_NUMBER_INPUT_ERROR_MESSAGE("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    PURCHASE_AMOUNT_INPUT_ERROR_MESSAGE("[ERROR] 구입금액은 1,000원 단위의 숫자여야 합니다.");

    private final String message;

    public String getMessage() {
        return message;
    }

    private ConstMessage(String message) {
        this.message = message;
    }
}