package POO;

public class Test {
	
	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		System.out.println(Felipe);
		Felipe.imprimirInfo();
		Felipe.saludar();
		
		
		System.out.println("**********************");
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "1234567890", "simi@lares.com", "Odontología", "1544385", "Consultorio B5", "avanzado", "matutino", 500);
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		
		System.out.println("**********************");
		
		
		//Instancia de Paciente con todos los datos
		Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
		System.out.println(Chencho);
		
		
		//instancia de Pacientes con datos obligatorios
		Paciente Masiosare = new Paciente("MAS12345", false, false);
		System.out.println(Masiosare);
		
		//Cambiar el false de seguroMedico a true
//		Masiosare.seguroGastosMedicos = true;
		System.out.println(Masiosare);
		
		
	}//Cierre método main

}//Cierre class persona
