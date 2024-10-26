package Array_based_questions;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class C_g______Generating_Random_Numbers {

	public static void main(String[] args) {
		System.out.println(Math.random());
System.out.println(ThreadLocalRandom.current().nextInt());
System.out.println(ThreadLocalRandom.current().nextDouble());
System.out.println(ThreadLocalRandom.current().nextBoolean());

System.out.println(" ");
Random random = new Random();
System.out.println(random.nextInt());
System.out.println(random.nextDouble());
System.out.println((random.nextLong()));

	}

}
