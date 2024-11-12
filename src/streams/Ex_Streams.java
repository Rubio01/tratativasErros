package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> par = numeros.stream().filter(n -> n %2==0 ).collect(Collectors.toList());
		
		int somaPar = numeros.stream().filter(n -> n %2==0 ).reduce(0, (a,b) -> a + b  );
		
		System.out.println("Numeros pares: "+ somaPar);

	}

}
