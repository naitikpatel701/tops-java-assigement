package OOPs;

class Demo{
	
	static int count=0;
	Demo(){
		count++;
		//System.out.println(count);
	}
}

public class Object_count {
	 public static void main(String[] args) {
			
    
  	   Demo d=new Demo();
  	   Demo d1=new Demo();
  	   Demo d2=new Demo();
  	   Demo d3=new Demo();
  	   Demo d4=new Demo();
  	   Demo d5=new Demo();
  	   Demo d6=new Demo();
  	   
  	   
  	   System.out.println("total objects:"+Demo.count);
	}
}
