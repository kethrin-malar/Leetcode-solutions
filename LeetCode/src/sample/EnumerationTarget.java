// 2798 Number of Employees Who Met the Target

package sample;

public class EnumerationTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       
        int[] employeeHours = { 160, 180, 155, 190, 200, 168 };
        int targetHours = 170;

        int employeesMetTarget = numberOfEmployeesWhoMetTarget(employeeHours, targetHours);
        System.out.println("Number of employees who met the target: " + employeesMetTarget);
    }
}


	