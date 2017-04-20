
public class FirebugsExamples {
	private String unusedVariable;

	private String Poorly_namedvariable;

	public FirebugsExamples() {
		String localVariable = null;
		if(localVariable == null) {
			System.out.println("This is reachable code.");
		} else {
			System.out.println("This is not reachable code.");
		}
	}

	public String getPoorly_namedvariable() {
		return Poorly_namedvariable;
	}

	public void setPoorly_namedvariable(String poorly_namedvariable)
	{
		Poorly_namedvariable = poorly_namedvariable;
	}
	
}
