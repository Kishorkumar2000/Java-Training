//b) Write a program to check whether a derived class constructor can catch exception thrown by base class constructor
class ConstructorCatch
{
    ConstructorCatch() throws ArithmeticException
    {
        throw new ArithmeticException();
    }
}

class Derived extends ConstructorCatch {

    Derived() throws ArithmeticException, RuntimeException
    {

    }

    public static void main(String[] args)
    {
        try
        {
            Derived d = new Derived();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (RuntimeException re)
        {
            System.out.println(re);
        }
        finally
        {
            System.out.println("I am VIP");
        }
    }
}
