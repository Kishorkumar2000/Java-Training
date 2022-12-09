//3. Write a program to print "HELLO" and "QA ACE 2023" continuously on the screen in Java using threads.
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello");
    }
}
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("QA Ace 2023");
    }
}
public class Repeat
{
    public static void main(String[] args) throws Exception
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.sleep(1000);
        t2.sleep(1000);
        t1.setPriority(10);
        t2.setPriority(1);
        for (int i = 0;; i++)
        {
            t1.run();
            t2.run();
            //break;
        }
    }
}