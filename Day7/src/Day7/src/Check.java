//4. Write a program to demonstrate that the thread once started, can never be started again.
// Try analyse the result.
public class Check extends Thread
{
    public void run()
    {
        System.out.println("running...");
    }
    public static void main(String args[])
    {
        Check t1=new Check();
        t1.start();
        t1.start();
    }
}