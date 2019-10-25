import java.util.Arrays;
class Show{
   private String movieName;
   private String dateTime;
   private String[] seats;
    Show(String movieName, String datetime, String[] seats){
        this.movieName=movieName;
        this.dateTime=datetime;
        this.seats=seats;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getMovieName(){
        return movieName;

    }
    public void setDateTime(String dateTime){
        this.dateTime=dateTime;
    }
    public String getDateTime(){
        return dateTime;      
    }
    public void setseats(String[] seats){
        this.seats=seats;
    }
    public String[] getseats(){
        return seats;    
    }
    public void bookAShow(Patron p,String[] bookSeats){
        int count=0;
        for(int i=0;i<bookSeats.length;i++){
            boolean flag = false;
            for(int j=0;j<seats.length;j++){
                if(bookSeats[i].equals(seats[j])){
                    p.bookTickets(seats[j]);
                    seats[j]=null;
                    flag=true;
                }
            }
            if(flag==false){
                count+=1;
                System.out.print(bookSeats[i] + "not available, ");
            }
        }
        System.out.println();
        if(count>0){
            System.out.println("tickets are not booked due to unavailability");
        }

    }
    public void printTickets(Patron p){
        System.out.print(p +"\n"+movieName+"\n"+dateTime);
    }
    public String toString(){
        return Arrays.toString(seats);
    }

}