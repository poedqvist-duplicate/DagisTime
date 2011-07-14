import static org.junit.Assert.*;

import org.junit.Test;


public class PersonTest {

	@Test
	public void test_can_name_a_person() {
		Person p = new Person(null, 26);
		
		assertNull(p.getName());
		
		p.setName("P-O");
		assertTrue(p.getName().equals("P-O"));
	}
	
	@Test
	public void test_person_knows_its_age(){
		Person p = new Person("P-O", 26);
		
		assertEquals(26, p.getAge());
	}
	

}
