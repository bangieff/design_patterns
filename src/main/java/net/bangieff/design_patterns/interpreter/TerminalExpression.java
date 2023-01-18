package net.bangieff.design_patterns.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	
	@Override
	public boolean interpret(String str) {
		boolean result = false;
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String test = st.nextToken();
			if(test.equals(data)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
