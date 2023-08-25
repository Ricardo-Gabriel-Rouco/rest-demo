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
public class CloudVendorAPIService {
  CloudVendor cloudVendor;

  // localhost:8080/cloudvendor/{vendorId}
  @GetMapping("{vendorId}")
  public CloudVendor getCLoudVendorDetails(String vendorId) {
    return cloudVendor;
  }

  // localhost:8080/cloudvendor using a post request with a body in json format
  @PostMapping
  public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    this.cloudVendor = cloudVendor;
    return "Cloud vendor created";
  }

  // localhost:8080/cloudvendor using a post request with a body in json format
  @PutMapping
  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    this.cloudVendor = cloudVendor;
    return "Cloud vendor updated";
  }

  // localhost:8080/cloudvendor/{vendorId} using a delete request
  @DeleteMapping("{vendorId}")
  public String deleteCloudVendorDetails(String vendorId) {
    this.cloudVendor = null;
    return "Cloud vendor deleted";
  }
}