package Templates;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class matchTemplate {
	
	public static int numOfChoices;
	public static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	public static String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	public static String[] multichoice;
	public static int numOfRows;
	
	public matchTemplate() {
		this(0, false);
	}
	
	public matchTemplate(int numOfChoices, boolean letters){
		this.numOfChoices = numOfChoices;
		this.multichoice = (letters == true ? this.letters : this.numbers);
	}
	
	public static void runTest(String[][] list, int numOfIter) {
		//Determine Number Of Rows
		int numbOfRows = 0;
		
		for (String[] row : list) {
			numbOfRows++;
		}
		numOfRows = numbOfRows;
		
		//how many times do you want to run
		for(int i = 0; i < numOfIter; i++) {
			run(list);
		}
	}
	
	public static void run(String [][] list) {
		//Find out which row
		int row = (int) (Math.random()*numOfRows);
		
		//Find out which column
		Random rand = new Random();
		int QCol = rand.nextInt(1);
		
		int ACol = (QCol == 0 ? 1 : 0);
		
		//Set the Question and Answer
		String question = list[row][QCol];
		String answer = list[row][ACol];
		
		//Print Question
		System.out.println("Match");
		System.out.println(question);
		
		//Multiple Choice
		if (numOfChoices != 0) {
			ArrayList<Integer> multipleChoices = new ArrayList<Integer>();
			int posOfAns = (int) (Math.random()*numOfChoices);
			
			/* Goal: Store all randomly generated numbers
			 * and index of the answer in an array list 
			 * so it can be read later as an index
			 * 
			 * One randomly generated number for correct answer 
			 * so that during the for loop I can add the index 
			 * of the answer.
			 * 
			 *  Also if the randomly generated number is the
			 *  answer's index, pick a different random number
			 * 
			 * And if the wrong index is already in the list, 
			 * pick a different one
			 */
			
			for (int i = 0; i < numOfChoices; i++) {
				int randWrong = (int) (Math.random()*numOfRows);
				
				while (randWrong == row) {
					randWrong = (int) (Math.random()*numOfRows);
				}
				
				for (int n = 0; n < multipleChoices.size(); n++) {
					while (randWrong == multipleChoices.get(n)) {
						randWrong = (int) (Math.random()*numOfRows);
					}
				}
				
				if ((posOfAns) == i) {
					multipleChoices.add(row);
				}else {
					multipleChoices.add(randWrong);
				}
			}
			
			System.out.println("Here are your choices: ");
			
			for (int i = 0; i < multipleChoices.size(); i++) {
				System.out.println(multichoice[i] + ": " + list[multipleChoices.get(i)][ACol]);
			}
			
			answer = multichoice[posOfAns];
			
		}
		//End of multiple choice code
		
		Scanner userInput = new Scanner(System.in);
		String userAnswer = userInput.next().toUpperCase(); 
		
		if (userAnswer.equals(answer)) {
			System.out.println("Correct! The answer was: " + answer);
		} else {
			System.out.println("INCORRECT! The answer was: " + answer);
		}
		
		//For Debugging within the list
		System.out.println(row);
		
		long currTime = System.currentTimeMillis();
		while(System.currentTimeMillis() - currTime < 3000) {
			
		}
		
		for (int i = 0; i < 10; ++i) System.out.println();

	}
	
}
