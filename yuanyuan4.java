// yuanyuan4

import java.util.Scanner;

public class yuanyuan4 
{
    public static void main(String[] args) 
    {
	Scanner userinput = new Scanner(System.in);
        int x = 0;
        
        while (true) 
	{
            System.out.print("Enter your choice: ");
            
            x = userinput.nextInt();
            
            switch (x) 
	    {
                case 1:
                    System.out.println("option 1");
                    break;
                case 2:
                    System.out.println("option 2");
                    break;
                case 3:
                    System.out.println("option 3");
                    break;
                case 4:
                    System.out.println("option 4");
                    userinput.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
	}
    }
}

