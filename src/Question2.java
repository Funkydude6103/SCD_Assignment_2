
public class Question2
{

    public static void main(String[] args)
    {
        FirstNonRepeatingStream stream = new FirstNonRepeatingStream();
        FirstNonRepeatingStream stream1 = new FirstNonRepeatingStream();
        FirstNonRepeatingStream stream2 = new FirstNonRepeatingStream();

        stream.add('a');
        stream.add('b');
        stream.add('a');

        System.out.println("Stream: ['a', 'b', 'a']");
        System.out.println(stream.getFirstNonRepeating());


        stream1.add('a');
        stream1.add('b');
        stream1.add('a');
        stream1.add('b');


        System.out.println("Stream: ['a', 'b', 'a', 'b']");
        System.out.println(stream1.getFirstNonRepeating());

        stream2.add('a');
        stream2.add('b');
        stream2.add('b');
        System.out.println("Stream: ['a', 'b', 'b']");
        System.out.println(stream2.getFirstNonRepeating());
    }
}
