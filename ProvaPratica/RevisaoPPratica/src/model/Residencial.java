package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Residencial extends Telefone {
	
	private BooleanProperty internet;

	@Override
	public DoubleProperty valorBasico(){
		return  new SimpleDoubleProperty(15.00);
	}
	
	public boolean isInternet(){
		return internet.get();
	}

	public void setInternet(boolean internet) {
		this.internet.set(internet);
	}

}
