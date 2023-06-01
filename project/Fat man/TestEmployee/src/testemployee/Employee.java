package testemployee;
public class Employee {
    int EmployeeId;
    String EmployeeName;
    double EmployeeSlaray;

    public Employee(int EmployeeId, String EmployeeName, double EmployeeSlaray) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.EmployeeSlaray = EmployeeSlaray;
    }
    
    @Override
    public String toString(){
      return EmployeeId+ " "+EmployeeName+" "+EmployeeSlaray+"\n";
    }
    
}
