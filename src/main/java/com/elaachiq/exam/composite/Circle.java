package com.elaachiq.exam.composite;

import com.elaachiq.exam.Color;
import com.elaachiq.exam.Point;
import com.elaachiq.exam.observer.Observable;
import com.elaachiq.exam.observer.Options;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle extends Figure{
	private Point center;
	private double rayon;
	@Override
	public double calculerSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public void draw() {
		System.out.println(String.format(
				"Draw Function Of Circle with center (x = %s, y = %s) and r = %s", 
				this.center.getX(),this.center.getY(), this.rayon));
	}

	@Override
	public void update(Observable observable) {
		 int contourEpesseur = ((Options) observable).getContourEpesseur();
	     Color fillColor =((Options) observable).getFillColor();
	     Color contourColor =((Options) observable).getContourColor();
	     
	     System.out.println(String.format("Updated -> Fill : %s, Stroke : %s, StrokFill : %s ",fillColor,contourEpesseur,contourColor));
		
	}
	

}
