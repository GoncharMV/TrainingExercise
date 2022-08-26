public class MountainHare {
    int age;
    double weight;
    int jumpLength;
    static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
