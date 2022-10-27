package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public void printDigitsSum(int t){
        int k =Math.abs(t);
        String a = Integer.toString (k);
        int b= 0;
        for (int i = 0; i <a.length() ; i++) {
            b+=Character.getNumericValue(a.charAt(i));


        }
        System.out.println(b);

    }
}
