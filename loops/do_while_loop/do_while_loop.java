package loops.do_while_loop;

public class do_while_loop{
    public static void main(String[] args) {
        int n = 123, s = 0;

        do{
            int d = n%10;
            s += d;
            n /= 10;
        }

        while(n!=0);

        System.out.println("Sum of digits : " + s);
    }
}