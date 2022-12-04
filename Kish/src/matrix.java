public class matrix
{
    public static void main(String[] args)
    {
        int i, j;
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (i = 0; i < a.length; i++)
        {
 
            for ( j = 0; j < a[i].length; j++)
            {
                if (a[i][j]<10)
                {
                    System.out.print(" ");
                }
                System.out.print(a[i][j] +" ");
            }
            //if (a[i][j] < 10)
           // {
             //   System.out.println("  ");
           // }
            System.out.println();
        }

    }
}