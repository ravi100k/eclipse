import java.util.LinkedList;

public class Solution1 {



LinkedList<Character> stack = new LinkedList<Character>();
LinkedList<Character> queue = new LinkedList<Character>();

int temp = -1;
int temp2 = -1;

 void pushCharacter(char ch)
     {
         stack.add(ch);
 }

void enqueueCharacter(char ch) 
    {
       queue.addFirst(ch);
}

char popCharacter() 
    {
    temp++;
    return (char) stack.get(temp);

}

char dequeueCharacter() 
    {
            temp2++;
    return (char) queue.get(temp2);
}
}