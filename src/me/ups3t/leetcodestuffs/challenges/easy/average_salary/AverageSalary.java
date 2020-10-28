package me.ups3t.leetcodestuffs.challenges.easy.average_salary;

public class AverageSalary {

    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < salary.length; i++) {
            if(salary[i] < min) {
                min = salary[i];
            }

            if(salary[i] > max) {
                max = salary[i];
            }
        }

        double total = 0;

        for(int i = 0; i < salary.length; i++) {
            if(salary[i] != min && salary[i] != max) {
                total += salary[i];
            }
        }

        return total / (salary.length - 2);
    }

    public static void main(String[] args) {
        AverageSalary salary = new AverageSalary();

        System.out.println(salary.average(new int[]{10, 20, 30}));
    }

}
