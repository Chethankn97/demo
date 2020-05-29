package sonartutorial.com.engineer;

public class Simple {

	  public void coveredByUnitTest() {
	    System.out.println("This method is covered by unit test");
	  }

	  public void coveredByIntegrationTest() {
	    System.out.println("This method is covered by integration test");
	  }

	  public void uncovered() {
	    System.out.println("This method is not covered");
	  }

	}
