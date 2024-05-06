package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int res;
        int one;
        int second;
        int third;
        one = number % 10;
        second = (number / 10) % 10;
        third = number / 100;
        res = one * 100 + second * 10 + third;
        System.out.println(res);
    }
}
