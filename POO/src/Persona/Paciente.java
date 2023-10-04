package Persona;

public class Paciente {

	//1. Atributos 
	
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	//2.Constructor que recopile todos los datos 
	Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos, String cita, String doctorAsignado, boolean alergias) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias; 
	}//constructor con todos los campos
	
	//2.1 Constructor que recopile solo los datos requeridos u obligatorios 
	Paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;		 
	}//constructor sin todos los campos
	
		
	//3 Metodos
	@Override
	//Metodo llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [númeroSeguroSocial = " + numeroSeguroSocial + ", tipoSangre = " + tipoSangre + ", expediente = " + expediente + ", seguroGastosMédicos = " + seguroGastosMedicos + ", cita = " + cita + ", doctorAsignado = " + doctorAsignado + ", alergias = " + alergias + "]";
	}//toString

	
	
	//getter (traer)
	public boolean getSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}
	//setter (poner)
	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
	
	
	
	
} //class paciente