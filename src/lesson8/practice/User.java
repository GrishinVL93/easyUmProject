package lesson8.practice;

public class User {
    private String nickname;
    private String name;
    private int points;
    private int level;

    public User(){

    }
    public User(String nickname, String name, int points, int level) {
        this.nickname = nickname;
        this.name = name;
        this.points = points;
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
