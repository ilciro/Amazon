package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

public class ControllerCatalogoHomePage {
	
	public void stampa(String s)
	{
		java.util.logging.Logger.getLogger("Oggetto acquistao").log(Level.INFO,s);
	}
	public ControllerCatalogoHomePage() {
		java.util.logging.Logger.getLogger("Costruttore ").log(Level.INFO,"costruttore controller");

 }
	
	public void leggi() 
	{
		String s;
	
		try( BufferedReader b=new BufferedReader(new FileReader("oggetti.txt")))
				{

		    

		    while(true) {
		      s=b.readLine();
		      if(s==null)
		        break;
		    }
		  }catch(IOException e)
		  {
				java.util.logging.Logger.getLogger("exxecione ").log(Level.INFO,"IOException");

		  }
	
	}
}
