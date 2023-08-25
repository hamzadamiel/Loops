import java.util.Scanner;
public class usingLoops {
    public static void main(String[] args) {
        for(int x=0; x<5; x++){
            System.out.println(x);
        }
        System.out.println();
        int y =0;
        while (y < 10) {

            System.out.println(y);
            y++;
        }
        Scanner reader = new Scanner(System.in);
        String answer = "Fred";
        while (answer == ""){
            System.out.println("please enter answer: ");
            answer = reader.nextLine();
        }
        do{ //with do while it is always done at least once
            System.out.println("Please enter your answer: ");
            answer = reader.nextLine();
        }while (answer == "");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int searchValue = 7;
        int index = 0;

        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == searchValue ){
                index = i;
                break;
            }
        }
        if (index != 0){
            System.out.println("The value " + searchValue + " was found at index " +index);
        }
        else{
            System.out.println("The value " + searchValue + " was not found in the array");
        }

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int i=0; i<num.length; i++){
            if (num[i] %2 ==0){
                //Skip over even numbers
                continue;
            }
            sum += num[i];
        }
        System.out.println("The sum of odd numbers in the array is " + sum);
    }
}
