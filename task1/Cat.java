package task1;

// Класс Кот
class Cat implements JumpableRunnable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " бежит.");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " прыгает.");
    }
}