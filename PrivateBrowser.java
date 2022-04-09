package practicals.Teams;

import java.util.ArrayList;

public class PrivateBrowser extends Browser {
	int maxCocaineOrder;
	boolean cookieSaving;
	String leader;
	static final int TAB_LIMIT = 9999;

	static ArrayList<PrivateBrowser> allPrivateBrowsers = new ArrayList<PrivateBrowser>();

	public PrivateBrowser(String name, boolean showIP, boolean savedHistory, int maxTabs) {
		super(name, showIP, savedHistory, maxTabs);
		this.maxCocaineOrder = maxCocaineOrder;
		this.cookieSaving = cookieSaving;
		this.leader = leader;
		setValues();
		this.allPrivateBrowsers.add(this);
	}

	boolean premiumDark() {
		return this.name.contains("Premium") && super.isDark() == true;
	}

	boolean boostDark() {
		return this.name.contains("Boost") && super.isDark() == true;
	}

	boolean normalDark() {
		return isDark() || this.showIP == false;
	}

	void setValues() {
		if (premiumDark()) {
			this.maxCocaineOrder = 250;
			this.cookieSaving = false;
			this.leader = "Pablo";
			return;
		}
		if (boostDark()) {
			this.maxCocaineOrder = 100;
			this.cookieSaving = false;
			this.leader = "Al Capone";
			return;
		}
		if (normalDark()) {
			this.maxCocaineOrder = 50;
			this.cookieSaving = true;
			this.leader = "Ilze";
		} else {
			System.out.println(this.name + " is not DARK");
		}
	}

	boolean isDark() {
		return this.savedHistory != true && this.maxTabs > 99;
	}

	void printCocaineInfo() {
		if (premiumDark() || boostDark()) {
			System.out.println(this.name + " has the ability to order: " + maxCocaineOrder + "kg of cocaine");
		} else {
			System.out.println(this.name + " can only order: " + maxCocaineOrder + "kg of cocaine");
			System.out.println("Only for a limited time period you can upgrade to:");
			System.out.println(this.name + " Premium for 49.99$/mon");
			System.out.println(this.name + " Boost for 29.99$/mon");

		}
	}

	public String toString() {
		return this.name + " leader is " + this.leader;
	}

}
