package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//atributos da classe
	private String name;
	private String email;
	private Date birthDate;
	
	//metodo padrão
	public Client() {
		
	}

	//metodo com os atributos
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	//metodos GETTERS e SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	//metodo para retornar os dados do cliente
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}

}
