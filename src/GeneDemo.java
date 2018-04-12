import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneDemo {
	public static void main(String[] args) {
		//Genericity demo
		List<String> books = new ArrayList<>();
		books.add("I'm");
		books.add("a fresh");
		books.forEach(ele -> System.out.print(ele + " "));
		Map<String, List<String>> schoolInfo = new HashMap<>();
		List<String> schools = new ArrayList<>();
		schools.add("get something from the west");
		schools.add("fuck every evil thing");
		schoolInfo.put("song",schools);
		books.forEach(ele -> System.out.println());
		schoolInfo.forEach((key, value) -> System.out.println(key + "->" + value));

	}
}
