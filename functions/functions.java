package functions;

public class functions{

    static int sum(int... varargs)
    {
        int sum = 0;
        for(int i:varargs)
        {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) { //  this is the main() function
        System.out.println("Sum of 11, 14, 15 and 44 are : " + sum(11, 14, 15, 44));
    }
}