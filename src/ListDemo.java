import java.util.HashMap;

public class ListDemo {
	public static void main(String[] args) {
		/** Exercise 1
		 * make a container,use the Scanner method to get the keyboard input
		 then we can use the index to get what we want from the container
//		 */
//		ArrayList ar = new ArrayList();
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		while (sc.hasNext())
//			if (count++ < 6)
//				ar.add(sc.next());
//			else
//				break;
//		ar.forEach(obj -> System.out.println(obj));
//		System.out.println(ar.get(5));
//		System.out.println("What you have inputted is:" + ar);
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Please input the string you are looking for" + ar.indexOf(sc1.next()));
		/**Exercise 2
		 * We have a string array
		 * What we want is to save the non-duplicated data and it's number with a Map
		 */
		HashMap ha = new HashMap();
		String[] st = {"a", "b", "a", "b", "c", "a", "b", "c", "b"};
		for (String i : st) {
			if (ha.containsKey(i)) {
				int va = (int) (ha.get(i)) + 1;
				ha.put(i, va);
			} else
				ha.put(i, 1);
		}
		System.out.println(ha);


	}
}
