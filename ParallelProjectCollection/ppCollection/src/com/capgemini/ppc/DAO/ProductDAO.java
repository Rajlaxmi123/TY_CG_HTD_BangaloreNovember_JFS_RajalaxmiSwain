package com.capgemini.ppc.DAO;

import java.util.List;

import com.capgemini.ppc.Bean.ProductBean;

public interface ProductDAO {

	boolean addProduct(ProductBean bean);
	boolean  deleteProduct(int prodId);
	boolean modifyProduct(int prodId);
	List<ProductBean> getAllProduct();
}
