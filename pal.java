import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        int palindromeSum = 0;
        for (int number : numbers) {
            if (isPalindrome(number)) {
                palindromeSum += number;
            }
        }

        System.out.println("The sum of palindromic numbers is: " + palindromeSum);

        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

       
        return originalNumber == reversedNumber;
    }
}
