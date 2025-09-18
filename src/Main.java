import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            printMenu();
            try {
                int command = Integer.parseInt(scanner.nextLine());

                switch (command) {
                    case 1:
                        System.out.print("Введите название задачи: ");
                        taskManager.addNewTask(scanner.nextLine());
                        taskManager.showAllTasks();
                        break;
                    case 2:
                        System.out.println("Ваш список дел: ");
                        taskManager.showAllTasks();
                        break;
                    case 3:
                        System.out.print("Введите номер дела: ");
                        System.out.println(taskManager.deleteTaskByIndex(Integer.parseInt(scanner.nextLine())));
                        taskManager.showAllTasks();
                        break;
                    case 4:
                        System.out.print("Введите название дела: ");
                        System.out.println(taskManager.deleteTaskByName(scanner.nextLine()));
                        taskManager.showAllTasks();
                        break;
                    case 5:
                        System.out.println("Введите слово по которому произойдет удааление: ");
                        System.out.println(taskManager.deleteTaskByKeyWord(scanner.nextLine()));
                        taskManager.showAllTasks();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Такой команды нет!");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Введите число!");
            }




        }
    }

    public static void printMenu() {
        System.out.println("Выберите операцию:");

        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.println("5 Удалить дела по ключевому слову");
    }
}