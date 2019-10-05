class Digit {
    String name;//fields 
    int digit;//fields
    Digit[] closeNumbers; //array creation to store the closeNumbers in Digit type

    Digit() {//default constructor

    }
    Digit(int d, String n) {//parameterised constructor
        this.digit = d;//referencing to d to the digit 
        this.name = n;
        this.closeNumbers = new Digit[10];
    }

    public String toString() {
        return "I'm " + this.name + " my close numbers are: " ;
    }

    public String printMyClose() {
        String out = "";
        for (int i = 0; i < this.closeNumbers.length; i++) {
            out = out + closeNumbers[i].digit + " ";
        }
        return out;
    }
}

final class UtilityClass {
    public static void main(String[] args) {
        Digit one = new Digit(1, "one");
        Digit two = new Digit(2, "two");
        Digit three = new Digit(3, "three");

        one.closeNumbers[1] = two;
        
        two.closeNumbers[0] = one;
        two.closeNumbers[1] = three;
        
        three.closeNumbers[0] = two;
    }
}