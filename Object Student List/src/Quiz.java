import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame
	{
		static ArrayList<Student> list = new ArrayList<Student>();
		private static final long serialVersionUID = 1L;
		static String name;
		static int favoriteColor, favoriteMovie, opinion;
		static JFrame frame = new JFrame();
		static int index;

		public static void main(String[] args)
			{
				List.fillList();

				// takes input
				name = JOptionPane.showInputDialog("What is your name?");

				// responds to input above
				JOptionPane.showMessageDialog(frame, "Hi, " + name);

				// drop-down menu
				final String[] person =
					{ "James Blackford", "Paddy Butler", "Damien Castillo", "Jonathan Egan", "Luke Elges",
							"Nick Giacomozzi", "Keaton Glassman", "Owen Halbrook", "Zach Hanson", "Julia Jackson",
							"Aimee Maravi", "Emy McGuire", "Kaleah Ruff", "Jeffer Ng", "Alyssa Radlauer", "Eric Rapp",
							"Grant Reuter", "Alison Sherwood", "Madelyn Tran", "Ben Walden" };
				final JFrame frame = new JFrame();
				String student = (String) JOptionPane.showInputDialog(frame, "Who would you like to learn about first?",
						"Adventure Genre", JOptionPane.QUESTION_MESSAGE, null, person, person[0]);

				// generic response to drop-down choice above
				JOptionPane.showMessageDialog(frame, "Fantastic choice!");

				// buttons
				int correctNum = 0;

				String stringAgeGuess = JOptionPane.showInputDialog("How many years young is this person?");

				for (int i = 0; i < List.list.size(); i++)
					{
						if (student.equals(List.list.get(i).getName()))
							{
								index = i;
							}
					}
				System.out.println("You picked " + List.list.get(index).getName() + "");
				System.out.println("");

				// responds to button choice above
				// takes input

				int userAgeGuess = Integer.parseInt(stringAgeGuess);
				System.out.println("Index: " + index);
				System.out.println("");
				System.out.println("Age guess: " + userAgeGuess);
				System.out.println("");

				if (List.list.get(index).getAge() == (userAgeGuess))
					{
						System.out.println("Correct! Next Question...");
						correctNum++;

					} else
					{
						System.out.println("Wrong! That's minus one");

					}

				// buttons
				String userColorGuess = JOptionPane
						.showInputDialog("What do you think is this person's favorite color?");
				System.out.println("");
				System.out.println("Color Guess: " + userColorGuess);

				if (List.list.get(index).getColor().equals(userColorGuess))
					{
						System.out.println("Correct! Next Question...");
						correctNum++;

					} else
					{
						System.out.println("Wrong! That's minus one");

					}

				// responds to button choice above

				// buttons
				String userMovieGuess = JOptionPane
						.showInputDialog("What do you think is this person's favorite movie?");
				System.out.println("");
				System.out.println("Movie Guess: " + userMovieGuess);
				System.out.println("");

				if (List.list.get(index).getMovie().equals(userMovieGuess))
					{
						System.out.println("Correct! Next Question...");
						correctNum++;

					} else
					{
						System.out.println("Wrong! That's minus one");

					}

				// responds to button choice above

				// buttons
				Object[] options4 =
					{ "Yes" };
				opinion = JOptionPane.showOptionDialog(frame,
						"Would you show love and respect for this beautiful human being?", "Final Decision",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options4, options4[0]);

				// responds to button choice above
				switch (opinion)
					{
					case 0:
						{
							JOptionPane.showMessageDialog(frame, "Well of course you will!");
							break;
						}

					}
				System.out.println("");
				System.out.println("Your final score is: " + correctNum + "/3");
			}
	}