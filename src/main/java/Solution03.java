/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution03 {
    /*
    Create a program that:
    Prompts for a quote and an author of the quote.
    Display the quote
    Display the Author
    "Yoda Says, "Do or do not, there is no try."
     */

    private static final Scanner in = new Scanner(System.in);

       public static void main(String[] args) {
            System.out.print("What is the quote? ");
            String UserQuote = in.nextLine(); //Insert quote

            System.out.print("Who said it? ");
            String UserWho = in.nextLine(); //Insert Author

            System.out.print(UserWho + " says, \"" + UserQuote + "\"");
            /*
            Remember how to quote inside a quote with \"
            Poor brain trying to figure --> (UserWho + " says, \"" + UserQuote + "\""
            out for 15 min :(
             */
           
        }

}
