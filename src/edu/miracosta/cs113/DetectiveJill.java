package edu.miracosta.cs113;

import java.util.Scanner;

import model.AssistantJack;
import model.Theory;

public class DetectiveJill {

	public static void main(String[] args) {
		//Same as RandomClue.java with changed PROCESSING portion
		  // DECLARATION + INITIALIZATION
        int answerSet, solution, murder = 1, weapon = 1, location = 1;
        Theory answer;
        AssistantJack jack;
        Scanner keyboard = new Scanner(System.in);
        
        // INPUT
        System.out.print("Which theory would like you like to test? (1, 2, 3[random]): ");
        answerSet = keyboard.nextInt();
        keyboard.close();

        // PROCESSING
        jack = new AssistantJack(answerSet);

       
        	for(int i = 1; i <= 6; i++) {
	        	weapon = i;
	           for(int j = 1; j <= 10; j++) { 
	        	location = j;
	        	for(int k = 1; k <= 6; k++) {
	        		murder = k;
	        		solution = jack.checkAnswer(weapon, location, murder);
	        		if(solution == 0) {
	        			i = 7;
	        			j = 11;
	        			k = 7;
	        		}
	        		}
	           }
        	}
      

        answer = new Theory(weapon, location, murder);

        // OUTPUT
        System.out.println("Total Checks = " + jack.getTimesAsked() + ", Solution " + answer);

        if (jack.getTimesAsked() > 20) {
            System.out.println("FAILED!! You're a horrible Detective...");
        } else {
            System.out.println("WOW! You might as well be called Batman!");
        }

	}

}
