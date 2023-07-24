package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int n1=number/1000;
        int n2=(number-n1*1000)/100;
        int n3=(number-n1*1000-n2*100)/10;
        int n4=number-n1*1000-n2*100-n3*10;
        int sum=n1+n2+n3+n4;
        System.out.println(sum);
    }
}
