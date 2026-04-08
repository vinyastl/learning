class Stack {
    int stck[] = new int[10];
    int tops;

    Stack() {
        tops = -1;
    }

    void push(int item) {
        if (tops == 9) {
            System.out.println("The stack is full");
        } else {
            stck[++tops] = item;
        }
    }

    int pop() {
        if (tops < 0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            return stck[tops--];
        }
    }
}

class TestCase {
    public static void main(String[] args) {
        Stack st1 = new Stack();

        st1.push(10);
        st1.push(20);
        st1.push(30);

        System.out.println("Popped: " + st1.pop());
        System.out.println("Popped: " + st1.pop());
        System.out.println("Popped: " + st1.pop());
    }
}