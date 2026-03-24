package org.example.lowLevelDesign.otherPatterns.javaTutorial;

public class StackImplUsingArray {
    int arr[] = new int[10];
    int topIdx = -1;

    public void push(int val){
        if(topIdx + 1 < 10){
            topIdx = topIdx+1;
            arr[topIdx] = val;
        }
    }

    public int pop(){
        if(topIdx == -1) return -1;

        topIdx = topIdx-1;
        return arr[topIdx+1];
    }

    public int peek(){
        if(topIdx == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[topIdx];
    }

    public static void main(String[] args) {
        StackImplUsingArray st = new StackImplUsingArray();
        st.push(10);
        st.push(5);
        st.push(8);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
