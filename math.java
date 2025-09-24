public class MathExample {
    public static void main(String[] args) {
        int num1 = 2; 
        int num2 = 25; 
        int num3 = 3; 

        double mySquare1 = Math.sqrt(num2); // same as mySquare2 
        double mySquare2 = Math.sqrt(25); // same as mySquare1
        System.out.println("\nmySquare1 (" + mySquare1 + ") and mySquare2 (" + mySquare2 + ") are the exact same.");

        double myPower1 = Math.pow(mySquare1, mySquare1); // 25^25 
        System.out.println("\nThis is the answer to 25^25: " + myPower1);

        double myPower2 = Math.pow(2, 3); // 2^3 
        double myPower3 = Math.pow(num1, num3); // 2^3 
        System.out.println("\nmyPower2 (" + myPower2 + ") and myPower3 (" + myPower3 + ") are the exact same.");

        double myRandomNum = Math.random(); // generates a number between 0.0 and 1.0 
        System.out.println("\nGenerates a random number from 0.0 to 1.0: " + myRandomNum);

        int randomNum = (int)(Math.random() * 100) + 1; // gives a number from 1 to 100
        System.out.println("\nGenerates a random number from 1 to 100: " + randomNum);
    }
}