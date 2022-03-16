package LeetCode;



//1491. Average Salary Excluding the Minimum and Maximum Salary
public class AverageSalary {
    public double average(int[] salary) {
        java.util.OptionalDouble min= java.util.OptionalDouble.of((double) java.util.Arrays.stream(salary).min().getAsInt());
        java.util.OptionalDouble max= java.util.OptionalDouble.of((double) java.util.Arrays.stream(salary).max().getAsInt());
        java.util.OptionalDouble sum=java.util.OptionalDouble.of((double) java.util.Arrays.stream(salary).sum());
        double reduce= min.getAsDouble()+ max.getAsDouble();
        return (sum.getAsDouble()-(reduce))/ (salary.length-2);
    }

    public static void main(String[] args) {
        System.out.println( new AverageSalary().average(new int[]{4000,3000,1000,20000}));
    }
}
