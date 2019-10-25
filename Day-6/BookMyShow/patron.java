class Patron{
    private String name;
    private String phonenumber;
    private String[] tickets;
    private int numberOfTickets;
    Patron(String name, String phonenumber){
         this.name=name;
         this.phonenumber=phonenumber;
         tickets=new String[10];
         this.numberOfTickets=0;
    }
    public void setName(String name){
         this.name=name;
     }
     public String getName(){
         return name;
     }
     public void setPhoneNumber(String phonenumber){
         this.phonenumber=phonenumber;
     }
     public String getPhoneNumber(){
         return phonenumber;      
     }
     public void bookTickets(String ticket){
         tickets[numberOfTickets++]=ticket;
     }
     public String toString(){
         String a="";
         for(int i=0;i<tickets.length;i++){
             if(tickets[i]!=null)
             {
                 a+=tickets[i]+" ";
             }
         }
         if(a.equals("")){
             a="no tickets booked";
         }
         return name + " "+phonenumber+" "+a;
     
     }
    
}