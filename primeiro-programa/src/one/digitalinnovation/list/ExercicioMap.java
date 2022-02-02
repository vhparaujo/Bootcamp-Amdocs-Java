package one.digitalinnovation.list;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {

		Map<String, String> capitais = new HashMap<>();

		capitais.put("RS", "Rio Grande do Sul");
		capitais.put("SC", "Santa Catarina");
		capitais.put("PR", "Paraná");
		capitais.put("SP", "São Paulo");
		capitais.put("RJ", "Rio de Janeiro");
		capitais.put("MG", "Minas Gerais");
		capitais.put("ES", "Espírito Santo");
		capitais.put("GO", "Goiás");
		capitais.put("TO", "Tocantins");
		capitais.put("MT", "Mato Grosso");
		capitais.put("MS", "Mato Grosso do Sul");
		capitais.put("RO", "Rondônia");
		capitais.put("AC", "Acre");
		capitais.put("AM", "Amazonas");
		capitais.put("RR", "Roraima");
		capitais.put("AP", "Amapá");
		capitais.put("PA", "Pará");
		capitais.put("MA", "Maranhão");
		capitais.put("PI", "Piauí");
		capitais.put("CE", "Ceará");
		capitais.put("RN", "Rio Grande do Norte");
		capitais.put("PB", "Paraíba");
		capitais.put("PE", "Pernambuco");
		capitais.put("AL", "Alagoas");
		capitais.put("SE", "Sergipe");
		capitais.put("BA", "Bahia");

		System.out.println(capitais);

		capitais.remove("MG");
		System.out.println(capitais);

		capitais.put("DF", "Distrito Federal");
		System.out.println(capitais);

		System.out.println(capitais.size());

		capitais.remove("MS");
		System.out.println(capitais);

		for (String key : capitais.keySet()) {
			System.out.println(capitais.get(key) + "(" + key + ") ");
		}

		System.out.println(capitais.containsKey("SC"));

		System.out.println(capitais.containsValue("Maranhão"));

	}

}
