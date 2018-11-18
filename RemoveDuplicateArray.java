import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateArray {

    public static int removeDuplicate(int ar[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (ar[i] != ar[i+1]){
                temp[j++] = ar[i];
            }
        }
        temp[j++] = ar[n-1];

        for (int i=0; i<j; i++){
            ar[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {

        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int ar[] = new int[limit];
        System.out.println("Enter the elements");
        for(int i =0;i<limit;i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int length = ar.length;
        length = removeDuplicate(ar, length);
        System.out.println("After Removing Duplicate Elements");
        for (int i=0; i<length; i++)
            System.out.print(ar[i]+" ");
    }
}


