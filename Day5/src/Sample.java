////6) Try the following and observe the result. Also, try it with a statement throwing some exception in line 1
//
class sample {

    public void mth1() {

        mth2();

        System.out.println("caller");

    }

    public void mth2()
    {

        try {

// line 1
            //System.out.println(1/0);

            return;
           // System.out.println("I am try");
            //System.exit(0);
        } catch (Exception e) {

            System.out.println("catch-mth2");

        } finally {

            System.out.println("finally-mth2");

        }

    }
    public static void main(String [] p)

    {

        sample s = new sample();

        s.mth1();

    }
}

// Try the above code by replacing the return statement inside try block by System.exit(0);