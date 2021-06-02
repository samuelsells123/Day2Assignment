import java.util.Scanner;

public class DayTwo {
	public static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int select = 0;
		
		//printProblems();
		
		while(select != 21) {
			bufferPrint("1-19 \t: Problems" + "\n"
						+ "20 \t: Print Problems List" + "\n"
						+ "21 \t: Exit");
			System.out.print("Make a Decision: ");
			
			select = scan.nextInt();
			
			switch(select) {
				case 1:
					DayTwo.problem1();
					break;
				case 2:
					DayTwo.problem2();
					break;
				case 3:
					DayTwo.problem3();
					break;
				case 4:
					DayTwo.problem4();
					break;
				case 5:
					DayTwo.problem5();
					break;
				case 6:
					DayTwo.problem6();
					break;
				case 7:
					DayTwo.problem7();
					break;
				case 8:
					DayTwo.problem8();
					break;
				case 9:
					DayTwo.problem9();
					break;
				case 10:
					DayTwo.problem10();
					break;
				case 11:
					DayTwo.problem11();
					break;
				case 12:
					DayTwo.problem12();
					break;
				case 13:
					DayTwo.problem13();
					break;
				case 14:
					DayTwo.problem14();
					break;
				case 15:
					DayTwo.problem15();
					break;
				case 16:
					DayTwo.problem16();
					break;
				case 17:
					DayTwo.problem17();
					break;
				case 18:
					DayTwo.problem18();
					break;
				case 19:
					DayTwo.problem19();
					break;
				case 20:
					DayTwo.printProblems();
					break;
				case 21:
					System.out.println("\n" + "Exiting...");
					break;
				default:
					bufferPrint("None Chosen");
			}
		}
		
		scan.close();
	}
	
	public static void printProblems() {
		System.out.println("\n" + "Day 2 - Assignment\r\n"
				+ "------------------------------------------------------\r\n"
				+ "1.  Generate Multiplication Table using for loop\r\n"
				+ "2.  Display Fibonacci Series Using for Loop\r\n"
				+ "3. Display lowercase alphabet using for loop HINT -  for(c = 'a'; c <= 'z'; ++c)\r\n"
				+ "4. Reverse a Number using a while loop in Java HINT - Find the reminser of no by dividing 10  using % operator.\r\n"
				+ "5. Calculate the power of a number using a for loop.\r\n"
				+ "6. Program to Calculate Average Using Arrays\r\n"
				+ "7. Add Two Matrix Using Multi-dimensional Arrays\r\n"
				+ "8. Program to count vowels, consonants, digits, and spaces\r\n"
				+ "9.  Program to print half pyramid using *\r\n"
				+ "10. Count number of words\r\n"
				+ "11. Find the occurance of a specific character in sentence\r\n"
				+ "12. Remove all the space from string \r\n"
				+ "13.Use the interface as a parameter and write a calculator to complete addition, subtraction, multiplication and division operations. \r\n"
				+ " (1) Define an interface Compute with a method int computer(int n, int m). \r\n"
				+ " (2) Design four classes to implement this interface respectively to complete addition, subtraction, multiplication and division operations. \r\n"
				+ " (3) Design a class UseCompute, which contains methods: public void useCom(Compute com, int one, int two),\r\n"
				+ "	 This method can use the passed object to call the computer method to complete the operation and output the result of the operation. \r\n"
				+ " (4) Design a main class Test, call the method useCom in UseCompute to complete addition, subtraction, multiplication and division operations. \r\n"
				+ "14. Write Java programs as follows: \r\n"
				+ " (1) Define interface A, which contains the constant PI with a value of 3.14 and the abstract method double area(). \r\n"
				+ " (2) Define interface B, which contains the abstract method void setColor(String c). \r\n"
				+ " (3) Define interface C, which inherits interfaces A and B, and contains the abstract method void volume(). \r\n"
				+ " (4) Define the cylinder class Cylinder to implement interface C. This class contains three member variables: radius, radius, \r\n"
				+ " The height and color of the cylinder. \r\n"
				+ "15. Write a program to find the first and the last occurence of the letter 'o' and character ',' in \"Hello, World\".\r\n"
				+ "16.Input a string of alphabets. Find out the number of occurrence of all alphabets in that string. Find out the alphabet with maximum occurrence.\r\n"
				+ "17. Write a program to check if a given string is a Palindrome.\r\n"
				+ "A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.\r\n"
				+ "18. Write a program to find out the largest and smallest word in the string \"This is an umbrella\".\r\n"
				+ "19. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.");
	}
	
	public static void bufferPrint(String message) {
		System.out.println("\n" + message + "\n");
	}
	
	public static void problem1() {
		bufferPrint("Generate Multiplication Table w/ For Loop");
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				System.out.print((i*j) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void problem2() {
		bufferPrint("Display Fibonacci w/ For Loop");
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(num2 + " ");
			
			int num0 = num1;
			num1 = num2;
			num2 = num0 + num1;
		}
		
		System.out.println();
	}

	public static void problem3() {
		bufferPrint("Display Lowercase Alphabet w/ For Loop");
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
	}

	public static void problem4() {
		bufferPrint("Reverse Number w/ While Loop");
		
		System.out.print("Input Integer: ");
		int userInt = scan.nextInt();
		
		userInt = reverseNum(userInt);
		
		bufferPrint("Final #: " + userInt);
	}
	
	public static int reverseNum(int num) {
		int outputNum = 0;
		int count = 1;
		
		while(num > 0) {
			outputNum *= 10;
			outputNum += num % Math.pow(10, count);
			num /= 10;
		}
		
		return outputNum;
	}

	public static void problem5() {
		bufferPrint("Calculate Power w/ For Loop");
		
		System.out.print("Input Base: ");
		int base = scan.nextInt();
		System.out.print("Input Exponent: ");
		int exp = scan.nextInt();
		
		int power = 1;
		
		for(int i = 0; i < exp; i++) {
			power *= base;
		}
		
		bufferPrint("Power: " + power);
	}
	
	public static void problem6() {
		bufferPrint("Calculate Average Using Arrays");
		
		double[] testArray = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println("Print Array:");
		for(double d : testArray) {
			System.out.print(d + " ");
		}
		System.out.println("");
		
		bufferPrint("Array Average: " + averageArray(testArray));
	}
	
	public static double averageArray(double[] doubleArr) {
		double sum = 0.0;
		
		for(double d : doubleArr) {
			sum += d;
		}
		
		return sum / doubleArr.length;
	}
	
	public static void problem7() {
		
	}

	public static void problem8() {
		System.out.println("\n" + "Count Vowels, Consonants, Digits, and Spaces " + "\n");
		
		int vCount = 0;
		int cCount = 0;
		int dCount = 0;
		int sCount = 0;
		
		System.out.print("Input String: ");
		scan.nextLine();
		String s = scan.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isLetter(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
				   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
					vCount++;
				else
					cCount++;
			}
			else if(Character.isDigit(c)) {
				dCount++;
			}
			else if(c == ' ') {
				sCount++;
			}
		}
		
		System.out.println("\n" + "Vowel Count: " + vCount + "\n"
								+ "Consonant Count: " + cCount + "\n"
								+ "Digit Count: " + dCount + "\n"
								+ "Space Count: " + sCount + "\n");
	}
	
	public static void problem9() {
		
	}
	
	public static void problem10() {
		System.out.print("Input String: ");
		scan.nextLine();
		String s = scan.nextLine();
		
		bufferPrint("# of Words: " + s.split(" ").length);
	}

	public static void problem11() {
	
	}
	
	public static void problem12() {
		bufferPrint("Remove All Space From String");
		
		System.out.print("Input a String: ");
		
		scan.nextLine();
		String userString = scan.nextLine();
		
		userString = DayTwo.removeSpace(userString);
		
		bufferPrint("Final String: " + userString);
	}
	
	public static String removeSpace(String inputString) {
		String[] inputArray = inputString.split(" ");
		String outputString = "";
		
		for(String s : inputArray) {
			outputString += s;
		}
		
		return outputString;
	}
	
	public static void problem13() {
		
	}

	public static void problem14() {
	
	}
	
	public static void problem15() {
		
	}
	
	public static void problem16() {
		
	}

	public static void problem17() {
	
	}
	
	public static void problem18() {
		
	}
	
	public static void problem19() {
		
	}
}