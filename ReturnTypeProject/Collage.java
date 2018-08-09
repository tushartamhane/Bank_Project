package pack5;

public class Collage {
	
	public Student addStudent(){
		
		Student s=new Student();
		s.setId(10);
		s.setName("Tushar");
		
		Address a=new Address();
		a.setLadr("Nagpur");
		a.setPadr("Pune");
		s.setAd(a);
		
		return s;
		
	}

}
