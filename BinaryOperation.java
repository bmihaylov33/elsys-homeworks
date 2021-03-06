package org.elsys.postfix;

public abstract class BinaryOperation extends Operation {

	public BinaryOperation(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	double v1;
	double v2;
	}

	@Override
	public void eval() {
		// TODO Auto-generated method stub
		if(!getContext().empty()) {
			throw new IllegalStateException("not enough arguments");
		}
		else {
		double v1 = getContext().pop();
		double v2 = getContext().pop();
		double res = calc(v1,v2);
		System.out.println("Result: " + res);
		getContext().push(res);
	}
}
	public abstract double calc(double v1, double v2);
}
