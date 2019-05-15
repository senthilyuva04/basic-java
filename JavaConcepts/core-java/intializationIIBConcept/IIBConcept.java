/**
 * 
 */
package intializationIIBConcept;

/**
 * @author Senthil Kumar P
 *
 */
public class IIBConcept extends IIBParent{
//block 1
	{
		System.out.println("Instance Initialization Block 1");
	}

	// Constructor
	IIBConcept() {
		System.out.println("IIBConcept Constructor method");
	}

	// block 2
	{
		System.out.println("Instance Initialization Block 2");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main method of main class");
		IIBConcept a = new IIBConcept();

	}

//Block 3
	{
		System.out.println("Instance Initialization Block 3");
	}

}
