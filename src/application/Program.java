package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== ESTE 1: seller findById ===");
		Seller seller = sellerDao.finById(3);
		
		System.out.println(seller);
		
	}

}
