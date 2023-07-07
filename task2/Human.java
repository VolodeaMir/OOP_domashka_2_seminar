package task2;

// Класс Человек
class Human implements JumpableRunnable {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Человек " + name + " пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Человек " + name + " не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Человек " + name + " перепрыгнул стену высотой " + height + " м.");
            return true;
        } else {
            System.out.println("Человек " + name + " не смог перепрыгнуть стену высотой " + height + " м.");
            return false;
        }
    }
}