package Registry;

public class Main {
	
	public static void registerObjects(StudentRegistry sr) {
		Student s = new Student();
		s.batch = "A";
		sr.register(s, "Batch_A");
		Student s1 = new Student();
		s1.batch = "B";
		sr.register(s, "Batch_B");
	}

	public static void main(String[] args) {
		/*
		 * What Problem we are solving ?
		 * 1. Imagine a situation in PUBG game you are playing with bot
		 * there are 1000 number of bots with different combinations (Some wear green cloth with black gun and some wear diff)
		 * If we follow the prototype design patteren then if the first object get killed then we can't build new bot
		 * Bot b = new Bot();
		 * Bot b1 = b.copy();
		 * Bot b2 = b.copy();
		 * 
		 * 2. What about the different combinations ?
		 * Suppose b1 wear green cloth and black gun then you have to set in main method.
		 * 
		 * 3. Example from Prototype : The first intelligent student rank got increased , after this all new copied object rank
		 * automatically increased
		 * 
		 * Solution : To solve the above problem, can't we register the main object in a MAP and get a copy whenever needed
		 */
		StudentRegistry sr = new StudentRegistry();
		registerObjects(sr);
		Student s = (Student) sr.getObject("Batch_A");
		s.batch = "D";
		System.out.print(s.batch);

	}

}
