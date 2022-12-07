//1. Write a Java program to perform a runnable interface, take two threads t1 and t2 ,
// set their names and fetch the names of the thread.
public class Runnable1 extends Thread implements Runnable
{
    public static void main(String[] args)
    {
        Runnable1 a=new Runnable1();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        t1.start();
        t2.start();
        t1.setName("Kishorkumar");
        t2.setName("QA");
        System.out.println("Thread t1: " +t1.getName());
        System.out.println("Thread t2: " +t2.getName());
    }
    @Override
    public void run()
    {
       //System.out.println("Hi "+Thread.currentThread().getName());
       System.out.println("Thread is running.....");
    }
}