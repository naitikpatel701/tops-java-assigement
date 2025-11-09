package Fileio;

import java.io.Serializable;

public class Product implements Serializable {
	
	transient int pid=101;
	String pname="clothes";
	String pbrand="denim";
	     
    public void dispaly() {
		
    	System.out.println(pid+" "+pname+" "+pbrand);
	}
}
