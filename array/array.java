package array;

public class array{

    static int[] generate(int n)
    {
        int arr[] = new int[n];

        for(int i=0; i<n ; i++)
        {
            arr[i] = i;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[5]; // array declaration and initialization
        
        // entering values inside the array
        for(int i : generate(5))
        {
            arr[i] = i+1;
        }

        for(int i = 0; i<5; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}