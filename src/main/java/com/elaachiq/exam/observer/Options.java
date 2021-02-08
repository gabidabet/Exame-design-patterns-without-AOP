package com.elaachiq.exam.observer;

import com.elaachiq.exam.Color;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Options{
	private Color fillColor;
	private int contourEpesseur;
	private Color contourColor;
}
