package github.java11;

public class Constructor {

	static {
		System.out.println("Init System");
	}

	public static void main(String[] args) {
		System.out.println(Super.objCount);
		Super one = new Super();
		System.out.println(Super.objCount);
		Super two = new Super();
		System.out.println(Super.objCount);
	}

}

class Super {
	{
		System.out.println("Init Obj");
	}

	static int objCount = 0;

	public Super() {
		objCount++;
	}
}
