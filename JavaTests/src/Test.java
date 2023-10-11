public class Person {
	private String _name;
	public String getName() {
		return _name;
	}
	public String getTelephoneNumber() {
		return ("(" + OfficeAreaCode.getOfficeAreaCode() + ") " + OfficeNumber.getOfficeNumber());
	}

public class OfficeAreaCode {
	public String _officeAreaCode;
	
	String getOfficeAreaCode() {
		return _officeAreaCode;
	}
	void setOfficeAreaCode(String arg) {
		_officeAreaCode = arg;
	}	
}

public class OfficeNumber {
	private String _officeNumber;
	
	String getOfficeNumber() {
		return _officeNumber;
	}
	void setOfficeNumber(String arg) {
		_officeNumber = arg;
	}
}
}