package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExercicioOptionals {

	public static void main(String[] args) {

		//Estado vazio.
		//Optional<String> emptyOptional = Optional.empty();
		//System.out.println("Optional Vazio");
		//emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
		
		Optional<String> optionalString = Optional.of("Valor presente");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não presente"));
		
		//Optional<String> optionalNull = Optional.ofNullable(null);
		//optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null"));
		
		//System.out.println(emptyOptional.orElseThrow(IllegalStateException::new));
		
		if (optionalString.isPresent()) {
			String valor = optionalString.get();

			System.out.println(valor);
		}

		optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);
		
	}

}
