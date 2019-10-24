import java.util.Date;
public class Task
{
    private String taskName;
    private String taskDescription;
    private Date dueDate;
    private String status;
    Task(String taskName,String taskDescription,Date dueDate,String status)
    {
        this.taskName=taskName;
        this.taskDescription=taskDescription;
        this.dueDate=dueDate;
        this.status= status;
    }
    public String getTaskName()
    {
        return taskName;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
    public Date getdueDate()
    {
        return dueDate;
    }
    public String toString()
    {
        return "{TaskName :"+taskName +"\nTaskDescription :" +taskDescription +"\nDueDate :"+dueDate +"\nStatus :" +status+"}";
    }



    



}