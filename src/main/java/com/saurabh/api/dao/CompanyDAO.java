package com.saurabh.api.dao;

import com.saurabh.api.model.Company;

public class CompanyDAO extends MongoDAO<Company> {
	public CompanyDAO() {
		super(Company.class);
	}
}
