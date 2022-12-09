import java.util.LinkedList;

//6. Write a program to implement inventory System in which two thread called Producer will add one product
// in the Inventory and other thread called Consumer will consume product from inventory.
// Thread should communicate in such a way that, there should be maximum one product and minimum zero products in the inventory.
class Shop1
{
    private int materials;
    private boolean available = false;
    public synchronized int get()
    {
        while (available == false)
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
            }
        }
        available = false;
        notifyAll();
        return materials;
    }
    public synchronized void put(int value)
    {
        while (available == true)
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
        materials = value;
        available = true;
        notifyAll();
    }
}
class Consumer1 extends Thread
{
    private Shop Shop;
    private int number;
    public Consumer1(Shop c, int number)
    {
        Shop = c;
        this.number = number;
    }
    public void run()
    {
        int value = 0;
        for (int i = 0; i < 10; i++)
        {
            value = Shop.get();
            System.out.println("Consumed value " + this.number+ " got: " + value);
        }
    }
}
class Producer1 extends Thread
{
    private Shop Shop;
   // private int number;
   LinkedList<Integer> list= new LinkedList<>();
    public Producer1(Shop c, int number)
    {
        Shop = c;
        this.list = list;
    }
    public void run()
    {
        while (list.size() == 0)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < 10; i++)
        {
            Shop.put(i);
            System.out.println("Produced value " + this.list+ " put: " + i);
            try
            {
                sleep((int)(Math.random() * 100));
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
public class ProducerAndConsumer2
{
    static LinkedList<Integer> list= new LinkedList<>();
    public static void main(String[] args)
    {
        Shop c = new Shop();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
}