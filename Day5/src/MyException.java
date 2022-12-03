//2 a) Create your own exception. In main() create a try-catch clause to exercise your new exception.
public class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
}