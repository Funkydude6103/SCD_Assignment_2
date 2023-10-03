class Node
{
    public char value;
    public Node next;
    public Node prev;

    Node(char c)
    {
        value = c;
    }
}

class Mapping
{
    Node [] nodes;
    int [] ascii;
    public Mapping()
    {
        nodes=new Node[128];
        ascii=new int[128];
        for (int i=0;i<128;i++)
        {
            ascii[i]=0;
            nodes[i]=null;
        }
    }
    void put(char c,Node node)
    {
        ascii[c]=1;
        nodes[c]=node;
    }
    boolean containsKey(char c)
    {
        return ascii[c] == 1;
    }
    Node get(char c)
    {
        return nodes[c];
    }
}

public class FirstNonRepeatingStream
{

    private Mapping mapping;
    private Node head;
    private Node tail;



    public FirstNonRepeatingStream()
    {
        mapping=new Mapping();
        head = new Node('\0');
        tail = new Node('\0');
        head.next = tail;
        tail.prev = head;
    }

    public void add(char c)
    {
        if (!mapping.containsKey(c))
        {
            Node newNode = new Node(c);
            mapping.put(c, newNode);
            insert(newNode);
        }
        else
        {
            Node existingNode = mapping.get(c);
            if (existingNode != null)
            {
                mapping.put(c, null);
                removeNode(existingNode);
            }
        }
    }

    public char getFirstNonRepeating()
    {
        if (head.next != tail)
        {
            return head.next.value;
        }
        return '-';
    }

    private void insert(Node newNode)
    {
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    private void removeNode(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}
