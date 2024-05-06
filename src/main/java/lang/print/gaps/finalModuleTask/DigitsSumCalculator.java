package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int res;
        int one;
        int second;
        int third;
        int four;
        one = number % 10;
        second = (number / 10) % 10;
        third = (number / 100) % 10;
        four = number / 1000;
        res = one + second + third + four;
        System.out.println(res);
    }
}
