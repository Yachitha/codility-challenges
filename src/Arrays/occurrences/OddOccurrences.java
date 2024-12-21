package Arrays.occurrences;

public class OddOccurrences {
    public int solution(int[] A) {
        int result = 0;
        for (int i : A) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
        OddOccurrences oddOccurrences = new OddOccurrences();
        int[] A = {7, 3, 9, 3, 9, 9, 9};
        System.out.println(oddOccurrences.solution(A));
    }
}
