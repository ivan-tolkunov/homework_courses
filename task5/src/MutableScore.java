public class MutableScore {
    private int score;

    public MutableScore(int score) {
        this.score = score;
    }

    public MutableScore() {
        this.score = 0;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
