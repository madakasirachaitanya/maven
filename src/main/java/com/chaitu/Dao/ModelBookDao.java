package com.chaitu.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.chaitu.model.ModelBook;
import com.chaitu.util.ConnectionUtil;


public class ModelBookDao {

	public  void  insertBook(ModelBook book) throws Exception{
		   Connection connection = ConnectionUtil.getConnectionUtil();
		   String query2="insert into book(isbn,title,author,publisherDate,content,price,status)values(?,?,?,?,?,?,?)";
		   PreparedStatement pst = connection.prepareStatement(query2);
		   pst.setInt(1, book.getIsbn());
		   pst.setString(2, book.getTitle());
		   pst.setString(3, book.getAuthor());
		   pst.setDate(4, Date.valueOf(book.getPublisherDate()));
		   pst.setString(5, book.getContent());
		   pst.setInt(6, book.getPrice());
		   pst.setString(7, book.getStatus());
		   int row=pst.executeUpdate();
		   System.out.println("No OF ROWS="+row);
		   
		   
		   
		   
	   }
	}


