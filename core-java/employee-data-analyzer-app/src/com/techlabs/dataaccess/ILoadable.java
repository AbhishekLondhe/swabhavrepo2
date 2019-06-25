package com.techlabs.dataaccess;

import java.util.Set;

import com.techlabs.business.Employee;

public interface ILoadable {

	public Set<Employee> readData();
}
