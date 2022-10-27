package school.mjc.stage0.loops.task3;

public class FibonacciSeries {

    public void printFibonacci(int lastFibonacci) {
        int n3 =0;
        int n2 =1;
        int n1=0;
        int k =0;
        for (int i = 0; i <lastFibonacci-1 ; i++) {
            System.out.println(n3);
            if (k ==0){
                System.out.println(1);
                k++;
            }
            n3 =n2+n1;
            n1=n2;
            n2=n3;


        }
    }
}
