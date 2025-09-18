import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> toDoList = new ArrayList<>();

    public void addNewTask(String task) {
        toDoList.add(task);
        System.out.println("Добавлено!");
    }

    public void showAllTasks() {

        for (String task : toDoList) {
            System.out.println(toDoList.indexOf(task) + 1 + ". " + task);
        }
    }

    public String deleteTaskByIndex(int index) {
        if (toDoList.get(index - 1) != null) {
            toDoList.remove(index - 1);

            return "Удалено!";
        } else {
            return "такого номера нет!";
        }
    }

    public String deleteTaskByName(String name) {
        if (toDoList.contains(name)) {
            toDoList.remove(name);
            return "Удалено!";
        } else {
            return "Такого дела нет!";
        }
    }

    public String deleteTaskByKeyWord(String name) {
        List<String> taskToRemove = new ArrayList<>();
        for (String task : toDoList) {
            if (task.toLowerCase().contains(name.toLowerCase())) {
                taskToRemove.add(task);
            }
        }

        if (!taskToRemove.isEmpty()) {
            toDoList.removeAll(taskToRemove);

            return "Удалено!";
        } else {
            return "Дел с таким словом нет!";
        }
    }
}
