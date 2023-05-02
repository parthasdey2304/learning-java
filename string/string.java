package string;

public class string
{
    public static void main(String[] args) {
        String st = "Partha";

        // methods for checking string in java
        if(st.startsWith("P"))
            System.out.println("The string starts with P");

        if(st.endsWith("a"))
            System.out.println("The string ends with a");        

        if(st.equals("Ram prasad"))
            System.out.println("The strings are not the same");

        else
            System.out.println("The strings are the same");

        if(st.equalsIgnoreCase("partha"))
            System.out.println("The strings are basically the same but the strings may be different");

        
        // these are the methods to manipulate a string
        System.out.println("The index of first a in the string Partha is : " + st.indexOf("a"));
        System.out.println("The index of the last a in the string Partha is : " + st.lastIndexOf("a"));
        System.out.println("The string from 1st to 3rd index is : " + st.substring(1, 4));
        System.out.println("The string has all the a's replaced with b's and the new string looks like : "+st.replace('a', 'b'));
        System.out.println("This is how you convert the entire string to upper case : " + st.toUpperCase());
        System.out.println("This is how you convert the entire string to lower case : "+st.toLowerCase());
        System.out.println("This how you make an array of the string : " + st.split(""));
    }
}