package day4;

public class ContactDetails {
	private String houseNumber;
	private String localityName;
	private String streetName;
	private String cityName;
	private String countryName;
	private long pincode;
	public ContactDetails()
	{
		super();
		
	}
public ContactDetails(String houseNumber,String localityName, String streetName,String cityName,String countryName,long pincode)
{
super();
this.houseNumber=houseNumber;
this.localityName=localityName;
this.streetName=streetName;
this.cityName=cityName;
this.countryName=countryName;
this.pincode=pincode;
}
public String gethouseNumber() {
	return houseNumber;
}
public void sethouseNumber(String houseNumber)
{
	this.houseNumber=houseNumber;
}

public String getlocalityName()
{
	return localityName;
}
public void setlocalityName(String localityName)
{
	this.localityName=localityName;
}
public String getstreetName()
{
	return streetName;
}
public void setstreetName(String streetName)
{
	this.streetName=streetName;
}
public String getcityName()
{
	return cityName;
}
public void setcityName(String cityName)
{
	this.cityName=cityName;
}
public String getcountryName()
{
	return countryName;
}
public void setcountryName(String countryName)
{
	this.countryName=countryName;
}
public long getpincode()
{
	return pincode;
}
public void setpincode(long pincode)
{
	this.pincode=pincode;
}
public String toString() {
	return "ContactDetails [houseNumber=" + houseNumber + ", localityName=" + localityName + ", streetName=" + streetName + ",cityName=" + cityName+",pincode="+pincode+"]";
}
}


