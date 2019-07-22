package Entities;

public class Student {
	private double Nota1;
	private double Nota2;
	private double Nota3;
	private double Media;
	
	public void SetValues(double nota1, double nota2, double nota3) {
		Nota1=nota1;
		Nota2=nota2;
		Nota3=nota3;
	}
	
	public String Media() {
		double media=Nota1+Nota2+Nota3;
		return (media>=60.0)?String.format("Final Grade= %.2f \n PASS", media):String.format("Final Grade= %.2f \n FAILED \n Missing %.2f", media, 60.0-media);
		
	}
}
