package task2;

interface JumpableRunnable {
    boolean run(int distance);

    boolean jump(int height);
}

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(2);

        Human human = new Human("Иван", 150, 1);
        Cat cat = new Cat("Мурзик", 200, 2);
        Robot robot = new Robot("R2-D2", 100, 3);

        boolean humanPass = treadmill.pass(human);
        boolean catPass = wall.pass(cat);
        boolean robotPass = treadmill.pass(robot);

        System.out.println("\nРезультаты:");

        if (humanPass) {
            System.out.println("Человек успешно преодолел все препятствия!");
        } else {
            System.out.println("Человек не смог пройти все препятствия.");
        }

        if (catPass) {
            System.out.println("Кот успешно преодолел все препятствия!");
        } else {
            System.out.println("Кот не смог пройти все препятствия.");
        }

        if (robotPass) {
            System.out.println("Робот успешно преодолел все препятствия!");
        } else {
            System.out.println("Робот не смог пройти все препятствия.");
        }
    }
}
