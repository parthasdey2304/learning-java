package recursion;

public class recursion{

    static int fact(int n) // this method is to return the factorial of a number using recursion
    {
        return (n == 0)? 1 : fact(n-1) * n;
    }

    static int sumOfFact(int n) // this method is tor return the sum of factorial of the number using recursion
    {
        return (n == 0)? 0 : fact(n%10) + sumOfFact(n/10);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of a number 5 : "+fact(5));
        System.out.println("Sum of factorial of digits of the number 145 is : " + sumOfFact(145));
    }
}