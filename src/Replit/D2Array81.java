package Replit;

public class D2Array81 {
    public static void main(String[] args)
    {

        int arr[] = {5,4,8};
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.print(max);
    }

}

