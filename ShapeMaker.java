/************ ShapeMaker ************
 * Prints a variety of shapes to 
 * the console using for loops.
 * Created for the iD Tech JAVA3 class.
 *************************************/
public class ShapeMaker {
	public static void main(String[] args) {
		//prints a # rectangle with the provided height and width (h, w)
		rectangle(3,4);
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		//print a # rectangle a specified number of spaces from the left (h, w, s) 
		spaceRectangle(5, 6, 7);
		spaceRectangle(5, 6, 0);
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		//print right triangles with a specified direction and height (d, h)
		triangle(-1, 6);
		System.out.println();
		triangle(1, 6);
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		//create a specified number (n) of wave patterns using right triangles
		waveMaker(5);
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		//print an isosceles triangle of a specified height and number of spaces from the left (h, s)
		isoTriangle(5,2);
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

		//print out a Christmas Tree using isosceles triangles and a rectangle
		christmasTree();
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
	}
	public static void rectangle(int height, int width) {
		for (int i = 0; i<height; i++) {
			for (int j = 0; j<width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void spaceRectangle(int height, int width, int space) {
		for (int i = 0; i<height; i++) {
			for (int k = 0; k<space; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j<width; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void triangle(int dir, int height) {
		for (int i=1; i<height; i++) {
			if (dir<0) {
				for (int j = height; j>i; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
			}
			System.out.print("\n");	
		}
	}
	public static void isoTriangle(int height, int space) {
		for (int i=1; i<height; i++) {
			for (int j = height+space; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k<i*2+1; k++) {
				System.out.print("#");
			}
			System.out.print("\n");	
		}
	}
	public static void waveMaker(int times) {
		for (int i = 0; i<times; i++) {
			triangle(1, 5);
			triangle(-1, 5);
		}
	}
	public static void christmasTree() {
		isoTriangle(6, 4);
		isoTriangle(10, 0);
		spaceRectangle(6, 4, 8);
	}	
}
