package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        int sum = 1;
        while (num++ <= printToInclusive) {
            System.out.println(sum);
            sum*=num;
        }
    }
}
