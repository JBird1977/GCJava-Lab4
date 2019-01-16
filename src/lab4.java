import java.util.Scanner;

public class lab4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iNum = 0;
        String cont;
        
        
        do {
            
            System.out.println("Learn your squares and cubes!");
            System.out.println();
            
            System.out.print("Please enter an integer: ");
            iNum = scan.nextInt();
            scan.nextLine();
            System.out.printf("%-10s %-10s %-10s \n", "Number", "Squared", "Cubed" );
            System.out.printf("%-10s %-10s %-10s \n", "======", "=======", "=====");
            
            for (int i = 1; i <= iNum; i++) {
                
                System.out.printf("%-10d %-10d %-10d \n", i, (i*i), (i*i*i));
                
            }
            System.out.println();
            System.out.print("Do you want to continue? (y/n) ");
            cont = scan.nextLine();
            
        } while (!(cont.equals("n" )) && !(cont.equals("N")) );
        
        System.out.println("Goodbye!");
        
        scan.close();
    }

}
