package com.mycompany.app;

public class App 
{
    public static void main( String[] args )
    {
        int nth = 0;
        int num = 10;
        nth = fibonacci(num);
        System.out.println("The " + num + "th term of the Fibonacci sequence is " + nth);

    }

    /*
   Returns the value in nth term of fibonacci sequence.
   The argument of n represents n th term of the fibonacci.

   <p>
       This method is recursive which takes n th term of fibonacci then returns its value of nth term.
   </p>

   @param n represents n th term of fibonacci sequence
   @return the value of nth term of fibonacci sequence
   @author Chisa Fukutome
    */
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } //when n is negative value
        else if (n <= 1) {
            return n;
        }//when n is 0 or 1

        //recursion (call function inside of a function)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }//end fibonacci method
}
