
/** Array Basics */
public class Assignment {
	/** 
	 * Directions:
	 * THE USE OF ARRAYLISTS (or any other collection)IS OFF LIMITS FOR THIS ASSIGNMENT.
	 * Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
	 * 
	 * Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods are called only when their preconditions are satisfied.
	 * 
	 * In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. 
	 * Writing significant amounts of code that can be replaced by a call to one of these methods will
	 * not receive full credit.
	 */
	
	/** 1. Implement the method below to print the memory location of the array.
	 * 		Do not include a new line in your output.
	 */
    public static void location(int[] array) {
	System.out.print(array);
    }

    /** 2. Implement the method below to return an integer array of size n. */
    public static int[] makeArray(int n) {
 	int[] ape = new int[n];
    }

    /**
     * 3. Implement the method below to return an array initialized with the following String values
     * Eclipse
     * Velocity
     * Whisper
     * Zephyr
     * Quasar
     * Radiant
     */
    public static String[] initArray() {
	String[] mrMerritt = new int[6];
	mrMerritt[0] = "Eclipse";
	mrMerritt[1] = "Velocity";
	mrMerritt[2] = "Whisper";
	mrMerritt[3] = "Zephyr";
	mrMerritt[4] = "Quasar";
	mrMerritt[5] = "Radiant";
	return mrMerritt;
    }

    /**
     * 4. Implement the method below to return the number of elements in array.
     * Your code must include the built-in attribute to return the length of an array.
     */
    public static int arrayLength(String[] array) {
	int counter = 0;
	for(i = 0; i < array.size; i++) {
	    counter++;
	}
	return counter;
	    
    }

    /**
     * 5. Implement the method below to return the index of the last element in array.
     * Your code must include the built-in attribute to return the length of an array.
     */
    public static int lastIndex(String[] array) {
 	String lastInd = array.size-1;
	int counter = 0;
	for(i = 0; i < array.size; i++) {
	     counter++;
	}
	return lastInd;
    }

    /**
     * 6. Implement the method below to change the nth element of array to str.
     * Your code must include the built-in method to return the length of an array.
     */
    public static void changeNthElement(String[] array, int n, String str) {
	array[n] = str;
    }

    /** 7. Implement the method below using a while loop to print out each element. 
     * 			Include a new line after each element.
     */
    public static void printArrayWhile(String[] array) {
	    int counter = 0;
	    while(counter < array.size) {
		System.out.println(array[counter])
		counter++;
	    }
    }

    /** 8. Implement the method below using a For loop to print out each element of array. 
     * 		Include a new line after each element.
     */
    public static void printArrayFor(String[] array) {
	for(int i = 0; i < array.size; i++){
	    System.out.println(array[i])
	}
    }

    /** 9. Implement the method below using an enhanced/for each loop to print out each element of array. 
     * 		Include a new line after each element.
     */
    public static void printArrayForEach(String[] array) {
	for(int i = 0; array) {
	    System.out.println(array[i]);
	}
    }

    /**
     * 10. Implement the method below to add the elements from array in reverse order to a new array.
     * 		Return the new array.
     */
    public static int[] reverseArray(int[] array) {
	int[] lister = new array.size;
	for(int i = array.size; i < 0; i -= 1){
	    lister.add(array[i]);
	}
	return lister;
    }

    /**
     * 11. Implement the method below to add the elements from the first 1/2 of array to a new array.
     * 		Return the new array.
     */
    public static String[] halfArray(String[] array) {
	int[] lister2 = new array.size/2;
	for(int i = 0; i < array.size/2; i++) {
	    liser2.add(array[i]);
	}
    }

    /**
     * 12. Implement the method below to create an array of length n.
     * 		Add a new Person at each index using the name at that index from the names array,
     * 		and the age at that index from the ages array.
     * 		Return the new Person[] array.
     *
     * 		//Constructs a new Person
     * 		public Person(String name, int age)
     * 		{ //implementation not shown }
     */
    public static Person[] createPersonArray(String[] names, int[] ages) {
	public Person(String name, int age) {
	       this.name = name;
	       this.age = age;
	}
	Person[] people = new Person[names.length];
	for(int i = 0; i < names.length; i++) {
	    people[i] = new Person[names[i], ages[i]); 
	}
	return people;

    }
}
