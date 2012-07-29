package com.example.tallink.domain;

public class Operand {
	private Integer operand_a;
	private Integer operand_b;
	private Integer result;

	public Integer getA() {
		return operand_a;
	}
	public void setA(Integer operand) {
		this.operand_a = operand;
	}

	public Integer getB() {
		return operand_b;
	}
	public void setB(Integer operand) {
		this.operand_b = operand;
	}

	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
}
