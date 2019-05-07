package com.test.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for addBuyMetricInfoResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="addBuyMetricInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.ws.hg.wuliu.tietie.com/}responseResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBuyMetricInfoResponse", propOrder = { "_return" })
public class AddBuyMetricInfoResponse {

	@XmlElement(name = "return")
	protected ResponseResult _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link ResponseResult }
	 * 
	 */
	public ResponseResult getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link ResponseResult }
	 * 
	 */
	public void setReturn(ResponseResult value) {
		this._return = value;
	}

}
