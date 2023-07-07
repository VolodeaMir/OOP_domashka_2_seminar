package task3;

// Класс Беговая дорожка
class Treadmill {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean pass(JumpableRunnable participant) {
        boolean result = participant.run(distance);
        if (result) {
            System.out.println("Успешно пробежал дистанцию!");
        } else {
            System.out.println("Не смог пробежать дистанцию.");
        }
        return result;
    }
}
