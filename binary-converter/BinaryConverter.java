import java.util.*;

public class BinaryConverter {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Type a binary value: ");
		String binary = console.next();
		if(!isValid(binary)) {
			System.out.println("The binary you entered is invalid!");
		} else {
			System.out.println("Here is the binary value you typed " + binary + "!");
			System.out.println("This is your number in decimal: " + toDecimal(binary));
		}


	}

	public static boolean isValid(String binary) {
		for(int i = 0; i < binary.length(); i++) {
			char digit = binary.charAt(i);
			if(digit != '0' && digit != '1') {
				return false;
			}
		}
		return true;
	}

	public static int toDecimal(String binary) {
		int result = 0; 
		for(int i = binary.length() - 1; i >= 0; i--) {
			boolean one = charToInt(binary.charAt(i)) == 1;
			if(one) {
				result += Math.pow(2, i);
			}
		}
		return result;
	}

	public static int charToInt(char digit) {
		if(digit == '0') {
			return 0;
		} else {
			return 1;
		}
	}
}
