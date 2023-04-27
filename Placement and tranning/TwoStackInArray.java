package Stack;

public class TwoStackInArray {
    int arr[];
    int size;
    int top1, top2;

    TwoStackInArray(int n){
        size = n;
        arr = new int[n];
        top1= n/2 + 1; // 3, 2,1,0   6/2+ 1 = 4
        top2 = n/2;//4,5


    }

    //method to push an elemnt to top of stakc1
    public void push1(int x){
        if(top1 >0){
            top1--;
            arr[top1] = x;
        }
        else{
            System.out.println("Stack overflow "+ "by element" + x);
        }
        return ;
    }

    public void push2(int x){
        if(top2 <size-1){
            top2++;
            arr[top2] = x;

        }
        else{
            System.out.println("Stack overflow in 2nd stack " + "by element " + x);

        }
//        return -1;
    }

    // method to pop an elment from first stack;
    public int pop1(){
        if(top1 <= size/2){
            int x = arr[top1];
            top1++;
            return x;
        }else {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return 0;
    }

    // method to pop an elemtn from the 2 nd stack
    public int pop2(){
        if(top2>=size/2+1){
            int x = arr[top2];
            top2--;
            return x;
        }
        else{
            System.out.println("Stack overflow");
            System.exit(1);

        }
        return 1;
    }


    public static void main(String[] args){
TwoStackInArray ts = new TwoStackInArray(6);
ts.push1(3);
ts.push2(5);
ts.push1(2);
ts.push2(9);
ts.push1(10);
        System.out.println("The poped element from 1st stack is " + ts.pop1());
//ts.push2(20);
        System.out.println("The popped element from 2nd stack is :" + ts.pop2());
    }
}
