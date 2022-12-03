//6. Create two classes, A and B with default constructors (empty argument lists) that announce themselves.
// Inherit a new class called C from A, and create a member B inside C. Do not create a constructor for C. Create an object of class C and observe results.
class A
{
    A()
    {
        System.out.println("I am A");
    }
}
class B
{
    B()
    {
        System.out.println("I am B");
    }
}
class C extends A
{
    B b = new B();
}
class Test6
{
    public static void main(String[] args)
    {
        C  c = new C();
    }
}