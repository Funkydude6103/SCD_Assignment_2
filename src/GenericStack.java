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
        }
        else
        {
            top.next=new Node(item);
            top.next.prev=top;
            top=top.next;
        }
        size++;
    }
    public T pop()
    {
        try {
            if (top != null) {
                T temp = top.data;
                if (top.prev != null) {
                    top = top.prev;
                    top.next = null;
                } else {
                    top = null;
                }
                size--;
                return temp;
            }
            else
            {
                throw new Exception("Stack is Empty");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public int size()
    {
        return size-1;
    }
    Boolean isEmpty()
    {
        return (size-1)==0;
    }

}
