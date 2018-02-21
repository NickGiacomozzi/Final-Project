import java.util.ArrayList;

public class List
	{
		static ArrayList<Student> list = new ArrayList<Student>();

		public static void fillList()

			{
				list.add(new Student("James Blackford", 15, "Freshman", "Male", "Blue", "Hangover"));
				list.add(new Student("Paddy Butler", 17, "Senior", "Male", "Purple", "Straight Outta Compton"));
				list.add(new Student("Damien Castillo", 15, "Sophomore", "Male", "Purple", "The Godfather"));
				list.add(new Student("Jonathan Egan", 15, "Sophomore", "Male", "Blue", "Lion King"));
				list.add(new Student("Luke Elges", 16, "Sophomore", "Male", "Blue", "Dodgeball"));
				list.add(new Student("Nick Giacomozzi", 15, "Sophomore", "Male", "Purple", "The Shack"));
				list.add(new Student("Keaton Glassman", 15, "Freshman", "Male", "Burgundy", "22 Jump Street"));
				list.add(new Student("Owen Halbrook", 14, "Freshman", "Male", "Bright Green",
						"Star Wars The Last Jedi"));
				list.add(new Student("Zachary Hanson", 15, "Freshman", "Male", "Blue", "Cars"));
				list.add(new Student("Julia Jackson", 18, "Senior", "Female", "Yellow", "Ladybird"));
				list.add(new Student("Emy McGuire", 15, "Sophomore", "Female", "Silver", "The Last Samurai"));
				list.add(new Student("Jeffer Ng", 15, "Freshman", "Male", "Red", "Jumanji"));
				list.add(new Student("Alyssa Radlauer", 14, "Freshman", "Female", "Blue", "The Lion King"));
				list.add(new Student("Eric Rapp", 15, "Sophomore", "Male", "Blue", "Star Wars"));
				list.add(new Student("Grant Reuter", 18, "Senior", "Male", "Blue", "Guardians of the Galaxy"));
				list.add(new Student("Kaleah Ruff", 14, "Freshman", "Female", "Green", "Kung Fu Panda 3"));
				list.add(new Student("Alison Sherwood", 15, "Sophomore", "Female", "Purple", "Zoolander"));
				list.add(new Student("Madelyn Tran", 15, "Freshman", "Female", "Yellow", "The Greatest Showman"));
				list.add(new Student("Ben Walden", 15, "Sophomore", "Male", "Green", "Indiana Jones"));

			}

	}
