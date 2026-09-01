
public class SocialMediaMain {

	public static void main(String[] args) {
		SocialMedia fb=new SocialMedia();
		fb.assignValues("Facebook",123);
		String fbDetails=fb.retrievevalues();
		System.out.println(fbDetails);
		
		
	    System.out.println("----------------");
	    System.out.println(fb.retrievevalues());

}
}