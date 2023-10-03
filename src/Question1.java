public class Question1
{
    public static void main(String[] args)
    {
        GenericStack<Integer> genericStack=new GenericStack<>();
        genericStack.push(1);
        genericStack.push(2);
        genericStack.push(3);
        for (int i=1;i<=5;i++)
        {
            System.out.println(genericStack.pop());
        }

    }
}
