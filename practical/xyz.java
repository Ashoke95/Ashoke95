package Ashoke;


 class A
{
   int id;String name;
   
   public int getId()
   {
       return id;
   }
   
   public void setId(int id)
   {
       this.id=id;
       System.out.println(this.id);
   }
   public String getName()
   {
       return name;
   }
   public void setName(String name)
   {
       this.name=name;
       System.out.println(this.name);
   }
   
 
}

public  class xyz
{
	public static void main(String[] args) {
	  A t=new  A();
	    t.setId(3);
	    t.setName("Ashoke");
	
	}
}

