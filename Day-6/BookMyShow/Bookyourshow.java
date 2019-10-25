class BookYourShow{
    Show[] shows;
    int size;
    BookYourShow(){
        shows = new Show[10];
        size=0;
    }

    void addAShow(Show show){
        shows[size++]=show;
    }
    
    Show getAShow(String movieName,String dateTime){
        for(int i=0;i<size;i++){
            if(shows[i].getMovieName().equals(movieName) && shows[i].getDateTime().equals(dateTime)){
                return shows[i];
            }
        }
        return null;
    }

}