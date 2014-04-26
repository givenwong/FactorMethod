
public class Driver {

	public static void main(String[] args){
		
		// The original article makes a mistake here 
		// http://www.javaworld.com/article/2077386/learn-java/factory-methods.html
		Trace log = TraceFactory.getTrace();
		//... code ...
		log.debug( "entering loog" );
		// ... etc ...
		
	}
	
	
	
}
