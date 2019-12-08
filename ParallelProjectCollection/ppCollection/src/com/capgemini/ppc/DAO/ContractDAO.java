package com.capgemini.ppc.DAO;

import java.util.List;

import com.capgemini.ppc.Bean.ContractBean;


public interface ContractDAO {
	boolean addContract(ContractBean bean);
	boolean deleteContract(int contractNo);
	List<ContractBean> getAllContract();
	
	
	
	}
	



