import java.util.ArrayList;


public class Dynamic<T> {

	
Object[] data = new Object[3];
	
int node = 0;
	
int currentSize = 3;

	
public Object get(int index) {
	
return data[index];
	}

	
public void add(Object value) {

if (this.currentSize == this.node) {
			
reinitializeArray();
		}
		
this.data[node] = value;
		
node++;
		
System.out.println("Added " + value + " at Node " + (this.node - 1));
	}

	
public void set(int index, Object value) {
		
this.data[index] = value;
	}

	
public void reinitializeArray() {
		
System.out.println("\nReinitializing Array with size " + (currentSize * 2));
		
Object[] temp = new Object[currentSize * 2];
		
currentSize *= 2;
		
for (int i = 0; i < node; i++) {
		
	temp[i] = this.data[i];
		
}
		this.data = temp;
	}



	public Object getCurrentNode() {
	
	return node;
	}

	
public Object getCurrentSize() {
		
return currentSize;
	}

	
public static void main(String[] sargs) {
		
System.out.println("-----Integer Operation-----");
		
Dynamic<Integer> arr1 = new Dynamic<Integer>();

		
arr1.add(new Integer(1));
		

arr1.add(new Integer(2));
		
arr1.add(new Integer(3));

		
arr1.add(new Integer(4));
		
arr1.add(new Integer(5));
		
arr1.add(new Integer(6));

		
arr1.add(new Integer(7));

		
System.out.println("\nCurrent Node: " + arr1.getCurrentNode() + " Current Size: " + arr1.getCurrentSize());

	
	System.out.println("\n-----String Operation-----");
	
	Dynamic<String> arr2 = new Dynamic<String>();

		
arr2.add(new String("A"));
		
arr2.add(new String("B"));
		
arr2.add(new String("C"));

		
arr2.add(new String("D"));
		
arr2.add(new String("E"));
		
arr2.add(new String("F"));

		
arr2.add(new String("G"));
		
arr2.add(new String("H"));

		
System.out.println("\nCurrent Node: " + arr1.getCurrentNode() + " Current Size: " + arr1.getCurrentSize());
	}
}