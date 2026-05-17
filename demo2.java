import java.util.Scanner;
public class demo2 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Choose a button \n B1= hello \n B2= Namaste \n B3= Good Morning \n B4= Bonjo \n");
        int button =scanner.nextInt();

        if(button==1)
        {
            System.out.println("hello");

        }
        else if(button==2)
        {
            System.out.println("Namaste");
        }
        else if(button==3)
        {
            System.out.print("Good Morning");
        }
        else
        {
             System.out.print("Bonjo");
        }

    scanner.close();
    }
    
}
