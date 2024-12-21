package Arrays.rotation;

public class CyclicRotation {

    int[] cyclicRotateArray(int[] arr, int k) {
        int n = arr.length;

        for (int i=0; i<k; i++) {
            int temp = arr[n-1];
            for (int j=n-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }

        return arr;
    }

    public static void main(String[] args){
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int[] result = cyclicRotation.cyclicRotateArray(arr, k);

        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
