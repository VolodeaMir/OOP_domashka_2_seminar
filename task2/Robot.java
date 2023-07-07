package task2;

// Класс Робот
class Robot implements JumpableRunnable {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот " + name + " пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот " + name + " перепрыгнул стену высотой " + height + " м.");
            return true;
        } else {
            System.out.println("Робот " + name + " не смог перепрыгнуть стену высотой " + height + " м.");
            return false;
        }
    }
}