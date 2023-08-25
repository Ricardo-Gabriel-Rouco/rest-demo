package darkgallow.restdemo.models;

public class CloudVendor {
  private String vendorId;

  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  private String vendorName;

  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  private String vendorAddress;

  public String getVendorAddress() {
    return vendorAddress;
  }

  public void setVendorAddress(String vendorAddress) {
    this.vendorAddress = vendorAddress;
  }

  private String vendorPhoneNumber;

  public String getVendorPhoneNumber() {
    return vendorPhoneNumber;
  }

  public void setVendorPhoneNumber(String vendorPhoneNumber) {
    this.vendorPhoneNumber = vendorPhoneNumber;
  }

  public CloudVendor() {
  }

  public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
    this.vendorId = vendorId;
    this.vendorName = vendorName;
    this.vendorAddress = vendorAddress;
    this.vendorPhoneNumber = vendorPhoneNumber;
  }
}
