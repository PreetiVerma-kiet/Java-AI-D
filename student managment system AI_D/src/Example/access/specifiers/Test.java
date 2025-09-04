package Example.access.specifiers;

import com.student.*;

public class Test extends Student {

	public static void main(String[] args) {
		Student s1 = new Student("rohan", "AIML", 67, 20);
		Test t1 = new Test();
		System.out.println("The name of the student is"+t1.getName());

	}

}
