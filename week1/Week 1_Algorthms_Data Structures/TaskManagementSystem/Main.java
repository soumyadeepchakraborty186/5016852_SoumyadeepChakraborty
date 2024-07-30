public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        
        taskList.addTask(new Task(1, "Task 1", "Pending"));
        taskList.addTask(new Task(2, "Task 2", "Completed"));
        taskList.addTask(new Task(3, "Task 3", "In Progress"));
        System.out.println("Tasks:");
        taskList.traverse();

        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println("\nFound Task: " + task);
        } else {
            System.out.println("\nTask not found");
        }

        
        boolean deleted = taskList.deleteTask(2);
        if (deleted) {
            System.out.println("\nTask deleted successfully.");
        } else {
            System.out.println("\nTask deletion failed.");
        }

        
        System.out.println("\nTasks after deletion:");
        taskList.traverse();
    }
}
