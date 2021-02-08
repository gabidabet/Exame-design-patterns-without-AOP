package com.elaachiq.exam.composite;

import java.util.List;
import java.util.stream.Collectors;

import com.elaachiq.exam.observer.Observable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Groupe extends Figure{

	private List<Figure> childrens;
	@Override
	public double calculerSurface() {
		return childrens.stream()
				.map(children -> children.calculerSurface())
				.collect(Collectors.summingDouble(Double::doubleValue));
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return childrens.stream()
				.map(children -> children.calculerPerimetre())
				.collect(Collectors.summingDouble(Double::doubleValue));
	}

	@Override
	public void draw() {
		childrens.forEach(children -> children.draw());
	}

	@Override
	public void update(Observable observable) {
		childrens.forEach(children -> children.update(observable));
		
	}

}
