import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> peoples = new ArrayList<Person>();
        Person budget = new Person(100);
        System.out.println("Welcome to the 'Ahoy!' water park!");
        System.out.println("How many people will be checking in?");

        int numOfPeople = Integer.valueOf(scanner.nextLine());
        boolean isEmpty = false;
        if(numOfPeople<=0) {
            System.out.println("So you're not here to check-in?");
            isEmpty = true;
        }
        if (!isEmpty) {
            for (int i = 1; i <= numOfPeople; i++) {

                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter height: ");
                int height = Integer.parseInt(scanner.nextLine());
                peoples.add(new Person(name, age, height));
            }

            for (Person each : peoples) {
                System.out.println(each + " how many slides?");
                int numOfSlides = Integer.valueOf(scanner.nextLine());
                //if age is higher than 11, slides cost more
                if (each.getAge() > 11) {
                    budget.setBalance(5 * numOfSlides);
                } else {
                    budget.setBalance(3 * numOfSlides);
                }

            }
            System.out.println("Money left: " + budget.getBalance());
            System.out.println("------------\n------------");
            System.out.println("Did you enjoy our water park?");
            String enjoy = scanner.nextLine();
            if (enjoy.contains("yes")) {
                System.out.println("Glad to hear it!");
            } else if (enjoy.contains("no")) {
                System.out.println("I'm sorry to hear that.");
            }
        }

}
    }

