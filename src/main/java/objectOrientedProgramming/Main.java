package objectOrientedProgramming;

public class Main {

        public static void main (String[] args){
                var employee = new Employee(50000, 20);
                Employee.printNumberOfEmployees();
                int wage = employee.calculateWage(10);
                System.out.println(wage);
        }
    }
