package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int n1=number/100;
        int n2=(number-n1*100)/10;
        int n3=number-n1*100-n2*10;
        System.out.print(n3);
        System.out.print(n2);
        System.out.print(n1);
        System.out.print('\n');

    }
}
