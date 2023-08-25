import java.util.Scanner;

public class loopsTask {
    public static void main(String[] args) {
        Scanner reader = multiplication();//TASK 1

        sumAnswer(reader);//TASK 2

        reverseString();//TASK 3

        threeDigitCodes();//TASK 4

    }

    private static void threeDigitCodes() {
        int count = 0;

        // Loop through each digit in hundreds place (1, 2, 3, 4)
        for (int i = 1; i <= 4; i++) {
            // Loop through each digit in tens place (1, 2, 3, 4)
            for (int j = 1; j <= 4; j++) {
                // Loop through each digit in ones place (1, 2, 3, 4)
                for (int k = 1; k <= 4; k++) {
                    // Check if the digits are unique
                    if (i != j && i != k && j != k) {
                        // Form a unique three-digit number
                        int uniqueNumber = i * 100 + j * 10 + k;

                        // Print the unique number
                        System.out.println(uniqueNumber);

                        // Increment the count
                        count++;
                    }
                }
            }
        }

        // Print the total count of unique three-digit numbers
        System.out.println("Total count: " + count);
    }

    private static void reverseString() {
        Scanner newreader = new Scanner(System.in);
        System.out.println("Input a string: ");
        char[] letters = newreader.nextLine().toCharArray();
        int length = letters.length;
        System.out.println(length);
        char[] reverse = new char[length];
        int i = 0;
        for (int j = length-1; j>=0; j--) {
            reverse[i] = letters[j];
            //System.out.println(letters[j]);

            i++;


        }
        System.out.println(reverse);
    }

    private static void sumAnswer(Scanner reader) {
        System.out.println("Input a number to sum to  :");
        int sumTo = reader.nextInt();
        int sumNumbers=0 ;
        int j=0;
        while(j <= sumTo){
            sumNumbers = j+sumNumbers;
            j++;
        }
        System.out.println(sumNumbers);
    }


    private static Scanner multiplication() {
        Scanner reader = new Scanner(System.in);
        System.out.println("What times tables would you like?  :");
        int timesTable = reader.nextInt();
        for(int i = 1; i<=12; i++){
            int answer = i * timesTable;
            System.out.println(timesTable + "x"+ i + "=" + answer);
        }
        return reader;
    }


}
