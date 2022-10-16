package section11;

class FinalClass {

    private final int integer; // we can declare it on constructor
    private final int integer2 = 3;


    FinalClass(int integer) {
        this.integer = integer;
    }

    /**
     *
     * we can't do this
     *
     private final int integer3;
     public void setInteger3(int i){
     this.integer3 = 4;
     }

     */
}

public class Final {

    public static void main(String[] args) {

    }
}
