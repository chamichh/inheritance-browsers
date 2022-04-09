package practicals.Teams;

import java.util.ArrayList;

public class PublicBrowser extends Browser {
	int maxExtensions;
	boolean browserProfile;

	static ArrayList<PublicBrowser> allPublicBrowsers = new ArrayList<PublicBrowser>();

	public PublicBrowser(String name, boolean showIP, boolean savedHistory, int maxTabs) {
		super(name, showIP, savedHistory, maxTabs);
		this.maxExtensions = (int) (Math.random() * 100) + 1;
		this.browserProfile = browserProfile;
		if (this.showIP == false || this.name == "Opera") {
			this.browserProfile = false;
		} else {
			this.browserProfile = true;
		}
		PublicBrowser.allPublicBrowsers.add(this);

	}

	boolean isDark() {
		return super.isDark() || this.browserProfile == false;
	}

	void printMaxExtensions() {
		System.out.println(this.name + " has a potential maxiumum extensios of: " + this.maxExtensions);
	}

	void printDarkInfo() {
		if (isDark()) {
			super.printDarkInfo();
		} else {
			System.out.println(this.name + " is not a DARK browser");
		}
	}
}
