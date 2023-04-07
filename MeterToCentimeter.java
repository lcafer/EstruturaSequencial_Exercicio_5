package EstruturaSequencial_Exercicio_5;
import java.util.Scanner;

class MeterToCentimeter {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//interaja com o usuário
        System.out.println("Insira um valor em metros para converter em centimetros:");
        //pegue o input do usuário e transforme em string
        String inputToString = userInput.nextLine();
        //apenas guarde o número, ponto e virgula.
        inputToString = inputToString.replaceAll("[^[+-]?([0-9]*[.,])?[0-9]+]", "");
        //caso o número for digitado com virgula e não ponto. Troque-os para armazenar na variável double.
        if(inputToString.contains(",")) inputToString = inputToString.replace(",", ".");
        //centimetro = metro * 100.
		//1cm = 10^-2m(0,01m).
		final double CENTIMETER_CONSTANT = 100;
		double conversionMeterToCentimeter = Double.parseDouble(inputToString) * CENTIMETER_CONSTANT;
        inputToString = String.valueOf(conversionMeterToCentimeter);
        //Dê o output com virgula e não ponto. 
        String dotForComma = inputToString.replace(".", ",");
        System.out.println(dotForComma + " cm");
        userInput.close();
	}
}
