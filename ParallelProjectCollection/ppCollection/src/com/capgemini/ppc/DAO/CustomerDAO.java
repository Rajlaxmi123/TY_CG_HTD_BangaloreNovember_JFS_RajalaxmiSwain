package com.capgemini.ppc.DAO;

import java.util.List;

import com.capgemini.ppc.Bean.CustomerBean;

public interface CustomerDAO {
	boolean addCustomer(CustomerBean bean);
	boolean deleteCustomer(int custid);
	boolean modifyCustomer(int custid);
	
     List<CustomerBean> getAllCustomer();
}
