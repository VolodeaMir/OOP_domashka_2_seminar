package task1;

// Класс Робот
class Robot implements JumpableRunnable {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " бежит.");
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " прыгает.");
    }
}