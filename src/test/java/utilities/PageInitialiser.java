package utilities;

import pages.*;

public class PageInitialiser extends Base {
	
	public static HomePage hp;
	public static SuperDealsPage sdp;
	public static ConsumerElectronicsPage cep;
	public static LoginPage lp;
	public static MenFashionPage mfp;
	public static TicketsPage tp;
	public static CategoryPage cp;
	public static SignInPage sip;
	public static RegisterPage rp;
	public static AppOnlyPage aop;
	public static FavouritesPage fp;
	public static CartPage CP;
	
	public static void initialise() {
		hp = new HomePage();
		sdp = new SuperDealsPage();
		cep = new ConsumerElectronicsPage();
		lp = new LoginPage();
		mfp = new MenFashionPage();
		tp = new TicketsPage();
		cp = new CategoryPage();
		sip = new SignInPage();
		rp = new RegisterPage();
		aop = new AppOnlyPage();
		fp = new FavouritesPage();
		CP = new CartPage();
	}

}
