/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("I don't know my own name!");
		else
			System.out.println("My name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("Nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("That's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		
		Cat cat = new Cat("Whiskers");
		
		// 1. Make the Cat meow
		cat.meow();
		
		// 2. Get the Cat to print its name
		cat.printName();

		// 3. Kill the Cat!
		int kills = 1;
		while(kills <= 9)
		{
			
			cat.kill();
			kills += 1;
			
		}

	}
}


