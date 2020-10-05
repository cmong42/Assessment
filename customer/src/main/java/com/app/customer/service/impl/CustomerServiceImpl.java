package com.app.customer.service.impl;

import java.util.List;

import com.app.customer.dao.CustomerDAO;
import com.app.customer.dao.impl.CustomerDAOImpl;
import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;
import com.app.customer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao=new CustomerDAOImpl();
	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		int c=0;
		if(!isValidName(customer.getName())) {
			throw new BusinessException("Entered name "+customer.getName()+" is Invalid");
		}else if(!isValidContact(customer.getContact())) {
			throw new BusinessException("Entered contact = "+customer.getContact()+" is Invalid");
		}else if(!isValidGender(customer.getGender())) {
			throw new BusinessException("Entered gender = "+customer.getGender()+" is Invalid");
		}else if(!isValidAge(customer.getAge())) {
			throw new BusinessException("Entered Age = "+customer.getAge()+" is Invalid.. Only Age is valid between 19-44");
		}else {
			//code here for DAO
			c=dao.addCustomer(customer);
		}
		return c;
	}
	
	private boolean isValidName(String name) {
		boolean b=false;
		if(name.matches("[ a-z A-Z]{1,45}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidAge(int age) {
		boolean b=false;
		if(age>18 && age<45) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidGender(String gender) {
		boolean b=false;
		if(gender.matches("[mMfFoO]{1}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidContact(long contact) {
		boolean b=false;
		if((contact+"").matches("[0-9]{10}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidId(int id) {
		boolean b=false;
		if((id+"").matches("[0-9]{1}")) {
			b=true;
		}
		return b;
	}
	
	

	@Override
	public int updateCustomer(int id, long contact) throws BusinessException {
		int customer;
		if(!isValidContact(contact)) {
			throw new BusinessException("Entered contact "+contact+" is INVALID....");
		}else {
		customer = dao.updateCustomer(id, contact);
		}
		return customer;
	}

	@Override
	public int deleteCustomer(int id) throws BusinessException {
		int customer;
		if(!isValidId(id)) {
			throw new BusinessException("Entered ID "+id+" is INVALID....");
		}else {
		customer = dao.deleteCustomer(id);
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customersList=null;
		customersList=dao.getAllCustomers();
		return customersList;
	}

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		Customer customer;
		if(!isValidId(id)) {
			throw new BusinessException("Entered ID "+id+" is INVALID....");
		}else {
		customer = dao.getCustomerById(id);
		}
		return customer;
	}

	@Override
	public Customer getCustomerByContact(long contact) throws BusinessException {
		Customer customer;
		if(!isValidContact(contact)) {
			throw new BusinessException("Entered contact number "+contact+" is INVALID....");
		}else {
		customer = dao.getCustomerByContact(contact);
		}
		return customer;
	}

	@Override
	public List<Customer> getCustomersByAge(int age) throws BusinessException {
		List<Customer> customersList=null;
		if(!isValidAge(age)) {
			throw new BusinessException("Entered age "+age+" is INVALID....");
		}else {
		customersList=dao.getCustomersByAge(age);
		}
		return customersList;
	}

	@Override
	public List<Customer> getCustomersByName(String name) throws BusinessException {
		List<Customer> customersList=null;
		if(!isValidName(name)) {
			throw new BusinessException("Entered name "+name+" is INVALID....");
		}else {
		customersList=dao.getCustomersByName(name);
		}
		return customersList;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) throws BusinessException {
		List<Customer> customersList=null;
		customersList=dao.getCustomersByCity(city);
		return customersList;
	}

	@Override
	public List<Customer> getCustomersByGender(String gender) throws BusinessException {
		List<Customer> customersList=null;
		if(!isValidGender(gender)) {
			throw new BusinessException("Entered gender "+gender+" is INVALID....");
		}else {
		customersList=dao.getCustomersByGender(gender);
		}
		return customersList;
	}

}
