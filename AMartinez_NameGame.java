//aaron martinewz basridas
// 11/11/2025
//idk what to comment

import java.util.Scanner;
public class AMartinez_NameGame{
    public static void main(String[] args) {
        
        Scanner scuh = new Scanner(System.in);

        System.out.println("Enter a number to start countdown: ");
        int a = scuh.nextInt();

        for(int i = a; i > 0; i--){
            if(i == 5){
                System.out.println("Almost there!");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("blast off!");
    }
}