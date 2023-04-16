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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int countVic = 0;

        System.out.print("Введите кол-во участников каждой разновидности для марафона: ");

        while (true) {
            try {
                value = Integer.parseInt(scan.nextLine());

                if (value <= 1000) {
                    break;
                } else
                    System.out.print("Лучше меньшее значение: ");

            } catch (Exception e) {
                System.out.print("Введите корректное число участников: ");
            }
        }

        Random ran = new Random();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Robot> robots = new ArrayList<>();
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<RunningTrack> runTracks = new ArrayList<>();
        ArrayList<Wall> walls = new ArrayList<>();

        for (int i = 0; i < value; i++) {
            cats.add(new Cat(ran.nextInt(100, 5000), ran.nextInt(10, 70)));
            robots.add(new Robot(ran.nextInt(100, 5000), ran.nextInt(10, 70)));
            humans.add(new Human(ran.nextInt(100, 5000), ran.nextInt(10, 70)));
            runTracks.add(new RunningTrack());
            walls.add(new Wall());
        }

        for (int i = 0; i < value; i++) {
            cats.get(i).Run(runTracks.get(i), walls.get(i));
            cats.get(i).Jump(runTracks.get(i), walls.get(i));
            robots.get(i).Run(runTracks.get(i), walls.get(i));
            robots.get(i).Jump(runTracks.get(i), walls.get(i));
            humans.get(i).Run(runTracks.get(i), walls.get(i));
            humans.get(i).Jump(runTracks.get(i), walls.get(i));
        }

        for (int i = 0; i < value; i++) {
            if (cats.get(i).getVictory() && cats.get(i).getVictory2()) {
                countVic++;
            }
            if (robots.get(i).getVictory() && robots.get(i).getVictory2()) {
                countVic++;
            }
            if (humans.get(i).getVictory() && humans.get(i).getVictory2()) {
                countVic++;
            }
        }

        System.out.println();
        System.out.println("Победители обоих испытаний: " + countVic);

        scan.close();
    }
}
