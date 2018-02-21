
public class Student
	{
		String name;
		int age;
		String grade;
		String gender;
		String color;
		String movie;

		public Student(String n, int a, String g, String ge, String c, String m)
			{
				name = n;
				age = a;
				grade = g;
				gender = ge;
				color = c;
				movie = m;

			}

		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
			}

		public String getMovie()
			{
				return movie;
			}

		public void setMovie(String movie)
			{
				this.movie = movie;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getAge()
			{
				return age;
			}

		public void setAge(int age)
			{
				this.age = age;
			}

		public String getGrade()
			{
				return grade;
			}

		public void setGrade(String grade)
			{
				this.grade = grade;
			}

		public String getGender()
			{
				return gender;
			}

		public void setGender(String gender)
			{
				this.gender = gender;
			}

	}
