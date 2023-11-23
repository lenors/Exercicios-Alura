package br.com.exercicios.www;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 32.9;
        double conversor = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura Fireheith é : " + conversor+ "F");

        int fireheight = (int) conversor;
        System.out.println("A temperatura fireheight em decimais é: " + fireheight);
    }
}
