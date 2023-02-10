import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Drumstyle92
 * class regarding employee badges.
 */
public class Badge {
    /**
     * total employee variable.
     */
    private static int totalNumberOfEmployees;
    /**
     * badge code variable.
     *
     */
    private String badgeIdCode;
    /**
     * Object of the Employee class.
     */
    public Employee employee;

    /**
     *
     * @param employeeThatNeedsBadge parameter where you enter the employee object to give it a badge.
     * badge maker that tracks employees, a parameter and a badge code.
     */
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeeNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    /**
     * method that tracks employees.
     */
    private static void keepTrackOfEmployeeNumber(){
        ++totalNumberOfEmployees;
    }

    /**
     *
     * @return The badge serial code return.
     * method that generates the badge code.
     */
    @Contract(pure = true)
    private @NotNull String generateBadgeIdCode(){
        String string = "XYZ"+employee.name+employee.surname+"ZYX";
        return string.replaceAll("[\\s|\\u00A0]+", "");
    }

    /**
     * method that show the total number of employees, employee data and badge code.
     */
    public void showBadgeDetails(){
        System.out.println("Tracked employees: " + totalNumberOfEmployees);
        System.out.println("Employee data: " + employee.getEmployeeDetails());
        System.out.println("Badge code: " + this.badgeIdCode);
    }


}
