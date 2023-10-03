public class GenericStack<T>
{
    private Node top;
    private Integer size=1;
    private class Node
    {
      public T data;
      public Node next;
      public Node prev;
      Node(T data)
      {
          this.data=data;
          next=null;
          prev=null;
      }
    }
    public GenericStack()
    {
        top=null;
    }
    public void push(T item)
    {
        if(top==null)
        {
            top=new Node(item);
            size++;
        }
        else
        {
            top.next=new Node(item);
            top.next.prev=top;
            top=top.next;
            size++;
        }
    }
    public T pop()
    {
        if(top!=null)
        {
            T temp= top.data;
            top=top.prev;
            size--;
            return temp;
        }
        else
        {
            System.out.println("Stack is Empty");
            return null;
        }
    }

}
