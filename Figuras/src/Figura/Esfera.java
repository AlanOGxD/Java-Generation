package Figura;
//Clase concreta o tradicional que implementa metodos de una interfaz llamada Calculable
public class Esfera implements Calculable {

  //Atributos
  double radio;
  double pi = Math.PI;

  //Constructor
  Esfera(double radio){
      this.radio = radio;
  }

  //Metodos
  @Override
  public double calcularArea() {
      //Area 4 π r*2
      double area = (4*pi) * (radio * radio);
      return area;
  }

  @Override
  public double calcularVolumen() {
      //Volumen V = 4/3 π r³
      double volumen = (4 / 3) * pi * (radio * radio * radio);
      return volumen;
  }

  @Override
  public double calcularPerimetro() {
      //Perimetro 2 * π * r
      double perimetro = 2 * pi * radio;
      return perimetro;
  }

}