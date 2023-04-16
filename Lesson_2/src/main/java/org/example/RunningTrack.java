package org.example;

public class RunningTrack {
    private Integer id;
    private Integer length = 1200; // постоянная длина для каждого экземпляра
    private static Integer count = 0;

    public RunningTrack() {
        count++;
        setId(count);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.format("Беговая дорожка №%d: Необходимая дистанция: %d", getId(), getLength());
    }
}
