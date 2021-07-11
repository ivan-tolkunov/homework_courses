public class ImmutablePlayer {
    private final String nickname;
    private final MutableScore score;

    public ImmutablePlayer(String nickname, MutableScore score) {
        this.nickname = nickname;
        MutableScore cloneScore = new MutableScore();
        cloneScore.setScore(score.getScore());
        this.score = cloneScore;
    }

    public String getNickname() {
        return nickname;
    }

    public ImmutablePlayer setNickname(String nickname) {
        return new ImmutablePlayer(nickname, this.score);
    }

    public MutableScore getScore() {
        MutableScore cloneScore = new MutableScore();
        cloneScore.setScore(this.score.getScore());
        return cloneScore;
    }

    public ImmutablePlayer setScore(MutableScore score) {
        return new ImmutablePlayer(this.nickname, score);
    }
}
