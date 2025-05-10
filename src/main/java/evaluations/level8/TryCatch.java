package evaluations.level8;


public class TryCatch {

    public void sampleExample() {
        String str = null;
        try {
            System.out.println("Length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        }
    }

    public void practiceOnYourOwn() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Number: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please check the index.");
        }
    }

}
