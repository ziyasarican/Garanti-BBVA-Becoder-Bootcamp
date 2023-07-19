package recursiveFunct_hafta1;

public class Main {
    public static void main(String[] args) {

        int num = 16;
        boolean isNegative = false;
        recursivePattern(num, num, isNegative);
    }
    public static void recursivePattern(int num, int originalNum, boolean everNegative) {
        System.out.println(num);
        if (num <= 0)
            everNegative = true;
        if(everNegative == false)
             recursivePattern(num-5, originalNum, everNegative);
        else if (everNegative == true && num < originalNum)
             recursivePattern(num+5, originalNum, everNegative);

    }
}
