package com.mphasis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mphasis.model.Eproduct;

@Repository
public class EproductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Eproduct> getProducts() {
		
		List<Eproduct> eproducts = jdbcTemplate.query("select * from eproduct", new RowMapper<Eproduct> () {
			@Override
			public Eproduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				Eproduct eproduct = new Eproduct();
				eproduct.setId(rs.getLong(1));
				eproduct.setName(rs.getString(2));
				eproduct.setDateAdded(rs.getDate(3));
				
				return eproduct;
			}
			
		});
		
		return eproducts;
	}
	
}
