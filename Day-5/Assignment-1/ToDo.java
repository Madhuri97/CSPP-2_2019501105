import java.util.Date;
public class ToDo
{
    private  Task toDo[];
    private int size;
     public ToDo()
     {
        toDo=new Task[20];
        size=0;
     }
     public void addTask(Task d)
     {
         toDo[size]= d;
         size++;
     }
     public int getIndex(String taskName)
     {
         for(int i=0;i<size;i++)
         {
             if(toDo[i].getTaskName().equals(taskName))
             {
                 return i;
             }
         }
         return -1;
     }
     public  void removeTask(String taskName)
     {
         Task[] arr=new Task[10];
         int index=0;
         for(int i=0; i<size;i++)
         {
             if(toDo[i].getTaskName().equals(taskName))
             {
                continue;
             }
             arr[index]=toDo[i];
             index++;
         }
    }
    public void updateTask(String taskName, String status)
    {
         int c= getIndex(taskName);
         toDo[c].setStatus(status);
    }
    public void pendingTask()
    {
        for(int i=0;i<size;i++)
        {
            if(!toDo[i].getStatus().equals("complete"))
            {
                System.out.println(toDo[i]);
            }
        }
        
    }
    public void tasksOnDate(Date date)
    {
        for(int i=0;i<size;i++)
        {
            if(toDo[i].getdueDate().equals(date))
            {
                System.out.println(toDo[i]);
            }
        }
    }
    public void getTask(String task)
    {
      for(int i=0;i<size;i++)
      {
          if(toDo[i].getTaskName().equals(task))
          {
              System.out.println(toDo[i]);
          }
      }
    }
    public void getOverdueTask()
    {
        Date d=new Date();
        for(int i=0;i<size;i++)
        {
           int e= toDo[i].getdueDate().compareTo(d);
           if(e==-1)
           {
               System.out.println(toDo[i]);
           }
        }
    } 
    public void displaytasks()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(toDo[i]);
        }
    }
}
