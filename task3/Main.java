package task3;

interface JumpableRunnable {
    boolean run(int distance);

    boolean jump(int height);
}

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(2);

        JumpableRunnable[] participants = {
                new Human("Иван", 150, 1),
                new Cat("Мурзик", 200, 2),
                new Robot("R2-D2", 100, 3)
        };

        Object[] obstacles = { treadmill, wall };

        for (JumpableRunnable participant : participants) {
            System.out.println("\nУчастник: " + participant.getClass().getSimpleName());
            boolean passAllObstacles = true;

            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    passAllObstacles = ((Treadmill) obstacle).pass(participant);
                } else if (obstacle instanceof Wall) {
                    passAllObstacles = ((Wall) obstacle).pass(participant);
                }

                if (!passAllObstacles) {
                    break;
                }
            }

            if (passAllObstacles) {
                System.out.println("Участник успешно преодолел все препятствия!");
            } else {
                System.out.println("Участник не смог пройти все препятствия и выбывает из соревнования.");
            }
        }
    }
}
