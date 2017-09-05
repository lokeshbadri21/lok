package akkil;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("sree");
		AL.add("slowmot");
        AL.add("kphp"); 
        //System.out.println(AL.get(1));
        //System.out.println(AL.get(0));
        //System.out.println(AL.get(2));
        for(int i=0;i<AL.size();i++)
        {
        	System.out.println(AL.get(i));

	}
        	
        
		
	}

}