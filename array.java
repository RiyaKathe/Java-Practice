import java.util.Scanner;
public class array
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();

        System.out.println("Enetr an elements =");
        int [] arr =new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    
        for(int i=0;i<size;i++)
        {
           System.out.println("Element ="+arr[i]);
        }

        System.out.println("Enetr an elements to be search =");
        int key = sc.nextInt();
        for(int i=0 ;i<=arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("The Element  "+key+" is  found at "+arr[i]);
                break;
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }



    }
}
