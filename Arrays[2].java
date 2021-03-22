import java.util.Scanner;

/**
 * Created by pc on 2/11/2021.
 */
public class Arrays {
    private static int [] a = {1,12,3,41,35,6};
    private static int [] b = {1,2};
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int input = s.nextInt();
        Arrays ob = new Arrays();
        int x = ob.seqSearch(a,input);
        if (x == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found in "+x+"it's the element number "+(x+1));

        ob.print(a);
        ob.remove(a,ob.seqSearch(a,s.nextInt()));
        System.out.println(java.util.Arrays.toString(a));
        a = new int[]{1, 12, 3, 41, 35, 6};

        System.out.println();
        System.out.println("The sorted array:");
        ob.insertionSort(a);
        System.out.println(java.util.Arrays.toString(a));
        a = new int[]{1, 12, 3, 41, 35, 6};

        java.util.Arrays.sort(a);
        System.out.println("The sorted array : ");
        System.out.println(java.util.Arrays.toString(a));
        System.out.println("Position of 12 :");
        System.out.println(java.util.Arrays.binarySearch(a,12));

    }

    private int seqSearch (int [] array , int value)
    {
        int index = -1;
        boolean f = false;
        int i = 0 ;
        while (i<a.length && !f )
        {
            if (value == array[i])
            {
                index = i;
                f = true;
            }
            i++;
        }
        return index;
    }

    private void remove (int [] array , int index)
    {
        if (index >= 0 && index < array.length)
        {
            int i = index;
            while ( i < array.length-1 )
            {
                a[i] = a[i+1];
                i++;
            }
            a[i] = 0;
        }
    }

    private void insertionSort (int [] array)
    {
        for (int i = 1; i <array.length ; i++) {
            int current = array[i];
            int j = i;
            while ( j > 0 && current < array[j-1] )
            {
                array [j] = array [j-1];
                j--;
            }
            array [j] = current;
        }
    }

    public void print (int []a)
    {
        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
            if (i != a.length-1 )
                System.out.print(",");
            else
                continue;
        }
        System.out.print("]");
        System.out.println();
    }
}
