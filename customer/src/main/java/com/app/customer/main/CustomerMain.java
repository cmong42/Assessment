package com.app.customer.main;

import java.util.List;

import java.util.Scanner;

import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;
import com.app.customer.service.CustomerService;
import com.app.customer.service.impl.CustomerServiceImpl;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		CustomerService service=new CustomerServiceImpl();
		System.out.println("Welcome to Customer App V1.0");
		System.out.println("----------------------------------");
		do {
			System.out.println("Menu");
			System.out.println("=====");
			System.out.println("1)Add Customer");
			System.out.println("2)Update Customer");
			System.out.println("3)Delete Customer");
			System.out.println("4)Search Customer By Id");
			System.out.println("5)Search Customers By Name");
			System.out.println("6)Search Customers By Age");
			System.out.println("7)Search Customer By Contact");
			System.out.println("8)Search Customers By City");
			System.out.println("9)Search Customers By Gender");
			System.out.println("10)List All Customers");
			System.out.println("11)EXIT");
			System.out.println("Enter your choice between 1-11");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:System.out.println("Please enter below details to create a customer");
					Customer c=new Customer();
					System.out.println("Enter Name");
					c.setName(sc.nextLine());
					System.out.println("Enter City");
					c.setCity(sc.nextLine());
					System.out.println("Enter gender(m/f/o)");
					c.setGender(sc.nextLine());
					try {
						System.out.println("Enter Age");
					c.setAge(Integer.parseInt(sc.nextLine()));
					}catch(NumberFormatException e) {
						System.out.println("Age cannot be alphabets");
						break;
					}
					System.out.println("Enter Contact");
					c.setContact(Long.parseLong(sc.nextLine()));
				try {
					if(service.addCustomer(c)!=0) {
						System.out.println("Customer Added sucessfully.....");
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Enter ID");
					int id = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Contact");
					long contact = Long.parseLong(sc.nextLine());
					int answer = service.updateCustomer(id, contact);
					if (answer == 0) {
						System.out.println("Fail.");
					}else {
						System.out.println("Success!");
					}
				}catch(Exception e) {
					System.out.println(e);
				}

				break;
			case 3:
				try {
					System.out.println("Enter ID");
					int id = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Contact");
					long contact = Long.parseLong(sc.nextLine());
					int answer = service.deleteCustomer(id);
					if (answer == 0) {
						System.out.println("Fail.");
					}else {
						System.out.println("Success!");
					}
				}catch(Exception e) {
					System.out.println(e);
				}

				break;
			case 4:
				System.out.println("Type ID here: ");
				int ids=Integer.parseInt(sc.nextLine());
				try {
					Customer c2=service.getCustomerById(ids);
					if(c2!=null) {
						System.out.println("Customer with the contact "+ids+" is : ");
						System.out.println(c2);
					}
				} catch (BusinessException e2) {
					System.out.println(e2.getMessage());
				}

				break;
			case 5:	
				String name=sc.nextLine();
			try {
				List<Customer> customersByName=service.getCustomersByName(name);
				if(customersByName.size()>0) {
					System.out.println("There are "+customersByName.size()+" customer/s.. Details are ");
					for(Customer c1:customersByName) {
						System.out.println(c1);
					}
				}
			} catch (BusinessException e1) {
				System.out.println(e1.getMessage());
			}

				break;
			case 6:
				int age=Integer.parseInt(sc.nextLine());
				try {
					List<Customer> customersByAge=service.getCustomersByAge(age);
					if(customersByAge.size()>0) {
						System.out.println("There are "+customersByAge.size()+" customer/s.. Details are ");
						for(Customer c1:customersByAge) {
							System.out.println(c1);
						}
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}


				break;
			case 7:
				long contact=Long.parseLong(sc.nextLine());
				try {
					Customer c2=service.getCustomerByContact(contact);
					if(c2!=null) {
						System.out.println("Customer with the contact "+contact+" is : ");
						System.out.println(c2);
					}
				} catch (BusinessException e2) {
					System.out.println(e2.getMessage());
				}

				break;
			case 8:
				String city=sc.nextLine();
				try {
					List<Customer> customersByCity=service.getCustomersByCity(city);
					if(customersByCity.size()>0) {
						System.out.println("There are "+customersByCity.size()+" customer/s.. Details are ");
						for(Customer c1:customersByCity) {
							System.out.println(c1);
						}
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}

				break;
			case 9:System.out.println("Enter gender(m/f/o) to get the details of customer matching to the gender");
					String gender=sc.nextLine();
				try {
					List<Customer> customersByGenderList=service.getCustomersByGender(gender);
					if(customersByGenderList.size()>0) {
						System.out.println("There are "+customersByGenderList.size()+" customer/s.. Details are ");
						for(Customer c1:customersByGenderList) {
							System.out.println(c1);
						}
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}
					

				break;
			case 10:try {
					List<Customer> customersList=service.getAllCustomers();
					if(customersList.size()>0) {
						System.out.println("There are "+customersList.size()+" customer/s.. Details are ");
						for(Customer c1:customersList) {
							System.out.println(c1);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

			break;
			case 11:System.out.println("Thank you for using our Customer App V1.0..............");

				break;

			default:
				System.out.println("Invalid choice... Please enter any option between 1-11 only");
				break;
			}
		} while (ch != 11);

	}

}
