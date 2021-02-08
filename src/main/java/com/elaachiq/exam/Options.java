package com.elaachiq.exam;

import java.util.ArrayList;

import com.elaachiq.exam.composite.Figure;
import com.elaachiq.exam.observer.Observable;
import com.elaachiq.exam.observer.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Options implements Observable{
	private Color fillColor;
	private Color countourColor;
	private int countourEpesseur;
	
	public ArrayList<Observer> figurs;
	
	@Override
	public void ntifyAll() {
		figurs.forEach(observer -> observer.update(this));
		
	}
	@Override
	public void remove(Figure figure) {
		figurs.remove(figure);
		
	}
	@Override
	public void add(Figure figure) {
		figurs.add(figure);
		
	}
}
