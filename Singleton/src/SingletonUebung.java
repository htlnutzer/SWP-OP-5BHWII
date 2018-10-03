
public class SingletonUebung {
	
	//public static void main(String [] args) {
	//	SingletonUebung s = SingletonUebung.getInstance();
	//	}

	    private static final SingletonUebung OBJ = new SingletonUebung(); 
	      
	      private SingletonUebung() {               //private damit kein Zugrif von auﬂen und Objktbildung unterbunden
	          System.out.println("Objekt gebildet..."); 
	      } 
	           
	      public static SingletonUebung getInstance() { //Zugriff auf Objekt
	        return OBJ; 
	      } 
	      
	}

