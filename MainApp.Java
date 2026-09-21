import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class MainApp {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> add();
                case 2 -> view();
                case 3 -> search();
                case 4 -> delete();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void add() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        list.add(new Student(id, name));
        System.out.println("Added!");
    }

    static void view() {
        if (list.isEmpty()) System.out.println("Empty");
        else for (Student s : list) System.out.println(s);
    }

    static void search() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        for (Student s : list)
            if (s.id == id) {
                System.out.println("Found: " + s);
                return;
            }

        System.out.println("Not found");
    }

    static void delete() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        list.removeIf(s -> s.id == id);
        System.out.println("Deleted if existed");
    }
}
