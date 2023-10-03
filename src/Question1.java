import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question1
{
    public void test()
    {

    }
    public static void main(String[] args)
    {
        GenericStack<Integer> genericStack=new GenericStack<>();
        System.out.println("Test#1 : Integer");
        System.out.print("Enter Stack Size:");
        int size;
        Scanner scanner=new Scanner(System.in);
        try
        {
            size = scanner.nextInt();
            System.out.print("Enter Stack Elements:");
            for (int i = 0; i < size; i++) {
                int element = scanner.nextInt();
                genericStack.push(element);
            }
        }
        catch (Exception e)
        {
            System.out.println("Please Enter Integer and Try Again");
            main(new String[0]);
            return;
        }
        System.out.println("Popped: "+genericStack.pop());
        System.out.println("Popped: "+genericStack.pop());
        System.out.println("Size: "+genericStack.size());
        if(genericStack.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is not Empty");

        System.out.println("Test#2 : String");
        GenericStack<String> stringGenericStack=new GenericStack<>();
        System.out.print("Enter Stack Size:");
        size=scanner.nextInt();
        System.out.print("Enter Stack Elements:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<size;i++)
        {
            String element= null;
            try
            {
                element = reader.readLine();
                stringGenericStack.push(element);
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Popped: "+stringGenericStack.pop());
        System.out.println("Popped: "+stringGenericStack.pop());
        System.out.println("Size: "+stringGenericStack.size());

        if(stringGenericStack.isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Stack is not Empty");
        }


    }
}
