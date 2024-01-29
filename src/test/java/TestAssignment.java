import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import org.junit.jupiter.api.Test;

class TestAssignment {

	@Test
	void test_location() {
        int[][] nums = new int[10][];

        // Initialize each int array with varying lengths
        nums[0] = new int[]{1, 2, 3};
        nums[1] = new int[]{4, 5, 6, 7};
        nums[2] = new int[]{8, 9};
        nums[3] = new int[]{10, 11, 12, 13, 14};
        nums[4] = new int[]{15};
        nums[5] = new int[]{16, 17, 18};
        nums[6] = new int[]{19, 20, 21, 22};
        nums[7] = new int[]{23};
        nums[8] = new int[]{24, 25, 26, 27};
        nums[9] = new int[]{28, 29, 30};
        
        for(int i = 0; i < nums.length; i++) {
    	    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

    	    // action Class.Method
    	    Assignment.location(nums[i]);
    	    
    	    try {
    	    // assertion
    	    assertEquals(nums[i].toString(), bos.toString());
    	    }
    	    finally {
    	    // undo the binding in System
    	    System.setOut(originalOut);
    	    }
        	
        }

	}
	
	@Test
	void test_makeArray() {
		for(int i = 0; i <= 100; i += 5) {
			assertEquals(Assignment.makeArray(i).length, i);
		}
		
	}
	
	@Test
	void test_initArray() {
		assertArrayEquals(Assignment.initArray(),new String[]{"Eclipse", "Velocity", "Whisper", "Zephyr", "Quasar", "Radiant"});
	}
	
	@Test
	void test_arrayLength() {
        // Create an array to store 10 string arrays
        String[][] arrays = new String[10][];

        // Initialize each string array with varying lengths
        arrays[0] = new String[]{"One"};
        arrays[1] = new String[]{"Two", "Three"};
        arrays[2] = new String[]{"Four", "Five", "Six"};
        arrays[3] = new String[]{"Seven", "Eight", "Nine", "Ten"};
        arrays[4] = new String[]{"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};
        arrays[5] = new String[]{"Sixteen", "Seventeen"};
        arrays[6] = new String[]{"Eighteen", "Nineteen", "Twenty", "Twenty-One"};
        arrays[7] = new String[]{"Twenty-Two"};
        arrays[8] = new String[]{"Twenty-Three", "Twenty-Four", "Twenty-Five"};
        arrays[9] = new String[]{"Twenty-Six", "Twenty-Seven", "Twenty-Eight"};
		
		for(int i = 0; i < arrays.length; i++) {
			assertEquals(Assignment.arrayLength(arrays[i]),arrays[i].length);
		}
		
	}
	
	@Test
	void test_lastIndex () {
        // Create an array to store 10 string arrays
        String[][] arrays = new String[10][];

        // Initialize each string array with varying lengths
        arrays[0] = new String[]{"One"};
        arrays[1] = new String[]{"Two", "Three"};
        arrays[2] = new String[]{"Four", "Five", "Six"};
        arrays[3] = new String[]{"Seven", "Eight", "Nine", "Ten"};
        arrays[4] = new String[]{"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};
        arrays[5] = new String[]{"Sixteen", "Seventeen"};
        arrays[6] = new String[]{"Eighteen", "Nineteen", "Twenty", "Twenty-One"};
        arrays[7] = new String[]{"Twenty-Two"};
        arrays[8] = new String[]{"Twenty-Three", "Twenty-Four", "Twenty-Five"};
        arrays[9] = new String[]{"Twenty-Six", "Twenty-Seven", "Twenty-Eight"};
		
		for(int i = 0; i < arrays.length; i++) {
			assertEquals(Assignment.lastIndex(arrays[i]),arrays[i].length-1);
		}
	}
	
	@Test
	void test_changeNthElement() {
		Random random = new Random();
        // Create an array to store 10 string arrays
        String[][] arrays = new String[10][];

        // Initialize each string array with varying lengths
        arrays[0] = new String[]{"Apple", "Banana", "Cherry"};
        arrays[1] = new String[]{"Dog", "Cat", "Fish", "Bird"};
        arrays[2] = new String[]{"Red", "Green"};
        arrays[3] = new String[]{"Java", "Python", "C++", "JavaScript", "Swift"};
        arrays[4] = new String[] {"Monday"};
        arrays[5] = new String[]{"Sun", "Moon", "Star"};
        arrays[6] = new String[]{"Car", "Bus", "Bicycle", "Train"};
        arrays[7] = new String[]{"Rain"};
        arrays[8] = new String[]{"January", "February", "March", "April"};
        arrays[9] = new String[]{"Open", "Close", "Save"};
        
        for(int i = 0; i < arrays.length; i++) {
        	int randIndex = random.nextInt(0,arrays[i].length);
        	Assignment.changeNthElement(arrays[i],randIndex,"Hello World");
        	assertEquals(arrays[i][randIndex],"Hello World");
        }
	}
	
	@Test
	void test_printArrayWhile () {
        // Create an array to store 10 string arrays
        String[][] arrays = new String[10][];

        // Initialize each string array with varying lengths
        arrays[0] = new String[]{"Apple", "Banana", "Cherry"};
        arrays[1] = new String[]{"Dog", "Cat", "Fish", "Bird"};
        arrays[2] = new String[]{"Red", "Green"};
        arrays[3] = new String[]{"Java", "Python", "C++", "JavaScript", "Swift"};
        arrays[4] = new String[] {"Monday"};
        arrays[5] = new String[]{"Sun", "Moon", "Star"};
        arrays[6] = new String[]{"Car", "Bus", "Bicycle", "Train"};
        arrays[7] = new String[]{"Rain"};
        arrays[8] = new String[]{"January", "February", "March", "April"};
        arrays[9] = new String[]{"Open", "Close", "Save"};
		
		for(int i = 0; i < arrays.length; i++) {
			String str = "";
			for(int j = 0; j < arrays[i].length; j++) {
				str += arrays[i][j] + System.lineSeparator();
			}
		    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

		    // action Class.Method
		    Assignment.printArrayWhile(arrays[i]);
		    
		    try {
		    // assertion
		    assertEquals(str, bos.toString());
		    }
		    finally {
		    // undo the binding in System
		    System.setOut(originalOut);
		    }
		}
		
	}
	
	@Test
	void test_printArrayFor () {
        // Create an array to store 10 string arrays
        String[][] arrays = new String[10][];

        // Initialize each string array with varying lengths
        arrays[0] = new String[]{"Apple", "Banana", "Cherry"};
        arrays[1] = new String[]{"Dog", "Cat", "Fish", "Bird"};
        arrays[2] = new String[]{"Red", "Green"};
        arrays[3] = new String[]{"Java", "Python", "C++", "JavaScript", "Swift"};
        arrays[4] = new String[] {"Monday"};
        arrays[5] = new String[]{"Sun", "Moon", "Star"};
        arrays[6] = new String[]{"Car", "Bus", "Bicycle", "Train"};
        arrays[7] = new String[]{"Rain"};
        arrays[8] = new String[]{"January", "February", "March", "April"};
        arrays[9] = new String[]{"Open", "Close", "Save"};
		
		for(int i = 0; i < arrays.length; i++) {
			String str = "";
			for(int j = 0; j < arrays[i].length; j++) {
				str += arrays[i][j] + System.lineSeparator();
			}
		    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

		    // action Class.Method
		    Assignment.printArrayFor(arrays[i]);
		    
		    try {
		    // assertion
		    assertEquals(str, bos.toString());
		    }
		    finally {
		    // undo the binding in System
		    System.setOut(originalOut);
		    }
		
	}
	
}
	
	@Test
	void test_printArrayForEach() {
        // Create an array to store 10 string arrays
        String[][] arrays = new String[10][];

        // Initialize each string array with varying lengths
        arrays[0] = new String[]{"Apple", "Banana", "Cherry"};
        arrays[1] = new String[]{"Dog", "Cat", "Fish", "Bird"};
        arrays[2] = new String[]{"Red", "Green"};
        arrays[3] = new String[]{"Java", "Python", "C++", "JavaScript", "Swift"};
        arrays[4] = new String[] {"Monday"};
        arrays[5] = new String[]{"Sun", "Moon", "Star"};
        arrays[6] = new String[]{"Car", "Bus", "Bicycle", "Train"};
        arrays[7] = new String[]{"Rain"};
        arrays[8] = new String[]{"January", "February", "March", "April"};
        arrays[9] = new String[]{"Open", "Close", "Save"};
		
		for(int i = 0; i < arrays.length; i++) {
			String str = "";
			for(int j = 0; j < arrays[i].length; j++) {
				str += arrays[i][j] + System.lineSeparator();
			}
		    PrintStream originalOut = System.out; ByteArrayOutputStream bos = new ByteArrayOutputStream(); System.setOut(new PrintStream(bos));

		    // action Class.Method
		    Assignment.printArrayForEach(arrays[i]);
		    
		    try {
		    // assertion
		    assertEquals(str, bos.toString());
		    }
		    finally {
		    // undo the binding in System
		    System.setOut(originalOut);
		    }
		}
	}

	@Test
	void test_reversedArray() {
    
        int[][] nums = {
                {5, 10, 15},
                {2, 4, 6, 8},
                {1, 3, 49},
                {20, 25, 30, 35, 40},
                {100},
                {50, 75, 100},
                {45, 60, 75, 90},
                {99, 36},
                {18, 22, 26, 30},
                {5, 10, 15}
            };
        
        int[][] reversed = {
                {15, 10, 5},
                {8, 6, 4, 2},
                {49, 3, 1},
                {40, 35, 30, 25, 20},
                {100},
                {100, 75, 50},
                {90, 75, 60, 45},
                {36, 99},
                {30, 26, 22, 18},
                {15, 10, 5}
            };
        
        for(int i = 0; i < nums.length; i++) {
        	assertArrayEquals(Assignment.reverseArray(nums[i]),reversed[i]);
        }
	}

	@Test
	void test_halfArray() {
        String[][] strs = {
                {"a", "b", "c", "d", "e"},
                {"f", "g", "h", "i", "j"},
                {"k", "l", "m", "n", "o", "p"},
                {"q", "r", "s", "t", "u", "v", "w"},
                {"x", "y", "z"},
                {"1", "2", "3", "4", "5", "6"},
                {"7", "8", "9", "0", "!"},
                {"@", "#", "$", "%", "^", "&", "*"},
                {"(", ")", "-", "_", "="},
                {"+", "{", "}", "[", "]"}
            };
        
        String[][] halves = {
                {"a", "b"},
                {"f", "g"},
                {"k", "l", "m"},
                {"q", "r", "s"},
                {"x"},
                {"1", "2", "3"},
                {"7", "8"},
                {"@", "#", "$"},
                {"(", ")"},
                {"+", "{"}
            };
        for(int i = 0; i < strs.length; i++) {
        	assertArrayEquals(Assignment.halfArray(strs[i]),halves[i]);
        }
	}
	
	@Test
	void test_createPersonArray() {
	       String[] names = {
	               "Alice Johnson",
	               "Bob Smith",
	               "Charlie Brown",
	               "David Williams",
	               "Eva Davis",
	               "Frank Miller",
	               "Grace Taylor",
	               "Harry Wilson",
	               "Ivy Robinson",
	               "Jack Thompson",
	               "Katherine Davis",
	               "Leo Johnson"
	           };
	       
	       int[] ages = {23, 45, 34, 18, 56, 29, 40, 51, 26, 37, 42, 33, 19, 48, 27, 38, 50, 22, 31, 44, 30, 52, 35, 25, 47, 28, 41, 36, 55, 24};
	       
	       Person[] persons = Assignment.createPersonArray(names, ages);
	       for(int i = 0; i < names.length; i++) {
	    	   assertEquals(persons[i], new Person(names[i],ages[i]));
	    	   
	       }
	}

}


