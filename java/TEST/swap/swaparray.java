package swap;

public class swaparray {

    public static void main(String[] args) {

        int[] a = {2,1,3,1};   

        for (int i = 0; i < 4; i++) {
            for (int j =0; j<4; j++) {
                if ( a[i] >= a[j] ) {
                int swap = a[i];
                a[i]=a[j];
                a[j]=swap;
                }     
            }       
        }

        for (int i=0; i<4;i++) {
            System.out.print(a[i] + " ");
        }
    }
}