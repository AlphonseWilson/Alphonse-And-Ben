package com.revature.calculator;

public class Calculator {
	private double operatorOne;
	private double operatorTwo;
	private String operatorArithmetic;
	private double result;
	
	
	/*public Calculator(double operatorOne, double operatorTwo, char operatorArithmetic){
		this.operatorOne = operatorOne;
		this.operatorTwo = operatorTwo;
		this.operatorArithmetic = operatorArithmetic;
		
	}*/
	/**
	 * @return the operatorOne
	 */
	public double getOperatorOne() {
		return operatorOne;
	}
	/**
	 * @param operatorOne the operatorOne to set
	 */
	public void setOperatorOne(double operatorOne) {
		this.operatorOne = operatorOne;
	}
	/**
	 * @return the operatorTwo
	 */
	public double getOperatorTwo() {
		return operatorTwo;
	}
	/**
	 * @param operatorTwo the operatorTwo to set
	 */
	public void setOperatorTwo(double operatorTwo) {
		this.operatorTwo = operatorTwo;
	}
	/**
	 * @return the operatorArithmetic
	 */
	public String getOperatorArithmetic() {
		return operatorArithmetic;
	}
	/**
	 * @param operatorArithmetic the operatorArithmetic to set
	 */
	public void setOperatorArithmetic(String operatorArithmetic) {
		this.operatorArithmetic = operatorArithmetic;
	}
	
	public double addition(){
		return setResult(operatorOne + operatorTwo);
		
	}
	public double subtract(){
		return setResult(operatorOne - operatorTwo);
		
	}public double multiply(){
		return setResult(operatorOne * operatorTwo);
		
	}
	public double divide(){
		return setResult(operatorOne / operatorTwo);
		
	}
	/**
	 * @return the result
	 */
	public double getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public double setResult(double result) {
		this.result = result;
		return result;
	}

}
