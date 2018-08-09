package pack5;

public class Demo {
	
	public static void main(String[] args) { //Has relation....
		
		Collage c=new Collage();
		
		Student s=c.addStudent();
		
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAd().getLadr()+" "+s.getAd().getPadr());
		
		
	}
	

}
