package Arrays.FrogJmp;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }

    public static void main(String[] args){
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(10, 1000000000, 10));
    }
}
