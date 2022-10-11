/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Tester {
    /**
     *
     * @param args indispensable parameter for main.
     * main method where we created two employees, assigned the badge and showed all the data on the terminal.
     */
    public static void main(String[] args){
        // First employee
        Employee employee1 = new Employee(" Dino ",
                                          " Petrucci ",
                                          " Via Cipressi n 23 ");
        // Second employee
        Employee employee2 = new Employee(" Michele ",
                                          " Vario ",
                                          " Via Quercia n 67 ");
        // Badge 1
        Badge badgeDino = new Badge(employee1);
        // Badge 2
        Badge badgeMichele = new Badge(employee2);
        System.out.println("-------------------------Employee1----------------------------");
        badgeDino.showBadgeDetails();
        System.out.println("-------------------------Employee2----------------------------");
        badgeMichele.showBadgeDetails();
    }
}
