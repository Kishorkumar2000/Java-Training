//3. Implement the functionality of counter using a static variable
public class Counter {
    static int count = 0;

    Counter()
    {
        count++;
        System.out.println(count);
    }
}
class Counter_class
{
    public static void main(String args[]) {
        Counter c1 = new Counter();
        System.out.println("The Counter Value is : " + Counter.count);
        Counter c2 = new Counter();
        System.out.println("The Counter Value is : " + Counter.count);
        Counter c3 = new Counter();
        System.out.println("The Counter Value is : " + Counter.count);
    }
}