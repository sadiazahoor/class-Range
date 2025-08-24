public class rangeLab {
	
	    public static void main(String[] args) {
	        Range r1 = new Range(0, 10, 2); 

	        System.out.println(r1); // Range(0, 10, step=2)

	        // Iterate
	        for (int i : r1) {
	            System.out.print(i + " "); // 0 2 4 6 8
	        }
	        System.out.println();

	        // contains() checking..
	        System.out.println("Contains 4? " + r1.contains(4));  // true
	        System.out.println("Contains 5? " + r1.contains(5));  // false

	        Range r2 = new Range(10, 2, -2); // like range(10,2,-2)
	        System.out.println("Contains 8 in " + r2 + "? " + r2.contains(8)); // true
	        System.out.println("Contains 7 in " + r2 + "? " + r2.contains(7)); // false
	    }
	}



