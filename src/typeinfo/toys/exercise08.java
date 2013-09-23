package typeinfo.toys;

import java.lang.reflect.Field;
import java.util.Iterator;

interface Fly {
}

public class exercise08 extends SuperClassOfExercise08 implements Fly {
	private int age;
	private String name;
	private boolean sex;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(exercise08.getClass());

		Class array[] = exercise08.class.getInterfaces();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		printFieldInfo(exercise08.class);
	}

	public static void printAllTheClass(Class cc) {
		while (cc != null) {
			System.out.println(cc.getName());
			cc = cc.getSuperclass();
		}
		for (Class k : cc.getInterfaces())
			System.out.println(k.getName());

	}
	
	public static void printFieldInfo(Class cc){
		for(Field f:cc.getDeclaredFields()){
			System.out.println(f);
		}
	}

}
