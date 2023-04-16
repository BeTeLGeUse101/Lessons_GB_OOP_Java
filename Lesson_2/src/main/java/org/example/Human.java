package org.example;

public class Human implements Doing{
    private Integer id = 0;
    private static Integer count = 0;
    private Integer runningPower = 0;
    private Integer jumpPower = 0;
    private Boolean victory = true;

    public Human(Integer runningPower, Integer jumpPower) {
        count++;
        setId(count);
        setRunningPower(runningPower);
        setJumpPower(jumpPower);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getCount() {
        return count;
    }

    public void setRunningPower(Integer runningPower) {
        this.runningPower = runningPower;
    }

    public Integer getRunningPower() {
        return runningPower;
    }

    public void setJumpPower(Integer jumpPower) {
        this.jumpPower = jumpPower;
    }

    public Integer getJumpPower() {
        return jumpPower;
    }

    public void setVictory(Boolean victory) {
        this.victory = victory;
    }

    public Boolean getVictory() {
        return victory;
    }

    @Override
    public String toString() {
        return String.format("Человек №(%d): Сила бега - %d; Сила прыжка - %d", getId(), getRunningPower(), getJumpPower());
    }

    @Override
    public void Run(RunningTrack runningTrack, Wall wall) {
        if (runningTrack.getLength() < getRunningPower()) 
            System.out.printf("Сила Человека(%d): %dм; Беговая дорожка №%d: длина %dм; ПОЛУЧИЛОСЬ\n", id, getRunningPower(), runningTrack.getId(), runningTrack.getLength());
        else 
            System.out.printf("Сила Человека(%d): %dм; Беговая дорожка №%d: длина %dм; НЕ ПОЛУЧИЛОСЬ\n", id, getRunningPower(), runningTrack.getId(), runningTrack.getLength()); setVictory(false);
    }

    @Override
    public void Jump(RunningTrack runningTrack, Wall wall) {
        if (wall.getHeight() < getJumpPower())
            System.out.printf("Сила Человека(%d): %dм; Стена №%d: высота %dм; ПОЛУЧИЛОСЬ\n", id, getJumpPower(), wall.getId(), wall.getHeight());
        else 
            System.out.printf("Сила Человека(%d): %dм; Стена №%d: высота %dм; НЕ ПОЛУЧИЛОСЬ\n", id, getJumpPower(), wall.getId(), wall.getHeight()); setVictory(false);
    }
}