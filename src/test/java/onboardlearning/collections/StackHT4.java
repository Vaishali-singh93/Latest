package onboardlearning.collections;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StackHT4 {

    private static void parenthesis(String parenthesisExpr) {
        int i,len;
        char ch;
        Stack<Character> st = new Stack<>();
        len = parenthesisExpr.length();
        for (i=0;i<len;i++) {
            ch=parenthesisExpr.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty() || st.pop() != '(') {
                    System.out.println("false");
                    return;
                }
            } else if (ch == '}') {
                if(st.isEmpty() || st.pop() != '{') {
                    System.out.println("false");
                    return;
                }
            } else if (ch == ']') {
                if(st.isEmpty() || st.pop() != '[') {
                    System.out.println("false");
                    return;
                }
            }
        } if(st.isEmpty()) {
            System.out.println("true");

        } else System.out.println("false");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter expression to be checked");
        String parenthesisExpr = sc.nextLine();
        StackHT4.parenthesis(parenthesisExpr);
    }
}
