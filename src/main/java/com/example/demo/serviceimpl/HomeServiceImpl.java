package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub
		return hr.save(e);
	}

	@Override
	public List getd() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Employee updated(Employee e) {
		// TODO Auto-generated method stub
		return  hr.save(e);
	}

	@Override
	public void deletedata(int a) {
		// TODO Auto-generated method stub
		hr.deleteById(a);;
	}


}
