import javax.security.auth.Subject;

public class Menu {
    public static void main(String[] args) {
        Card cardOne = new Card();
        cardOne.setTitle("Harry Potter");
        cardOne.setAuthor("R K Rowlling");
        cardOne.setSubject("Fiction");
        Card cardTwo = new Card();
        cardTwo.setTitle("The Monk Who Sold His Ferrari");
        cardTwo.setAuthor("Robin Sharma");
        cardTwo.setSubject("Fantasy");
        Card cardThree = new Card();
        cardThree.setTitle("Learning How to Fly: Life Lessons for the Youth");
        cardThree.setAuthor("Dr. A. P. J. Abdul Kalam");
        cardThree.setSubject("life lesson");
        Card cardFour = new Card();
        cardFour.setTitle("The Girl with the Dragon Tattoo");
        cardFour.setAuthor("Stieg Larsson");
        cardFour.setSubject("Mystery");
        Card cardFive = new Card();
        cardFive.setTitle("Thinking, Fast and Slow");
        cardFive.setAuthor("Daniel Kahneman");
        cardFive.setSubject("Phsycology");
        // System.out.println("title: "+ cardOne.getTitluthor+"Author: "+ cardThree.getAuthor() +"subject: "+ cardThree.getSubject());
        // System.out.println();
        CardCatalog obj = new CardCatalog();
        obj.addCard(cardOne);
        obj.addCard(cardTwo);
        obj.addCard(cardThree);
        obj.addCard(cardFour);
        obj.addCard(cardFive);
        obj.print();
        // System.out.println();
    }
}