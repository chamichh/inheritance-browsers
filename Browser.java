package practicals.Teams;

import java.util.ArrayList;

public class Browser {

	String name;
	boolean showIP;
	boolean savedHistory;
	int maxTabs;

	static ArrayList<Browser> allBrowsers = new ArrayList<Browser>();

	Browser(String name, boolean showIP, boolean savedHistory, int maxTabs) {
		this.name = name;
		this.showIP = showIP;
		this.savedHistory = savedHistory;
		this.maxTabs = maxTabs;
		Browser.allBrowsers.add(this);
	}

	boolean isDark() {
		return this.savedHistory == false && this.showIP == false;
	}

	void printDarkInfo() {
		System.out.println(this.name + " is a DARK browser, it can open a maximum of: " + this.maxTabs + " tabs");
	}
}
