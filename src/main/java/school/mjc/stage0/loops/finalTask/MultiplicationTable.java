package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
            for (int j = 1; j < 11; j++) {
                System.out.println(String.format("%d x %d = %d",j,numberTableToPrint,numberTableToPrint*j));
            }
    }

    public static void main(String[] args) {
        MultiplicationTable s=new MultiplicationTable();
        s.printTable(2);
    }
}
