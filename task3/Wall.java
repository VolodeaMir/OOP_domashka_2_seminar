package task3;

// Класс Стена
class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(JumpableRunnable participant) {
        boolean result = participant.jump(height);
        if (result) {
            System.out.println("Успешно перепрыгнул стену!");
        } else {
            System.out.println("Не смог перепрыгнуть стену.");
        }
        return result;
    }
}
