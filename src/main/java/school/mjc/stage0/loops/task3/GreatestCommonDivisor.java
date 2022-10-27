package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {

    public void printGCD(int first, int second) {
        int m =0;
        int a =Math.min(first,second);
        if (a==0){
            System.out.println(Math.max(first,second));}
        else {
        for (int i = 1; i <=a ; i++) {
            if (first%i==0&&second%i==0){
                m=i;
            }

        }
        System.out.println(m);}
    }
}
