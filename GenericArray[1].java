/**
 * Created by pc on 2/18/2021.
 */
public class GenericArray <T> {
    T arr[];
    int num = 0;

    public GenericArray() {
        arr = (T[]) new Object[2];      //Allocation
    }

    public void add (T e)
    {
        if (num < arr.length)
        {
            arr[num++] = e;     //this puts e in the position num and add one on num
        }
    }

    public void print ()
    {
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1 )
                System.out.print(",");
            else
                continue;
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        GenericArray <Integer> array = new GenericArray<>();
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.print();
    }
}
