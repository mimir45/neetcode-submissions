class Solution {
 
public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    int res = 0;
    for (String c : operations) {
        if (c.equals("+")) {
            int a = stack.pop();
            int b = stack.pop();
            int x  = a + b;
            stack.push(b);
            stack.push(a);
            stack.push(x);
            continue;
        }
        if (c.equals("C")) {
            stack.pop();
            continue;
        }
        if (c.equals("D")) {
            int a = stack.peek();
            int x  = a * 2;
            stack.push(x);
            continue;
        }
        stack.push(Integer.valueOf(c));

    }

    while (!stack.empty()){
        res += stack.pop();
    }
    return res;
}

}