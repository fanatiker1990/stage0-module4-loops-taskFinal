package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i <cathetusLength; i++) {
            StringBuilder line=new StringBuilder();
            for (int j = 0; j < cathetusLength; j++) {
                if(j>cathetusLength-i-2){
                    line.append("*");
                }else {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
