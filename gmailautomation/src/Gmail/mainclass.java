package Gmail;

public class mainclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Gmaillogin g= new Gmaillogin();
g.signin();
Thread.sleep(5000);
//gmailcomposemail g1= new gmailcomposemail();
//g1.compose_mail();
//accessmail a= new accessmail();
//a.access();
//Thread.sleep(5000);
//gmaillogout g2=new gmaillogout();
//g2.logout();
deletemail d=new deletemail();
d.delete();
	}

}
