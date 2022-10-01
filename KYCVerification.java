package day4;

public class KYCVerification {
	private String panNumber;
	private long adharNumber;
	private String documentType;
	private String documentNumber;
	public KYCVerification()
	{
		super();
		
	}
public KYCVerification(String panNumber,long adharNumber,String documentType,String documentNumber)
{
super();
this.panNumber=panNumber;
this.adharNumber=adharNumber;
this.documentType=documentType;
this.documentNumber=documentNumber;
}
public String getpanNumber() {
	return panNumber;
}
public void setpanNumber(String panNumber)
{
	this.panNumber=panNumber;
}
public long getadharNumber()
{
	return adharNumber;
}
public void setadharNumber(long adharNumber)
{
	this.adharNumber=adharNumber;
}
public String getdocumentType()
{
	return documentType;
}
public void setdocumentType(String documentType)
{
	this.documentType=documentType;
}
public String getdocumentNumber()
{
	return documentNumber;
}
public void setdocumentNumber(String documentNumber)
{
	this.documentNumber=documentNumber;
}
public String toString() {
	return "KYCVerification [panNumber=" + panNumber + ", adharNumber" + adharNumber + ", documentType=" + documentType + ",documentNumber=\" + documentNumber +]";
}
}
