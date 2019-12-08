package com.capgemini.ppc.factory;

import com.capgemini.ppc.DAO.ContractDAO;
import com.capgemini.ppc.DAO.ContractDAOImpl;

public class ContractManager {
	public static ContractDAO getContractDAO()
	{
		return new ContractDAOImpl();
	}

}
