package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class AddRecordPojo extends BaseClass{
public AddRecordPojo() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[text()=\"  ADD\"]")
private WebElement addLease;

@FindBy(xpath="(//i[@id='headerClose'])[1]")
private WebElement closeAddLease;
@FindBy(id="btnSave")
private WebElement saveAddLease;
@FindBy(id="btnCancel")
private WebElement cancelAddLease;
@FindBy(xpath="//span[text()='Attach File']")
private WebElement attachfileAddLease;
@FindBy(xpath="(//div[@title='Show drop-down'])[1]")
private WebElement trackType;
@FindBy(id="Fld_Field_14")
private WebElement fileId;
@FindBy(id="Fld_Field_30")
private WebElement caseID;
@FindBy(xpath="(//div[@title='Show Master List'])[1]")
private WebElement propertyId;
@FindBy(xpath="(//div[@title='Show drop-down'])[3]")
private WebElement requestorName;
@FindBy(xpath="//div[@title='Show Multi-column-picklist']")
private WebElement reqLeaseAdd;
public WebElement getAddLease() {
	return addLease;
}
public WebElement getCloseAddLease() {
	return closeAddLease;
}
public WebElement getSaveAddLease() {
	return saveAddLease;
}
public WebElement getCancelAddLease() {
	return cancelAddLease;
}
public WebElement getAttachfileAddLease() {
	return attachfileAddLease;
}
public WebElement getTrackType() {
	return trackType;
}
public WebElement getFileId() {
	return fileId;
}
public WebElement getCaseID() {
	return caseID;
}
public WebElement getPropertyId() {
	return propertyId;
}
public WebElement getRequestorName() {
	return requestorName;
}
public WebElement getReqLeaseAdd() {
	return reqLeaseAdd;
}
}
