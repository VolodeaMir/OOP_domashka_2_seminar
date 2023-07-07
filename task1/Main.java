package task1;

interface JumpableRunnable {
    void run();

    void jump();
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван");
        Cat cat = new Cat("Мурзик");
        Robot robot = new Robot("R2-D2");

        human.run();
        human.jump();

        cat.run();
        cat.jump();

        robot.run();
        robot.jump();
    }
}
