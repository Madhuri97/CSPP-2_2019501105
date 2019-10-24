import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        String[] array;
        System.out.println("choose the following : addTask, removeTask, updateTasks, pendingTask, tasksOnDate,gettask,getOverduetask,displayTasks ");
        ToDo todo=new ToDo();
        while(true){
            String task=scan.nextLine();
            switch(task)
            {
                case "addTask":
                array= scan.nextLine().split(" ");
                try{
                    Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(array[2]);
                    todo.addTask(new Task(array[0],array[1],d1,array[3]));
                }
                catch(Exception e)
                {
                    System.out.println("enter date in the given format");
                }
                break;

                case "removeTask":
                String taskName=scan.nextLine();
                todo.removeTask(taskName);
                break;

                case"updateTask":
                String taskName1=scan.nextLine();
                String[] arr;
                arr=taskName1.split(" ");
                todo.updateTask(arr[0],arr[1]);
                break;

                case"pendingTask":
                todo.pendingTask();
                break;

                case"tasksOnDate":
                try
                {
                    String d1=scan.nextLine();
                    Date date=new SimpleDateFormat("dd/MM/yyyy").parse(d1);
                    todo.tasksOnDate(date);
                }
                catch(Exception e)
                {
                    System.out.println("enter the date in the given format ");
                }
                break;

                case "gettask":
                String taskName2=scan.nextLine();
                todo.getTask(taskName2);
                break;

                case "getOverduetask":
                todo.getOverdueTask();
                break;

                case "displayTasks":
                todo.displaytasks();
                break;

                case "exit":
                System.exit(0);
                break;
            }
        }

     

    }
}