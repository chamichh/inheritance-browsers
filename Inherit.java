package practicals.Teams;

public class Inherit {

	public static void main(String[] args) { // name, showIP, savedHistory, maxTabs
		PublicBrowser public1 = new PublicBrowser("Chrome", true, true, 40);
		PublicBrowser public2 = new PublicBrowser("InternetExplorer", true, true, 5);
		PublicBrowser public3 = new PublicBrowser("FireFox", false, false, 15);
		PublicBrowser public4 = new PublicBrowser("Opera", true, false, 10);
		PrivateBrowser private1 = new PrivateBrowser("Tor", false, false, PrivateBrowser.TAB_LIMIT);
		PrivateBrowser private2 = new PrivateBrowser("Tor Boost", false, false, PrivateBrowser.TAB_LIMIT);
		PrivateBrowser private3 = new PrivateBrowser("Brave", false, false, 100);
		PrivateBrowser private4 = new PrivateBrowser("Brave Premium", false, false, 100);

		public3.printMaxExtensions();
		public2.printMaxExtensions();
		public4.printDarkInfo();
		public1.printDarkInfo();
		private4.printCocaineInfo();
		private1.printCocaineInfo();

		int c = 0;
		for (PrivateBrowser i : PrivateBrowser.allPrivateBrowsers) {
			if (i instanceof Browser) {
				Browser it = (Browser) i;
				if (it.isDark()) {
					c++;
					System.out.println(i);
				} else {
					System.out.println(i.name + " is not DARK");
				}
			} else {
				System.out.println(i.name + " is not a private browser");
			}
		}
		System.out.println("There are a total of " + c + " private browsers");
	}

}
