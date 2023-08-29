
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        String[] arr={"sten", "sax", "påse"};
        Random r=new Random();
        String answer = "ja";

        int randomNumber=r.nextInt(arr.length);
        String s = String.valueOf(randomNumber);

        while (answer.equals("ja")) {

            System.out.println("Sten, sax eller påse?: ");
            String guess = input.nextLine();


            System.out.println(arr[randomNumber]);




            if (guess.equals(arr[randomNumber])) {
               System.out.println("Oavgjort!");
               System.out.println("Vill du spela igen?");
                answer = input.nextLine();

           }

            if (guess.equals(arr[0])) {
                if (arr[randomNumber] == (arr[1])) {
                    System.out.println("Du vann!");
                    System.out.println("Vill du spela igen?");
                    answer = input.nextLine();
                }
                if (arr[randomNumber] == (arr[2])) {
                    System.out.println("Du förlorade");
                    System.out.println("Vill du spela igen?");
                    answer = input.nextLine();
                }


            }

            if (guess.equals(arr[1])) {
                if (arr[randomNumber] == (arr[2])) {
                    System.out.println("Du vann!");
                    System.out.println("Vill du spela igen?");
                    answer = input.nextLine();
                }
                if (arr[randomNumber] == (arr[0])) {
                    System.out.println("Du förlorade!");
                    System.out.println("Vill du spela igen?");
                    answer = input.nextLine();

                }

            }

            if (guess.equals(arr[2])) {
                if (arr[randomNumber] == (arr[0])) {
                    System.out.println("Du vann!");
                    System.out.println("Vill du spela igen?");
                    answer = input.nextLine();

                }
                if (arr[randomNumber] == (arr[2])) {
                    System.out.println("Du förlorade");
                    System.out.println("Vill du spela igen?");
                    answer = input.nextLine();

                }

            }
        }
        System.out.println("hejdå");








    }
}