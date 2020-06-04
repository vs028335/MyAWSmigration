package com.SpringJdbc.AopLearning.Service;

import com.SpringJdbc.AopLearning.model.Circle;
import com.SpringJdbc.AopLearning.model.Triangle;

public class Service {

	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
