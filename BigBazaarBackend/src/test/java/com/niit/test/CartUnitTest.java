package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CartDAO;
import com.niit.dao.CategoryDAO;
import com.niit.model.CartItem;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class CartUnitTest {
	
static CartDAO cartDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();	
		cartDAO=(CartDAO)context.getBean("cartDAO");
	} 
	@Ignore
	@Test
	public void addCartItemTest() 
	{ 
		CartItem cartItem=new CartItem();
		cartItem.setProductId(83);
		cartItem.setProductName("	winterware ");
		cartItem.setQuantity(2);
		cartItem.setPrice(1200);
		cartItem.setPaymentStatus("NP");
		cartItem.setUsername("parvez");
		
		assertTrue("Problem in Adding into Cart",cartDAO.addCartItem(cartItem));
	}
	
	@Test
	public void updateCartItemTest()
	{
	CartItem cartItem=cartDAO.getCartItem(89);
	cartItem.setQuantity(4);
	assertTrue("problem in Upading the Cart",cartDAO.updateCartItem(cartItem));
	}
	
	@Test
	public void deleteCartItemTest()
	{
		CartItem cartItem=cartDAO.getCartItem(92);
		assertTrue("Problem in deleting the CartItem",cartDAO.deleteCartItem(cartItem));
	}
	
	 
	
	public void displayCartItems()
	{
		List<CartItem>listCartItems=cartDAO.listCartItems("parvez");
		
		assertTrue("Problem in Displaying the cartItems" ,listCartItems.size()>0);
		
		for (CartItem cartItem:listCartItems)
		{
			System.out.print(cartItem.getProductId()+"\t");
			System.out.print(cartItem.getProductName()+"\t");
			System.out.print(cartItem.getPrice()+"\t");
			System.out.print(cartItem.getPrice()*cartItem.getQuantity());
			
			
		} 
	}
	
 
}
