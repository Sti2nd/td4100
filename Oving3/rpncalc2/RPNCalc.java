package rpncalc2;

//Det vil være naturlig å bruke IlligalStateException fordi de ikke tar 
//inn noen argumenter...

import java.util.ArrayList;

public class RPNCalc {
	
	private ArrayList<Double> operands = new ArrayList<Double>();
	
	void push(double number) {
		operands.add(number);
	}

	int getSize() {
		return operands.size();
	}

	double peek(int index) {
		if (getSize() > 0) {
		return operands.get(getSize()-1-index);
		}
		return Double.NaN;
	}

	double pop() {
		if (getSize() > 0) {
			double element = peek(0);
			operands.remove(getSize()-1);
			return element;
		} else {
			return Double.NaN;
		}
	}

	void performOperation(char operator){
		double p1 = pop();
		double p2 = pop();
		if (operator == '+'){
			double sum = p1 + p2;
			push(sum);
		}else if (operator == '-'){
			double difference = (p2 - p1);
			push(difference);
		}else if (operator == '*'){
			double product = p1 * p2;
			push(product);
		}else if (operator == '/'){
			double quotient = p2 / p1;
			push(quotient);
		}else if (operator == '~'){
			push(p1);
			push(p2);
		}
	}


	@Override
	public String toString() {
		return "operands=" + operands;
	}

}