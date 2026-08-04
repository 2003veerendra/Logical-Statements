package NameandPrice;

import java.util.Scanner;

public class vegtables {

	public static void main(String[] args) {
		System.out.println("main method started");
		double vegprice = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Category : ");
			String catg = sc.next();
			switch(catg) { 
			case "veg" -> {
				System.out.println("Enter a Item :");
				String item = sc.next();
				switch(item) {
			
				case "tmt" -> {
				    System.out.println("Tomato per kg = 50rs");
				    double tmtprice = 50.0;
				    vegprice = vegprice + tmtprice;
				}

				case "ptt" -> {
				    System.out.println("Potato per kg = 45rs");
				    double pttprice = 45.0;
				    vegprice = vegprice + pttprice;
				}

				case "onion" -> {
				    System.out.println("Onion per kg = 40rs");
				    double onionprice = 40.0;
				    vegprice = vegprice + onionprice;
				}

				case "carrot" -> {
				    System.out.println("Carrot per kg = 60rs");
				    double carrotprice = 60.0;
				    vegprice = vegprice + carrotprice;
				}

				case "beans" -> {
				    System.out.println("Beans per kg = 70rs");
				    double beansprice = 70.0;
				    vegprice = vegprice + beansprice;
				}

				case "brinjal" -> {
				    System.out.println("Brinjal per kg = 50rs");
				    double brinjalprice = 50.0;
				    vegprice = vegprice + brinjalprice;
				}

				case "cabbage" -> {
				    System.out.println("Cabbage per kg = 35rs");
				    double cabbageprice = 35.0;
				    vegprice = vegprice + cabbageprice;
				}

				case "capsicum" -> {
				    System.out.println("Capsicum per kg = 80rs");
				    double capsicumprice = 80.0;
				    vegprice = vegprice + capsicumprice;
				}
				
				default -> System.out.println("Invalid vegetable code!");
				
				}
			}
			case "fruit" -> {
				System.out.println("Enter Item :");
				String Item = sc.next();
				switch(Item) {
				case "orn" -> {
				    System.out.println("Orange per kg is 100rs");
				    double ornprice = 100.0;
				    vegprice = vegprice + ornprice;
				}

				case "mng" -> {
				    System.out.println("Mango per kg is 120rs");
				    double mngprice = 120.0;
				    vegprice = vegprice + mngprice;
				}

				case "app" -> {
				    System.out.println("Apple per kg is 150rs");
				    double appprice = 150.0;
				    vegprice = vegprice + appprice;
				}

				case "ban" -> {
				    System.out.println("Banana per kg is 60rs");
				    double banprice = 60.0;
				    vegprice = vegprice + banprice;
				}

				case "grp" -> {
				    System.out.println("Grapes per kg is 90rs");
				    double grpprice = 90.0;
				    vegprice = vegprice + grpprice;
				}

				case "pne" -> {
				    System.out.println("Pineapple per kg is 80rs");
				    double pneprice = 80.0;
				    vegprice = vegprice + pneprice;
				}

				case "pap" -> {
				    System.out.println("Papaya per kg is 70rs");
				    double papprice = 70.0;
				    vegprice = vegprice + papprice;
				}

				case "wtr" -> {
				    System.out.println("Watermelon per kg is 40rs");
				    double wtrprice = 40.0;
				    vegprice = vegprice + wtrprice;
				}

				case "pme" -> {
				    System.out.println("Pomegranate per kg is 180rs");
				    double pmeprice = 180.0;
				    vegprice = vegprice + pmeprice;
				}

				case "gva" -> {
				    System.out.println("Guava per kg is 80rs");
				    double gvaprice = 80.0;
				    vegprice = vegprice + gvaprice;
				}

				case "cst" -> {
				    System.out.println("Custard Apple per kg is 140rs");
				    double cstprice = 140.0;
				    vegprice = vegprice + cstprice;
				}

				case "kiw" -> {
				    System.out.println("Kiwi per kg is 200rs");
				    double kiwprice = 200.0;
				    vegprice = vegprice + kiwprice;
				}

				case "str" -> {
				    System.out.println("Strawberry per kg is 250rs");
				    double strprice = 250.0;
				    vegprice = vegprice + strprice;
				}

				case "chry" -> {
				    System.out.println("Cherry per kg is 300rs");
				    double chryprice = 300.0;
				    vegprice = vegprice + chryprice;
				}

				case "lmn" -> {
				    System.out.println("Lemon per kg is 100rs");
				    double lmnprice = 100.0;
				    vegprice = vegprice + lmnprice;
				}

				case "fig" -> {
				    System.out.println("Fig per kg is 250rs");
				    double figprice = 250.0;
				    vegprice = vegprice + figprice;
				}

				case "cnb" -> {
				    System.out.println("Coconut per kg is 50rs");
				    double cnbprice = 50.0;
				    vegprice = vegprice + cnbprice;
				}
				default -> System.out.println("Invalid fruit code!");
				
				
				}
			}
			}
			System.out.println("Total veg price is : " + vegprice);
			System.out.println("Total veg price is : " + vegprice);
		}
		

	}

}
