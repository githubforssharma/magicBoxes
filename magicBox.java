
import java.util.Scanner;

public class magicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 63. Press Enter when you are ready...");
        scanner.nextLine();
        System.out.println("Generating boxes...");

        int numBoxes = 6;
        int numbersPerBox = 32;

        int[][] boxes = {
            { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63 },
            { 2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31, 34, 35, 38, 39, 42, 43, 46, 47, 50, 51, 54, 55, 58, 59, 62, 63 },
            { 4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31, 36, 37, 38, 39, 44, 45, 46, 47, 52, 53, 54, 55, 60, 61, 62, 63 },
            { 8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31, 40, 41, 42, 43, 44, 45, 46, 47, 56, 57, 58, 59, 60, 61, 62, 63 },
            { 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63 },
            { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63 }
        };

        for (int box = 0; box < numBoxes; box++) {
            System.out.println("╔════════════════════════════════════╗");  // Top border of the box

            System.out.println("║              Box " + (box + 1) + "                ║");  // Box label

            System.out.println("╠════════════════════════════════════╣");  // Separator line

            System.out.print("║ ");

            for (int i = 0; i < numbersPerBox; i++) {
                System.out.printf("%3d ", boxes[box][i]);  // Display the hardcoded number
            }

            System.out.println("║");  // Closing delimiter of numbers

            System.out.println("╚════════════════════════════════════╝");  // Bottom border of the box

            System.out.println();  // Add an empty line after each box
        }
        System.out.println("Now tell me how many boxes out of the above you see your number in...");
        if(scanner.hasNextInt()){
            String inputNumber = scanner.nextLine().trim();
            String[] number = inputNumber.split("\\s+");
            if (number.length!= 1){
                System.out.println("Invalid input. Please enter only one number.");
            }
            else {
                int numberOfBoxes = Integer.parseInt(number[0]);
                int sum = 0;
                if(numberOfBoxes < 1 || numberOfBoxes > 6){
                    System.out.println("Invalid box number/s. Number of boxes should be between 1 and 6, both inclusive");
                }
                else {
                    System.out.println("Perfect! You see your number in " +numberOfBoxes+ " boxes above");
                    System.out.println("Now tell me the " +numberOfBoxes+ " boxes you see your number in:");
                    int[] readNumbers = new int[numberOfBoxes];
                    for (int i=0;i<numberOfBoxes;i++){
                    if(scanner.hasNextInt()){
                                readNumbers[i]=scanner.nextInt();
                                if(readNumbers[i] < 1 || readNumbers[i] > 6 ){
                                    System.out.println("Invalid box number/s. Box number can only be between 1 and 6 (both inclusive)");
                                    System.exit(0);//exit the program
                                }
                                else {
                                int base=2;
                                int exponent=readNumbers[i];
                                double result = Math.pow(base, exponent-1);
                                int resultInt = (int)result;
                                sum = sum+resultInt;
                                } 
                            }
                            else {
                                System.out.println("Invalid box number/s. Box number can only be between 1 and 6 (both inclusive)");
                                    System.exit(0);//exit the program
                            }
                            }
                            System.out.println("I am pretty sure your number is: "+sum+ ".");
                    }
            }
            }
        else
        {
            System.out.println("You did not enter a valid number. Number of boxes should be between 1 and 6, both inclusive");
        }
        scanner.close(); 
    }
}