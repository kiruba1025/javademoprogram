package com.ebrain.demo;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class customerss{
	String name;
	 String district;
	 String state;
	 String country;
	
	public customerss (int i, String name,String district,String state,String country) {
		this.name=name;
		this.district=district;
		this.state=state;
		this.country=country;
		
	}
}
public class Assignment6 {
	public static void main(String[] args) {
		int i;
		int j;
		Scanner customers = new Scanner(System.in);
		System.out.println("Enter customer:");
		int cus = customers.nextInt();
		ArrayList<customerss> a = new ArrayList<customerss>();
		for (i = 0; i < cus; i++) {
			System.out.println(i + 1);
			System.out.print("Name:");
			String name = customers.next();
			System.out.print("District:");
			String district = customers.next();
			System.out.print("State:");
			String state = customers.next();
			System.out.print("Country:");
			String country = customers.next();
			customerss obj = new customerss(1, name, district, state, country);
			a.add(obj);
		}

//		for (customerss c : a) {
//			System.out.println(
//					"Name:" + c.name + " ," + "District:" + c.district + "," + "State:" + c.state + "," + c.country);
//		}
	Map<Integer,customerss> map=new HashMap <Integer,customerss>();
	for(customerss c:a) {

map.put(1,c);

	}
	for(customerss c:a) {
	for(Map.Entry<Integer,customerss>entry:map.entrySet()) {
		j =entry.getKey();
		System.out.println(j+" Details");
		System.out.println("Name:"+c.name+" ,"+"District:"+c.district+","+"State:"+c.state+","+"Country:"+c.country);
	}
	}
		Map<String, Map<String, Map<String, List<customerss>>>> groupedcustomers = new HashMap<>();
		for (customerss c : a) {
			String country = c.country;
			String state = c.state;
			String district = c.district;
			groupedcustomers.computeIfAbsent(country, k -> new HashMap<>()).computeIfAbsent(state, k -> new HashMap<>())
					.computeIfAbsent(district, k -> new ArrayList<>()).add(c);
		}
		Map<String, Map<String, List<customerss>>> groupedcustomers1 = new HashMap<>();
		for (customerss c : a) {
			String country = c.country;
			String state = c.state;
			String district = c.district;
			groupedcustomers1.computeIfAbsent(state, k -> new HashMap<>())
					.computeIfAbsent(district, k -> new ArrayList<>()).add(c);
		}
		System.out.println("District wise customer");
		for (Entry<String, Map<String, List<customerss>>> stateEntry : groupedcustomers1.entrySet()) {

			for (Entry<String, List<customerss>> districtEntry : stateEntry.getValue().entrySet()) {
				String district = districtEntry.getKey();
				int totaldistrict = 0;
				List<customerss> stateList = districtEntry.getValue();
				totaldistrict += stateList.size();

				System.out.println(district + ":" + totaldistrict);

				System.out.println("Country wise total Customer");
				for (Map.Entry<String, Map<String, Map<String, List<customerss>>>> countryEntry : groupedcustomers
						.entrySet()) {
					String country = countryEntry.getKey();
					int totalcustomer = 0;
					for (Map.Entry<String, Map<String, List<customerss>>> stateEntry1 : countryEntry.getValue()
							.entrySet()) {
						for (List<customerss> districtList : stateEntry1.getValue().values()) {
							totalcustomer += districtList.size();
						}
					}
					System.out.println(country + "," + totalcustomer);

					System.out.println("country & state & district wise total customer");

					for (Entry<String, Map<String, List<customerss>>> stateEntry1 : countryEntry.getValue()
							.entrySet()) {
						String state = stateEntry1.getKey();
						int statetotal = 0;
						for (Map.Entry<String, Map<String, List<customerss>>> stateEntry11 : countryEntry.getValue()
								.entrySet()) {
							for (List<customerss> districtList : stateEntry11.getValue().values()) {
								statetotal += districtList.size();
							}
						}
						System.out.print("country" + ":" + country + "," + "state: " + state + "," + "district: "
								+ district + "(" + totaldistrict + ")");
						System.out.println(" ");
						System.out.println("total customer in " + state + ":" + statetotal);
						System.out.println("total customer in " + country + ":" + totalcustomer);
					}
				}
			}
		}
	}	
	}





