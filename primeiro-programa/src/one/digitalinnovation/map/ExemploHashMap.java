package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {

		Map<String, Integer> campeoesMundiais = new HashMap<>();

		// Adiciona os campeões mundiais no mapa.
		campeoesMundiais.put("Brasil", 5);
		campeoesMundiais.put("Alemanha", 4);
		campeoesMundiais.put("Itália", 4);
		campeoesMundiais.put("Uruguai", 2);
		campeoesMundiais.put("Argentina", 2);
		campeoesMundiais.put("França", 2);
		campeoesMundiais.put("Inglaterra", 1);
		campeoesMundiais.put("Espanha", 1);

		System.out.println(campeoesMundiais);

		// Atualiza o valor para a chave Brasil.
		campeoesMundiais.put("Brasil", 6);
		System.out.println(campeoesMundiais);

		// Retorna o value da chave.
		System.out.println(campeoesMundiais.get("Argentina"));

		// Retorna se existe ou não um campeão França.
		System.out.println(campeoesMundiais.containsKey("França"));

		// Retorna se existe ou não alguma seleção hexacampeã.
		System.out.println(campeoesMundiais.containsValue(6));

		System.out.println(campeoesMundiais.size());

		// Navega nos registros do mapa.
		for (Map.Entry<String, Integer> entry : campeoesMundiais.entrySet()) {
			System.out.println(entry.getKey() + " --- " + entry.getValue());
		}

		System.out.println();
		// Navega nos registros do mapa.
		for (String key : campeoesMundiais.keySet()) {
			System.out.println(key + " -- " + campeoesMundiais.get(key));
		}
	}

}
