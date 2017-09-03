import java.util.Scanner;

public class Dz2 {
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
        System.out.println("Ваше имя: "+name);
        System.out.println("Ваш город: "+city);
        System.out.println("Ваш возраст: "+age);
        System.out.println("Ваше хобби: "+hobby);
    }
}
