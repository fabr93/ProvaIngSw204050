package EserLab_04_11.Ordinamento;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil myListUtil;
	
	@BeforeClass
	public static void prepareAll() {
		myListUtil = new MyListUtil();
		
	}
	
	@Test
	public void primeNumberGeneratorWorks() {
		
		List<Integer> prova = Arrays.asList(12,17,32,8,16,14,15);
		List<Integer> prova2 = Arrays.asList(-12,17,-32,-8,16,14,15);
		
		
		
		System.out.println("Data Inizio prova"+ new DateTime());
		assertEquals(Arrays.asList(8,12,14,15,16,17,32),myListUtil.ordinaLista(prova, true));
		System.out.println("Data Fine prova"+ new DateTime());
		
		System.out.println("Data Inizio prova"+ new DateTime());
		assertEquals(Arrays.asList(8,12,14,15,16,17,32),myListUtil.ordinaLista(prova, false));
		System.out.println("Data Fine prova"+ new DateTime());
		
		System.out.println("Data Inizio prova"+ new DateTime());
		assertEquals(Arrays.asList(-32,-12,-8,14,15,16,17),myListUtil.ordinaLista(prova2, true));
		System.out.println("Data Fine prova"+ new DateTime());
		
		
		
	
	}
	
	
	

}
