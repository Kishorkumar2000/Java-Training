//2. Write a program which will create two threads one to display even and other to display odd numbers from 1 to 100.
class Even extends Thread {
    public void run(int i)
    {
        if (i % 2 == 0)
        {
            System.out.println("even thread " + i);
        }
    }
}

class Odd extends Thread {
    public void run(int i)
    {
        if (i % 2 != 0) {
            System.out.println("odd thread " + i);
        }
    }
}

public class EvenAndOdd1 extends Thread
{
    public static void main(String[] args)
    {
        //odd numbers
        Odd t1 = new Odd();
        //even numbers
        Even t2 = new Even();

        for (int i = 1; i<=30; i++) {
            t1.run(i);
            t2.run(i);
        }
    }
}