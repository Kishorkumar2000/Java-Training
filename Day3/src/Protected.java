public class Protected
{
    protected void display()
    {
        int data=2;
        System.out.println("Hi From Protected");
        System.out.println(data);
    }
    protected static int value (int n)
    {
        System.out.println(n);
        return n;
    }
}
class Pro extends Protected
{
    protected void display()
    {
        int data = 3;
        System.out.println("Hi From Child Protected ");
        System.out.println(data);
    }
    public static void main(String [] args)
    {
        Protected object = new Protected();
        object.value(8);
        Pro object1 = new Pro();
        object1.display();
    }
//    protected void display()
//    {
//        System.out.println("Hi From Child Protected ");
//    }
}