package com.capgemini.ppc.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.ppc.Bean.ContractBean;
import com.capgemini.ppc.Bean.CustomerBean;
import com.capgemini.ppc.Bean.ProductBean;

public class ProductDAOImpl implements ProductDAO{

	Scanner sc = new Scanner(System.in);

	
	private List<ProductBean> productBeans = new ArrayList<ProductBean>();
	
	@Override
	public boolean addProduct(ProductBean bean) {
		for (ProductBean productBean : productBeans) {
			if(productBean.getProdId()== bean.getProdId()) {
		        return false;
			}
		}
			productBeans.add(bean);
			return true;
	}

	@Override
	public boolean deleteProduct(int prodId) {
	ProductBean bean = null;//creating this variable locally
		for (ProductBean productBean : productBeans) {
			if(productBean.getProdId()== bean.getProdId()) {
		        bean = productBean;
			}
		}
		if(bean!=null)
		{
			productBeans.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyProduct(int prodId) {
		System.out.println("Enter the new product Id");
		for(int i=0;i<productBeans.size();i++)
		{
			if(productBeans.get(i).getProdId()== prodId)
			{
				productBeans.get(i).setProdId(sc.nextInt());
			}
			return true;
		}
		return false;
		
	}

	@Override
	public List<ProductBean> getAllProduct() {
		// TODO Auto-generated method stub
		return productBeans;
	}

}
