
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertAndDelete {

    public static void main(String[] args) 
{
    Scanner sc =new Scanner(System.in);
    ArrayList<Integer> l = new ArrayList<Integer>();
    int n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
    l.add(i,sc.nextInt());
    }
    int q = sc.nextInt();
    for(int i=0;i<q;i++)
    {String s=sc.next();
        if(s.equals("Insert"))
            {
             int x = sc.nextInt();
            int y = sc.nextInt();
            l.add(x,y);
        }
        else if(s.equals("Delete"))
            {
             int x = sc.nextInt();
            l.remove(x);
        }
    }
    Iterator<Integer> it = l.iterator();
    while(it.hasNext())
    {
        Integer ir = (Integer)it.next();
        System.out.print(ir+" ");}
    sc.close();
}
}

