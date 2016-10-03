/**
 * Created by Nick on 10/3/16.
 */
public class StringCalculator {
    private int sum = 0;

    public int Add(String num) {

        String[] s = num.split(",");

        if(num == ""){
            return sum;
        }

        if(s.length == 1) {
            int n = Integer.parseInt(num);
            return sum;
        }

        if(s.length >= 2) {

            for(int i=0;i<s.length;i++){
                sum += Integer.parseInt(s[i]);
            }

            return sum;
        }
        return sum;
    }
}
