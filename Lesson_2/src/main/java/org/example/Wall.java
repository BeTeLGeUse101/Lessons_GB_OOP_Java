package org.example;

public class Wall {
    private Integer id;
    private Integer Height = 60; // постоянная высота для каждого экземпляра
    private static Integer count = 0;

    public Wall() {
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

    public Integer getHeight() {
        return Height;
    }

    @Override
    public String toString() {
        return String.format("Стена №%d: Необходимая дистанция: %d", getId(), getHeight());
    }
}
