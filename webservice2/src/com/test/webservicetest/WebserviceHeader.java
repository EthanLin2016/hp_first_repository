package com.test.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for webserviceHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="webserviceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageSendingDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webserviceHeader", propOrder = { "account", "dataSource",
		"documentVersionNumber", "messageSendingDateTime", "pwd" })
public class WebserviceHeader {

	protected String account;
	protected String dataSource;
	protected String documentVersionNumber;
	protected String messageSendingDateTime;
	protected String pwd;

	/**
	 * Gets the value of the account property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * Sets the value of the account property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccount(String value) {
		this.account = value;
	}

	/**
	 * Gets the value of the dataSource property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * Sets the value of the dataSource property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataSource(String value) {
		this.dataSource = value;
	}

	/**
	 * Gets the value of the documentVersionNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocumentVersionNumber() {
		return documentVersionNumber;
	}

	/**
	 * Sets the value of the documentVersionNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDocumentVersionNumber(String value) {
		this.documentVersionNumber = value;
	}

	/**
	 * Gets the value of the messageSendingDateTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessageSendingDateTime() {
		return messageSendingDateTime;
	}

	/**
	 * Sets the value of the messageSendingDateTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessageSendingDateTime(String value) {
		this.messageSendingDateTime = value;
	}

	/**
	 * Gets the value of the pwd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * Sets the value of the pwd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPwd(String value) {
		this.pwd = value;
	}

}
