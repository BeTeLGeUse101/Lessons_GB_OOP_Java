package org.example;

public class Human implements Doing{
    private Integer id;
    private static Integer count = 0;
    private Integer runningPower;
    private Integer jumpPower;
    private Boolean victory = false;
    private Boolean victory2 = false;

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

    public void setVictory2(Boolean victory2) {
        this.victory2 = victory2;
    }
    
    public Boolean getVictory2() {
        return victory2;
    }

    @Override
    public void Run(RunningTrack runningTrack, Wall wall) {
        if (runningTrack.getLength() < getRunningPower()) {
            System.out.printf("Сила Человека(%d): %dм; Беговая дорожка №%d: длина %dм; ПОЛУЧИЛОСЬ\n", id, getRunningPower(),runningTrack.getId(), runningTrack.getLength());
            setVictory(true);
        } else {
            System.out.printf("Сила Человека(%d): %dм; Беговая дорожка №%d: длина %dм; НЕ ПОЛУЧИЛОСЬ\n", id, getRunningPower(), runningTrack.getId(), runningTrack.getLength());
            setVictory(false);
        }
    }

    @Override
    public void Jump(RunningTrack runningTrack, Wall wall) {
        if (wall.getHeight() < getJumpPower()) {
            System.out.printf("Сила Человека(%d): %dм; Стена №%d: высота %dм; ПОЛУЧИЛОСЬ\n", id, getJumpPower(), wall.getId(), wall.getHeight());
            setVictory2(true);
        } else {
            System.out.printf("Сила Человека(%d): %dм; Стена №%d: высота %dм; НЕ ПОЛУЧИЛОСЬ\n", id, getJumpPower(), wall.getId(), wall.getHeight());
            setVictory2(false);
        }
    }
}