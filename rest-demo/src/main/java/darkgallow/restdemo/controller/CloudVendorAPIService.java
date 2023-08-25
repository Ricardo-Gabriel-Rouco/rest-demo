package darkgallow.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import darkgallow.restdemo.models.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService{
  CloudVendor cloudVendor;

  @GetMapping("{vendorId}")
  public CloudVendor getCLoudVendorDetails(String vendorId){
    return cloudVendor;
  }

  @PostMapping
  public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor = cloudVendor;
    return "Cloud vendor created";
  }

  @PutMapping
  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor = cloudVendor;
    return "Cloud vendor updated";
  }

  @DeleteMapping("{vendorId}")
  public String deleteCloudVendorDetails(String vendorId){
    this.cloudVendor = null;
    return "Cloud vendor deleted";
  }
}