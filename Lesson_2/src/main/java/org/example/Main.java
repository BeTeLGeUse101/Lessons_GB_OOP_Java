/*Домашнее задание на закрепление :

1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса. 
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.*/

package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Robot> robots = new ArrayList<>();
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<RunningTrack> runTracks = new ArrayList<>();
        ArrayList<Wall> walls = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cats.add(new Cat(ran.nextInt(100, 5000), ran.nextInt(10, 70)));
            robots.add(new Robot(ran.nextInt(100, 5000), ran.nextInt(10, 70)));
            humans.add(new Human(ran.nextInt(100, 5000), ran.nextInt(10, 70)));
            runTracks.add(new RunningTrack());
            walls.add(new Wall());
        }

        for (int i = 0; i < 10; i++) {
            cats.get(i).Run(runTracks.get(i), walls.get(i));
            cats.get(i).Jump(runTracks.get(i), walls.get(i));
            robots.get(i).Run(runTracks.get(i), walls.get(i));
            robots.get(i).Jump(runTracks.get(i), walls.get(i));
            humans.get(i).Run(runTracks.get(i), walls.get(i));
            humans.get(i).Jump(runTracks.get(i), walls.get(i));
        }
    }
}
