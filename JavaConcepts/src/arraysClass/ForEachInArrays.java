package arraysClass;

public class ForEachInArrays {

	static String name[] = { "sai Hruthik", "bunny", "ina" };

	public static String[] foreach(String a[]) {
		for (String nam : name) {
			System.out.println(nam);
		}
		return name;

	}

	public static void main(String[] args) {

		foreach(name);
	}

}
