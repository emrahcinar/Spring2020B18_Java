package day24_Methods.Warmup;

/*3. write a method called Calculation, that can accepts 3 parameters:
 2 numbers and one operator, and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, "*") ==> 20;


 */
public class task3_04_16_2020 {
    public static void main(String[] args) {
Calculation(10,2,"/");

    }


    public static void Calculation(int num1, int num2, String operator) {

        int  result =(operator.equals( "+"))?num1+num2:(operator.equals("-"))?num1-num2:(operator.equals("*"))
                ?num1*num2:(operator.equals("%"))?num1%num2:num1/num2;

        System.out.println(result);

    }

}
