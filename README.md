# **MINIMUM - MAXIMUM NUMBER**

## INFORMATION

* **The program that finds which number is the smallest and which number is the largest according to the specified numbers.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **n**, **i**, **max**, **min** and **number** are defined with int.

* Scanner class created for user to enter numbers.

* When a number is entered, it finds the largest and smallest numbers.

## CODES

```Java

        import java.util.Scanner;

        public class minmaxnumber{

            public static void main(String[] args) {

                int max = 1, min = 1, i, number, n;

                Scanner scan = new Scanner(System.in);

                System.out.print("How many numbers will you enter? : ");

                n = scan.nextInt();


```

```Java

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

```

```bash

    How many numbers will you enter? : 4
    1.Enter The Number : 16
    2.Enter The Number : -22
    3.Enter The Number : -15
    4.Enter The Number : 100
    Biggest Number : 100
    Smallest Number : -22

```

<br />

## LINK

* Click here https://github.com/Fogo9/MinMaxNumber.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
