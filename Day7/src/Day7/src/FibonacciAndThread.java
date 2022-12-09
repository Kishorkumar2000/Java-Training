import java.util.Arrays;

// 8. Write a JAVA program which will generate the threads:
//        - Thread 1 - To display 10 terms of Fibonacci series.
//        - Thread 2 - To display 1 to 10 in reverse order.
class Fibonacci extends Thread
{
    public void run(int[] fibArray) {
        int a = 0;
        int b = 1;
        fibArray[0] = a;
        fibArray[1] = b;
        int c;
        for(int i=2;i<fibArray.length;i++)
        {
            c = a+b;
            fibArray[i] = c;
            a = b;
            b = c;
        }
        System.out.println(Arrays.toString(fibArray));
    }
}

class Reverse extends Thread
{
    @Override
    public void run() {
        try
        {
            //System.out.println("\n=================================");
            System.out.println("\nReverse using Thread is: ");
            // System.out.println("=================================");
            for (int i=10; i >= 1 ;i--)
            {
                System.out.print(i+"  ");
            }
            System.out.println("\n=================================\n");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
public class FibonacciAndThread
{
    public static void main(String[] args)
    {
        int [] array_fib = new int[10];
        Fibonacci f = new Fibonacci();
        f.run(array_fib);
        Reverse r = new Reverse();
        r.start();
    }
}