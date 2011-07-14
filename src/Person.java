
public class Person {
	private String _name;
	private int _age;
	
	public Person(String name, int age){
		setAge(age);
		setName(name);
	}
	
	public void setName(String name){
		_name = name;
	}
	public String getName(){
		return _name;
	}
	
	public void setAge(int age){
		_age = age;
	}
	public int getAge(){
		return _age;
	}
}
