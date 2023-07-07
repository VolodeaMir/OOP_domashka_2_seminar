package task1;

// Класс Человек
class Human implements JumpableRunnable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " бежит.");
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгает.");
    }
}