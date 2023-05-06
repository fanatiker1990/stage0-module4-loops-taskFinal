package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int size = cathetusLength;
        for (int i = 0; i < size; i++) {
            // printing spaces
            for (int j = 0; j < size-i-1; j++) {
                System.out.print(" ");
            }
            // printing number
            int s=1;
            int m=i+1;
            for (int k = 0; k < 2*i+1; k++) {
                if(k>=i){
                System.out.printf("%d", s++);
                }
                else {
                    System.out.print(m--);
                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }
}
