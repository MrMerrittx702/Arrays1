
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object other) {
    	if(this == other) {
    		return true;
    	}
 
    	Person that = (Person) other;
    	if(this.name == that.name && this.age == that.age) {
    		return true;
    	}
    	
    	return false;
    	
    }
}
