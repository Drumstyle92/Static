/**
 * @author Drumstyle92
 * Employee class.
 */
public class Employee {
    /**
     * employee name variable.
     */
    public String name;
    /**
     * employee surname variable.
     */
    public String surname;
    /**
     *  employee address variable.
     */
    public String address;

    /**
     *
     * @param newEmployeeName Write the employee's name.
     * @param newEmployeeSurname Write the employee's surname.
     * @param newEmployeeAddress Write the employee's address.
     * the constructor of the Employee class with parameters.
     *
     */
    public Employee(String newEmployeeName,String newEmployeeSurname,String newEmployeeAddress){
       this.name = newEmployeeName;
       this.surname = newEmployeeSurname;
       this.address = newEmployeeAddress;
    }

    /**
     *
     * @return Returns the name, surname and address of the employee.
     * method with variables instantiated by the Employee class.
     */
    public String getEmployeeDetails(){
        return "\n-Name:" + this.name +"\n"+"-Last name:"
                +this.surname+"\n"+"-Address:"+this.address;
    }
}
