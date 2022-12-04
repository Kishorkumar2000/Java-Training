import java.util.Scanner;

//4) Check if an element is present in an array.
public class Array_Checking {
    static Scanner s = new Scanner(System.in);
    static int a[];

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Enter the number");
        int num = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println("The Number is Present");
                break;
            }

           // if (num != a[i])
            //System.out.println("The Number is not Present");
        }
        for (int j=0; j<a.length; j++)
        {
            if (num != a[j])
                System.out.println("The Number is not Present");
            break;
        }

    }
}

   /* public static boolean isPresent()
    {
        //System.out.println("Enter the number");
       // int num = s.nextInt();
        for (int i = 0; i < a.length; i++)
        {
            if (num == a[i]) {
                //System.out.println("The Number is Present");
                break;
            }
            // if (num !=a[i])
            // System.out.println("The Number is Not Present");
        }
        return true;
    }
}*/
