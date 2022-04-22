import java.util.Scanner;

public class minmaxnumber{
    public static void main(String[] args) {

        int max = 1, min = 1, i, number, n;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers will you enter? : ");

        n = scan.nextInt();


        for(i = 1; i <= n; i++){

            System.out.print(i + "." + "Enter The Number : ");

            number = scan.nextInt();

            if(i == 1){

                max = number;
                min = number;
            }

            if(number < min){

                min = number;

            }

            if(number > max){

                max = number;

            }

        }

        System.out.println("Biggest Number : " + max);

        System.out.println("Smallest Number : " + min);


    }
}
