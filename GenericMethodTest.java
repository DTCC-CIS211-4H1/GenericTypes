
public class GenericMethodTest {
	// generic method printArray
	public static <E> void printArray ( E[] inputArray) {
		//Display array elements
		for (E element : inputArray) {
			System.out.printf("%s " , element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create arrays and print them
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'A','B','C','D','E'};
		System.out.println("Array of integers: ");
		printArray(intArray);
		System.out.println("Array of doubles: ");
		printArray(doubleArray);
		System.out.println("Array of characters: ");
		printArray(charArray);
		}
		

	}
