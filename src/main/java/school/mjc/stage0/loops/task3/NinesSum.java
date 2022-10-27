package school.mjc.stage0.loops.task3;

public class NinesSum {

    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber>0){
            int s =0;
            int t =1;
            int l =0;
            for (int i = 1; i <=lengthOfLastNumber ; i++) {
                while (t<=i){
                    s=s*10+9;
                    t++;
                }
               l =l+s;
            }
            System.out.println(l);
        }else {
            System.out.println(0);
        }

    }
}
