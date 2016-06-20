package model;

import java.time.LocalDate;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Telefone {

	private StringProperty usuario;
	private StringProperty numero;
	private ObjectProperty<LocalDate> dataInstalacao;

	public abstract DoubleProperty valorBasico();

	public Telefone() {
		usuario = new SimpleStringProperty();
		numero = new SimpleStringProperty();
		dataInstalacao = new SimpleObjectProperty<>();
	}

	public String getUsuario() {
		return usuario.get();
	}

	public void setUsuario(String usuario) {
		this.usuario.set(usuario);
	}

	public String getNumero() {
		return numero.get();
	}

	public void setNumero(String numero) {
		this.numero.set(numero);
	}

	public LocalDate getDataInstalacao() {
		return dataInstalacao.get();
	}

	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao.set(dataInstalacao);
	}

	public StringProperty getUsuarioProperty() {
		return this.usuario;
	}

	public StringProperty getNumeroProperty() {
		return this.numero;
	}
}