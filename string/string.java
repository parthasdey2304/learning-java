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

        // these methods are for character exchange in java
        System.out.println("The first character of the string is :" + st.charAt(0));
        System.out.println("The second character of the string in upper case is : " + Character.toUpperCase(st.charAt(1)));
        System.out.println("The third character of the string in lower case is : " + Character.toLowerCase(st.charAt(2)));

        // these methods are for checking the characters of the string
        if(Character.isUpperCase(st.charAt(0)))
            System.out.println("The first character is in upper case");
        
        if(Character.isLowerCase(st.charAt(1)))
            System.out.println("The second character in in lower case");
        
        if(Character.isWhitespace(' '))
            System.out.println("The character is a white space");

        if(Character.isDigit('1'))
            System.out.println("The character is a digit");

        if(Character.isAlphabetic('b'))
            System.out.println("The character is an alphabet");

        if(Character.isLetterOrDigit('1'))
            System.out.println("The character is a letter or a digit");
    }
}