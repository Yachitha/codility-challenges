package Arrays.MissingElement;

public class MissingElem {
    public int solution(int[] A) {
        int n = A.length + 1;
        long sum = (long) n*(n+1)/ 2;
        long arrSum = 0;

        for (int i : A) {
            arrSum += i;
        }

        return (int) (sum - arrSum);
    }

    public static void main(String[] args){
        MissingElem missingElem = new MissingElem();
        System.out.println(missingElem.solution(new int[]{6, 3, 2, 5, 4}));
    }
}
