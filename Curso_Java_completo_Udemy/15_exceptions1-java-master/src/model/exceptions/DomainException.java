package model.exceptions;

public class DomainException extends Exception{

	//para uma classe serial é necessário ter númro de versionament
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	

}
