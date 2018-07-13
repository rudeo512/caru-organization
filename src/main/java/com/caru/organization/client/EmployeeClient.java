package com.caru.organization.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.caru.organization.model.Employee;

/**
 * EmployeeClient
 *
 * @author kyungdae.cho
 * @version 1.0.0
 * @since 2018. 07. 13.
 */
@FeignClient(name = "user")
public interface EmployeeClient {

	@GetMapping("/organization/{organizationId}")
	List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);

}