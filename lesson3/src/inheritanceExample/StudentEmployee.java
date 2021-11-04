package inheritanceExample;

public class StudentEmployee extends Student{
    private  String employeeId;
    private double rateOfPay;

    public StudentEmployee(String firstName, String lastName, String studentId, double rateOfPay, String employeeID){
        super(firstName, lastName, studentId);
        this. rateOfPay = rateOfPay;
        this.employeeId = employeeID;

    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    @Override
    public String toString(){
        return super.toString()+ "Pay rate "+ rateOfPay+ "employeeID" +employeeId;
    }
}
