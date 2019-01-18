/*
	Check if a number is a power of 2 or not
*/

public class powerTo{
	public static void main(String [] args){

		int num = 128;
		String powerTo = "";
		double sample = 0;


		for(double i = 0; i < num; i++){
			sample = Math.pow(i, 2);

			System.out.println("2^ of " + i + " is " + sample);

			int a = (int) sample;
			powerTo = powerTo + " " + a;

		}

		String [] myArray = powerTo.split(" ");

		String input = Integer.toString(num);

		boolean answer = false;

		for(int i = 0; i < myArray.length; i++){
			if(input.equals(myArray[i])){
				answer = true;
				}
			}

			//System.out.println(answer);
	}
}
