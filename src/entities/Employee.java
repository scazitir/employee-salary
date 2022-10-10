package entities;

public class Employee {

    public String name;
    public Double grossPay;
    public Double tax;



    public double netSalary(){
        return grossPay - tax;
    }

    public void increaseSalary(double percentage){
        this.grossPay += (percentage * grossPay/100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(", $");
        sb.append(String.format("%.2f", netSalary()));

        return sb.toString();
    }
}
