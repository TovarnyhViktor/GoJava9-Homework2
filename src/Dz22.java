import java.util.Scanner;

public class Dz22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.print("Введите ваше место проживания: ");
        String city = in.nextLine();
        System.out.print("Введите ваш взраст: ");
        String age = in.nextLine();
        System.out.print("Введите ваше хобби: ");
        String hobby = in.nextLine();
        System.out.println("Человек по имени "+name+" живет в городе "+city+".");
        System.out.println("Этому человеку "+age+" лет и любит он заниматься "+hobby+".");
    }
}
