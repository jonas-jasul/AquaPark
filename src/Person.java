public class Person {
    private int age;
    private String name;
    private int height;
    private int balance;


    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;


    }
    public Person (int balance) {
        this.balance=100;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }


    public double getBalance() {
        return this.balance;
    }
    public void setBalance(int price) {
        this.balance -= price;
    }


    public String toString() {

        return this.name;
    }
}
