import java.io.*;

public class MergeTwoArrays {
    public static void main(String[] args)
    {
        int first[] = { 1, 2, 3 };
        int second[] = { 0, 5, 7, 9 };

        int a = first.length;
        int b = second.length;
        int third = a + b;
        int[] c = new int[third];

        for (int i = 0; i < a; i = i + 1) {
            c[i] = first[i];
        }

        for (int i = 0; i < b; i = i + 1) {
            c[a + i] = second[i];
        }

        for (int i = 0; i < third; i = i + 1) {
            System.out.println(c[i]);
        }
    }
}



