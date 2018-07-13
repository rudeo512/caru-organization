package com.caru.organization.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.caru.organization.client.EmployeeClient;
import com.caru.organization.model.Employee;

/**
 * OrganizationRestController
 *
 * @author kyungdae.cho
 * @version 1.0.0
 * @since 2018. 07. 13.
 */

@RestController
public class OrganizationRestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationRestController.class);

	@Autowired
	private EmployeeClient employeeClient;

	@GetMapping("/{id}/with-employees")
	public List<Employee> findByIdWithEmployees(@PathVariable("id") Long id) {
		LOGGER.info("Organization find: id={}", id);
		return employeeClient.findByOrganization(id);
	}
}
