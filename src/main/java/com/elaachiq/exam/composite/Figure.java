package com.elaachiq.exam.composite;

import java.io.Serializable;

import com.elaachiq.exam.observer.Observer;
import com.elaachiq.exam.observer.Options;

abstract public class Figure implements Observer, Serializable{

	protected Options options; 
	
	public abstract double calculerSurface();
	public abstract double calculerPerimetre();
	public abstract void draw();

}
