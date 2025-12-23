package StacksDtataStructure;
class stack
{
    int[]arr = new int[5];
    int idx = 0;
    void push(int x)
    {
        if(idx==arr.length)
        {
           if(isEmpty()){
               System.out.println("Stack is full");
               return;
           }

        }
        arr[idx] = x;
        idx++;
    }
    int peek(int x) {
        if (idx == 0) {
            System.out.println("stack is empty!!");
            return -1;
        }
        return arr[idx - 1];
    }


    int pop()
        {
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
          int top = arr[idx-1];
        arr[idx-1] = 0;
          idx--;
          return top;
        }
        int size(){
        return idx;
        }

        boolean isEmpty()
        {
            if(idx==arr.length) return true;
            else return false;
        }
        void display(){
        for(int i =0;i<idx;i++){
            System.out.print(arr[i]+" ");
                    }
            System.out.println();
            }

}
public class ArrayImplementation {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
