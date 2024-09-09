
public class Main {

	@SuppressWarnings("deprecation")
	//@SuppressWarnings("{deprecation,overide}")
	public static void main(String[] args) {
		R02_Deprecated depre=new R02_Deprecated();
		
		depre.oldAge = 23;
		
		System.out.println(depre.getOldAge());
	}

}          
