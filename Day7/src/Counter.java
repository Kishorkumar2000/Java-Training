//5.Create a simple counting thread. It will count to 50, pausing one second between each number. Also, in keeping with the counting theme, it output a string for every ten numbers.
//
//        o/p:1 2 3 4 5 6 7 8 9 Hello 11 12 13 14 15 16 17 18 19 Hello..
class Count {
    public void run() {
        try {
            for (int i = 1; i <= 50; i++)
            {
                Thread.sleep(1000);
                if (i % 10 == 0) {
                    //Thread.sleep(3000);
                    System.out.println("Hello");
                } else {
                    //Thread.sleep(3000);
                    System.out.println(i);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Counter
{
    public static void main(String[] args) throws Exception
    {
        Count c = new Count();
        c.run();
    }
}