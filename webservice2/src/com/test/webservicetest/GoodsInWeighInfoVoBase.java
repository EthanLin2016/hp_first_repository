package com.test.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for goodsInWeighInfoVoBase complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="goodsInWeighInfoVoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maktx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maktxdetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maktxnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msbill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendpla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarestationname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transunitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitdes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weighstationname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goodsInWeighInfoVoBase", propOrder = { "consignnum",
		"contractnum", "customername", "dataid", "maktx", "maktxdetail",
		"maktxnum", "msbill", "msunit", "sendpla", "shipnum",
		"tarestationname", "transunitname", "unitdes", "vehnum",
		"weighstationname" })
public class GoodsInWeighInfoVoBase {

	protected String consignnum;
	protected String contractnum;
	protected String customername;
	protected String dataid;
	protected String maktx;
	protected String maktxdetail;
	protected String maktxnum;
	protected String msbill;
	protected String msunit;
	protected String sendpla;
	protected String shipnum;
	protected String tarestationname;
	protected String transunitname;
	protected String unitdes;
	protected String vehnum;
	protected String weighstationname;

	/**
	 * Gets the value of the consignnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConsignnum() {
		return consignnum;
	}

	/**
	 * Sets the value of the consignnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConsignnum(String value) {
		this.consignnum = value;
	}

	/**
	 * Gets the value of the contractnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContractnum() {
		return contractnum;
	}

	/**
	 * Sets the value of the contractnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContractnum(String value) {
		this.contractnum = value;
	}

	/**
	 * Gets the value of the customername property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomername() {
		return customername;
	}

	/**
	 * Sets the value of the customername property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomername(String value) {
		this.customername = value;
	}

	/**
	 * Gets the value of the dataid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataid() {
		return dataid;
	}

	/**
	 * Sets the value of the dataid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataid(String value) {
		this.dataid = value;
	}

	/**
	 * Gets the value of the maktx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaktx() {
		return maktx;
	}

	/**
	 * Sets the value of the maktx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaktx(String value) {
		this.maktx = value;
	}

	/**
	 * Gets the value of the maktxdetail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaktxdetail() {
		return maktxdetail;
	}

	/**
	 * Sets the value of the maktxdetail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaktxdetail(String value) {
		this.maktxdetail = value;
	}

	/**
	 * Gets the value of the maktxnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaktxnum() {
		return maktxnum;
	}

	/**
	 * Sets the value of the maktxnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaktxnum(String value) {
		this.maktxnum = value;
	}

	/**
	 * Gets the value of the msbill property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsbill() {
		return msbill;
	}

	/**
	 * Sets the value of the msbill property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsbill(String value) {
		this.msbill = value;
	}

	/**
	 * Gets the value of the msunit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsunit() {
		return msunit;
	}

	/**
	 * Sets the value of the msunit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsunit(String value) {
		this.msunit = value;
	}

	/**
	 * Gets the value of the sendpla property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSendpla() {
		return sendpla;
	}

	/**
	 * Sets the value of the sendpla property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSendpla(String value) {
		this.sendpla = value;
	}

	/**
	 * Gets the value of the shipnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShipnum() {
		return shipnum;
	}

	/**
	 * Sets the value of the shipnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShipnum(String value) {
		this.shipnum = value;
	}

	/**
	 * Gets the value of the tarestationname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTarestationname() {
		return tarestationname;
	}

	/**
	 * Sets the value of the tarestationname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTarestationname(String value) {
		this.tarestationname = value;
	}

	/**
	 * Gets the value of the transunitname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransunitname() {
		return transunitname;
	}

	/**
	 * Sets the value of the transunitname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransunitname(String value) {
		this.transunitname = value;
	}

	/**
	 * Gets the value of the unitdes property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnitdes() {
		return unitdes;
	}

	/**
	 * Sets the value of the unitdes property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnitdes(String value) {
		this.unitdes = value;
	}

	/**
	 * Gets the value of the vehnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVehnum() {
		return vehnum;
	}

	/**
	 * Sets the value of the vehnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVehnum(String value) {
		this.vehnum = value;
	}

	/**
	 * Gets the value of the weighstationname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWeighstationname() {
		return weighstationname;
	}

	/**
	 * Sets the value of the weighstationname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWeighstationname(String value) {
		this.weighstationname = value;
	}

}
