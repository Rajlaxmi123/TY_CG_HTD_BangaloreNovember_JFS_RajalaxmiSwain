package com.capgemini.ppc.DAO;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.ppc.Bean.ContractBean;
import com.capgemini.ppc.Bean.CustomerBean;

public class ContractDAOImpl implements ContractDAO {
	private List<ContractBean> contractBeans = new ArrayList<ContractBean>();
	@Override
	public boolean addContract(ContractBean bean) {
		for (ContractBean contractBean : contractBeans) {
			if(contractBean.getContractNo()== bean.getContractNo()) {
		        return false;
			}
		}
			contractBeans.add(bean);
			return true;
	}

	@Override
	public boolean deleteContract(int contractNo) {
		ContractBean bean = null;//creating this variable locally
		for (ContractBean contractBean : contractBeans) {
			if(contractBean.getContractNo()== bean.getContractNo()) {
		        bean = contractBean;
			}
		}
		if(bean!=null)
		{
			contractBeans.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public List<ContractBean> getAllContract() {
	
		return contractBeans;
	}

}
