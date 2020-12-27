package com.mtdevuk.daos;

public interface UrlDAO {
	String generateShortCode();
	
	void storeUrl(String shortCode, String URL);
}
