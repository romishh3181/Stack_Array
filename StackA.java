import java.util.Scanner;
public class StackA {
    public static final int max_size=100;
    public int[] arr;
    public int top;
    public StackA(){
        arr=new int[max_size];
        top=-1;
    }
    public  void push(int data){
        if(top==max_size-1){
            System.out.println("Stack Overflow, cant push element");
            return ;
        }
        arr[++top]=data;
        printstack();
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
        printstack();
    }
    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public void printstack(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackA stck=new StackA();
        while(true){
            System.out.println("/n choose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Check if stack is empty.");
            System.out.println("5. Get stack size");
            System.out.println("6. Exit");
            int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter element to push");
                int ele=sc.nextInt();
                stck.push(ele);
                break;
            case 2:
                stck.pop();
                break;
            case 3:
                System.out.println("Top element:"+stck.top());
                break;
            case 4:
                System.out.println(stck.isEmpty());
                break;
            case 5:
                System.out.println("Stack size="+stck.size());
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
        }
        }
    }
}

