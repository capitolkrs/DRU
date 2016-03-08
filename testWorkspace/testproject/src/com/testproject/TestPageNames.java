package com.testproject;

public class TestPageNames {

	PageNames pageNames;

	public TestPageNames(PageNames pageNames) {
		this.pageNames = pageNames;
	}

	public void whatIsmyPage() {

		switch (pageNames) {
		case PIP:
			System.out.println("This is your product Information page");
			break;
		case PLP:
			System.out.println("This is your product Listing page");
			break;
		case SHIPING:
			System.out.println("This is your product Shiping page");
			break;
		case CART:
			System.out.println("This is your product Cart page");
			break;
		case CHECKOUT:
			System.out.println("This is your product Checkout page");
			break;

		default:
			System.out.println("This is Not a defined product  page");
			break;
		}
	}
	
	
	public static void main(String[] args) {
		TestPageNames nameMyPage=new TestPageNames(PageNames.CART);
		nameMyPage.whatIsmyPage();
	}

}
