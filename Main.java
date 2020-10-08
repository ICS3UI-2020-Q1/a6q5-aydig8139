import java.util.Scanner;

/**
 * prints 2 numbers in ascending order
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new Scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for 2 numbers
    System.out.println("Please enter the 2 values for the array");

    //create array to store the 2 numbers
    int[] numbers = new int[2];

    //create a for loop to get the numbers from the user
    for(int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
      
    }
    
    //write an if statement to determine which number is larger and print the answer accordingly
    if(numbers[0] > numbers[1]){
      System.out.println("Your numbers in ascending order are " + numbers[1] + " and " + numbers[0]);
    }else{
      System.out.println("Your numbers in ascending order are " + numbers[0] + " and " + numbers[1]);
      }
  }
}
