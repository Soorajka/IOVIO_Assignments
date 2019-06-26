package assignment1;
public class Assignment1 {
static int ilamda  = 1; //Initial value to use in condition
static void result(int iVal) {//creating a static method for giving the max value
	if (iVal >= ilamda)	{
		String combVal = Integer.toString(iVal) + Integer.toString(iVal) + Integer.toString(iVal);
		int rVal = Integer.parseInt(combVal);//converting to int
		int divVal = rVal / (iVal+iVal+iVal); //getting the dividend
		//Validating condition for reminder, getting the first value of dividend and comparing with Lamda values Less than 3 digits etc
		if (rVal % (iVal+iVal+iVal) == 0 && (divVal/10) == iVal &&(String.valueOf(divVal).length()<3)) {  
		System.out.println("Lamda: " + divVal/10 + "\n" + "Sigma: "+ divVal%10 + "\n" + "Gama: "+ (iVal+iVal+iVal));
		}
	}
	else {
		//Printing the basic combination with ZERO
		System.out.println("Lamda: 0"  + "\n" + "Sigma: 0 - 9 " + "\n" + "Gama: 0");
	}
	iVal = iVal-1;    //Reducing the count
	if (iVal >= 0) {      //blocking negative values
	result(iVal);        //Repeating method call
	}
}
public static void main(String[] args) {
	result(9); //Calling method 
}
}
