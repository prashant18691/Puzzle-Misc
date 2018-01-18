package com.puzzle;

import java.util.Stack;

public class EvaluateExpression {
	
	public int evaluate(String s){
		char[] tokens = s.toCharArray();
		Stack<Integer> values = new Stack<>();
		Stack<Character> ops = new Stack<>();
		
		for(int i=0;i<tokens.length;i++){
			if(tokens[i]==' ')
				continue;
			else if(tokens[i]>='0' && tokens[i]<='9'){
				StringBuffer st = new StringBuffer();
				while(i<tokens.length && tokens[i]>='0' && tokens[i]<='9')
					st.append(tokens[i++]);
				values.push(Integer.parseInt(st.toString()));
			}
			else if(tokens[i]=='(')
				ops.push(tokens[i]);
			else if(tokens[i]==')'){
				
				while(ops.peek()!='(')
					values.push(applyOps(ops.pop(), values.pop(), values.pop()));
				ops.pop();
				
			}
			else if(tokens[i]=='+'||tokens[i]=='-'||tokens[i]=='*'||tokens[i]=='/'){
				
				while(!ops.empty() && hasPrecedence(tokens[i],ops.peek()))
					values.push(applyOps(ops.pop(), values.pop(), values.pop()));
				
				ops.push(tokens[i]);				
			}
		}
		
		while(!ops.empty())
			values.push(applyOps(ops.pop(), values.pop(), values.pop()));
		
		return values.pop();
	}
	
	public boolean hasPrecedence(char op1, char op2) {

		if(op2=='(' || op2==')')
			return false;
		
		if((op1=='*' || op1=='/') && (op2=='+' || op2=='-'))
			return false;
		
		return true;
	}

	public int applyOps(char ops,int b, int a){
		switch(ops){
		
		case '+':
		{
			return a+b;
		}
		case '-':
		{
			return a-b;
		}
		case '*':
		{
			return a*b;
		}
		case '/':
		{
			if(b==0)
				throw new UnsupportedOperationException("Cannot divide by zero.");
			return a/b;
		}
		
		
		}
		
		return 0;
	}

	public static void main(String[] args) {

		EvaluateExpression e = new EvaluateExpression();
		System.out.println(e.evaluate("(100 * ( 2 + 12 ) / 7)"));
	}

}
