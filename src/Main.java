import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        System.out.println("Операции: 1.Добавить 2.Показать 3.Удалить");
        while (true) {
            System.out.println(" ");
            System.out.println("Выберите операцию: ");
            Integer operation = scanner.nextInt();
            switch (operation) {
                case 1: //добавить
                    System.out.println("Какую покупку хотите добавить? ");
                    String input = scanner.nextLine();//сыр
                    products.add(scanner.nextLine());
                    System.out.println("Итого в списке покупок: " + products.size());
                    break;
                case 2: //показать
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    break;
                case 3: //удалить
                    System.out.println("Список покупок: ");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    System.out.println("Какую покупку хотите удалить? Введите номер или название: ");
                    scanner.nextLine();
                    input = scanner.nextLine();
                    int inp;
                    try {
                        inp = Integer.parseInt(input);
                        products.remove(inp - 1);
                    } catch (NumberFormatException e) {
                        products.remove(input);
                    }
                    System.out.println("Покупка " + " ' " + products.size() + " ' " + " удалена, список покупок: ");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
                    System.out.println();
            }
        }
    }
}
