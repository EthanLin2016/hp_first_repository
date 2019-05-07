package com.test.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for responseResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="responseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rspCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rspData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="rspMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rspTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rspType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseResult", propOrder = { "rspCode", "rspData", "rspMsg",
		"rspTime", "rspType" })
public class ResponseResult {

	protected String rspCode;
	protected Object rspData;
	protected String rspMsg;
	protected String rspTime;
	protected String rspType;

	/**
	 * Gets the value of the rspCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRspCode() {
		return rspCode;
	}

	/**
	 * Sets the value of the rspCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRspCode(String value) {
		this.rspCode = value;
	}

	/**
	 * Gets the value of the rspData property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getRspData() {
		return rspData;
	}

	/**
	 * Sets the value of the rspData property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setRspData(Object value) {
		this.rspData = value;
	}

	/**
	 * Gets the value of the rspMsg property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRspMsg() {
		return rspMsg;
	}

	/**
	 * Sets the value of the rspMsg property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRspMsg(String value) {
		this.rspMsg = value;
	}

	/**
	 * Gets the value of the rspTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRspTime() {
		return rspTime;
	}

	/**
	 * Sets the value of the rspTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRspTime(String value) {
		this.rspTime = value;
	}

	/**
	 * Gets the value of the rspType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRspType() {
		return rspType;
	}

	/**
	 * Sets the value of the rspType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRspType(String value) {
		this.rspType = value;
	}

}
