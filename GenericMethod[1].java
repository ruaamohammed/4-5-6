/**
 * Created by pc on 2/18/2021.
 */
public class GenericMethod {
    public static <E> void print (E arr[])
    {
        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1 )
                System.out.print(",");
            else
                continue;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5};
        String [] s = {"A","B","C","D","E"};

        print(a);
        print(s);
    }
}
