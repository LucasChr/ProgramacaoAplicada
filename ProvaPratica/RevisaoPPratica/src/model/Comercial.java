package model;

import java.time.LocalDate;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Comercial extends Telefone {

	private IntegerProperty ramais;
	
	@Override
	public DoubleProperty valorBasico(){
		Double valorBasico = 0.0;
		if(getDataInstalacao().isBefore(LocalDate.of(2015, 1, 1))){
			valorBasico = 25.0;
		} else {
			valorBasico = 37.0;
		}
		
		return new SimpleDoubleProperty(valorBasico);
	}

	public Integer getRamais() {
		return ramais.get();
	}

	public void setRamais(Integer ramais) {
		this.ramais.set(ramais);
	}
	
}
