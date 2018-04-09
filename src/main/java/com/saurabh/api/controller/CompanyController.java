package com.saurabh.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.api.dao.CompanyDAO;
import com.saurabh.api.model.Company;

@RestController
@RequestMapping("/company")
public class CompanyController {
	private final static Logger LOGGER = Logger.getLogger(CompanyController.class.getName());
	@Autowired
	CompanyDAO companyDAO;
	
	@RequestMapping(value = "/getAllCompanies", method = RequestMethod.GET)
	public List<Company> getAllCompanies() {
		List<Company> companyList = new ArrayList<Company>();
		try {
			companyList = companyDAO.findAll();
		} catch (Exception ex) {
			LOGGER.info(ex.getMessage());
		}
		return companyList;
	}
	
	@RequestMapping(value = "/saveCompany", method = RequestMethod.POST)
	public Map<String, Object> saveCompany(@RequestBody Company company) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			companyDAO.save(company);
			map.put("code", "success");
		} catch (Exception ex) {
			map.put("code", "error");
			map.put("errorResponse", ex.getMessage());
		}
		return map;
	}
	
	@RequestMapping(value = "/getCompany", method = RequestMethod.POST)
	public Company getCompany(@RequestBody String companyId) {
		Company company = new Company();
		try {
			company = companyDAO.findById(companyId);
		} catch (Exception ex) {
			LOGGER.info(ex.getMessage());
		}
		return company;
	}
}
