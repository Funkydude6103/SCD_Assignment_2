import java.util.ArrayList;
import java.util.List;

public class Question3
{
    static void mergeIntervals(List<int[]> intervals)
    {
        boolean check=false;
        boolean check2=true;
       for(int i=0;i<intervals.size();i++)
       {
           if(i!=intervals.size()-1 && intervals.get(i)[1]>intervals.get(i+1)[0])
           {
               if(check2)
               {
                   System.out.print("[" + intervals.get(i)[0] + ",");
                   check = true;
                   check2 = false;
               }
           }
           else
           {
               if(check)
               {
                   System.out.println(intervals.get(i)[1] + "]");
                   check=false;
                   check2=true;
               }
               else
               {
                   System.out.println("["+intervals.get(i)[0]+","+intervals.get(i)[1] + "]");
               }
           }
       }

    }
    public static void main(String[] args)
    {
        List<int []> list=new ArrayList<>();
        list.add(new int[]{1, 3});
        list.add(new int[]{2, 6});
        list.add(new int[]{5, 10});
        list.add(new int[]{9, 18});
        mergeIntervals(list);
    }
}
