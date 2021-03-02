package core;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Verifyer v=new Verifyer();
		Solver sv=new Solver();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] values=new int[3];
		String[] valRefs= {"ax\u00B2", "bx", "c"};
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(int i=0; i<valRefs.length; i++) {
			System.out.print("Ingrese un valor para "+valRefs[i]+": ");
			hm.put(valRefs[i], Integer.parseInt(br.readLine()));
			values[i]=hm.get(valRefs[i]);
			System.out.println("Valor de "+valRefs[i]+": "+values[i]);
		}
		System.out.println(
				"Resultado positivo: "+sv.posMethod(values[0], values[1], values[2])
				+"\nResultado negativo: "+sv.negMethod(values[0], values[1], values[2]));
	}
}
