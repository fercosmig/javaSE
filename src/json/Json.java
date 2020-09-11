/**
 * 
 */
package json;

import java.util.ArrayList;
import java.util.List;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Mar 3, 2020
 * @file json.Json.java
 */
public class Json {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * teste 1
		 */
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", 22);
		jo.put("city", "chicago");

		System.out.println("JSON criado manualmente: " + jo);

		/**
		 * teste 2
		 */
		List<String> ars = new ArrayList<>();

		ars.add("Fernando");
		ars.add("Fernanda");
		ars.add("Jurandir");
		ars.add("Maria");

		System.out.println("ArrayList <ars>: " + ars);
		JSONArray nomes = new JSONArray(ars);
		System.out.println("<ars> em JSON: " + nomes);

		/**
		 * teste 3
		 */
		String[][] pessoas = { { "Fernando", "1977" }, { "Fernanda", "1998" }, { "Jurandir", "1945" },
				{ "Maria", "1948" } };

		System.out.println("Matriz bidimensional de strings <pessoas>: " + pessoas.toString());
		JSONArray teste = new JSONArray(pessoas);
		System.out.println("<pessoas> em JSON: " + teste);

		/**
		 * teste 4
		 */
		String str = "name, city, age \n john, chicago, 22 \n gary, florida, 35 \n sal, vegas, 18";

		JSONArray result = CDL.toJSONArray(str);
		System.out.println("String <str>: " + str);
		System.out.println("<str> em jSON: " + result);

	}

}
