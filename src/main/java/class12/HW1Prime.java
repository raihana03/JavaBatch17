package class12;

public class HW1Prime {
        /*
        Write a method to return whether given number is prime or not?
         */

    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    }

