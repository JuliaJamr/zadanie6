public class Main {

    public static void main(String[] args)
    {
        Task task1 = new Task("1", 60);
        Task task2 = new Task("2",50);
        Task task3 = new Task("3",1);
        Task task4 = new Task("4",2);
        Task task5 = new Task("5",3);
        Task task6 = new Task("6",4);

        GridScheduler grid = new GridScheduler();

        System.out.println(grid.scheduleTask(task1));
        System.out.println(grid.scheduleTask(task2));
        System.out.println(grid.scheduleTask(task3));
        System.out.println(grid.scheduleTask(task4));
        System.out.println(grid.scheduleTask(task5));
        System.out.println(grid.scheduleTask(task6));
    }
}
