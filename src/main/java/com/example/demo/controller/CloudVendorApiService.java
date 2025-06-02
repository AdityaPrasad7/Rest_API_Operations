package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
		
		return cloudVendor;
				
//				new cloudVendor("C1", "Vendor 1", "Address one", "xxxxxx");
		
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "cloud vendor created successfully!";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "cloud vendor updated successfully!";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "cloud vendor deleted successfully!";
	}


}
