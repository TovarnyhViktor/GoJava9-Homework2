    import java.util.Scanner;

    public class dz23 {
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
            System.out.println(name+"- имя");
            System.out.println(city+"- город");
            System.out.println(age+"- возраст");
            System.out.println(hobby+"- хобби");
        }
    }
