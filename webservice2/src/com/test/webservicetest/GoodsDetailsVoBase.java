package com.test.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for goodsDetailsVoBase complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="goodsDetailsVoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contracton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materielnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namematerials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordernum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratiweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehousename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goodsDetailsVoBase", propOrder = { "address", "batch",
		"contracton", "materielnum", "namematerials", "ordernum", "quantity",
		"ratiweight", "realweight", "standard", "unit", "warehousename" })
public class GoodsDetailsVoBase {

	protected String address;
	protected String batch;
	protected String contracton;
	protected String materielnum;
	protected String namematerials;
	protected String ordernum;
	protected String quantity;
	protected String ratiweight;
	protected String realweight;
	protected String standard;
	protected String unit;
	protected String warehousename;

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddress(String value) {
		this.address = value;
	}

	/**
	 * Gets the value of the batch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBatch() {
		return batch;
	}

	/**
	 * Sets the value of the batch property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBatch(String value) {
		this.batch = value;
	}

	/**
	 * Gets the value of the contracton property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContracton() {
		return contracton;
	}

	/**
	 * Sets the value of the contracton property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContracton(String value) {
		this.contracton = value;
	}

	/**
	 * Gets the value of the materielnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaterielnum() {
		return materielnum;
	}

	/**
	 * Sets the value of the materielnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaterielnum(String value) {
		this.materielnum = value;
	}

	/**
	 * Gets the value of the namematerials property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNamematerials() {
		return namematerials;
	}

	/**
	 * Sets the value of the namematerials property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNamematerials(String value) {
		this.namematerials = value;
	}

	/**
	 * Gets the value of the ordernum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrdernum() {
		return ordernum;
	}

	/**
	 * Sets the value of the ordernum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrdernum(String value) {
		this.ordernum = value;
	}

	/**
	 * Gets the value of the quantity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the quantity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQuantity(String value) {
		this.quantity = value;
	}

	/**
	 * Gets the value of the ratiweight property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRatiweight() {
		return ratiweight;
	}

	/**
	 * Sets the value of the ratiweight property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRatiweight(String value) {
		this.ratiweight = value;
	}

	/**
	 * Gets the value of the realweight property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRealweight() {
		return realweight;
	}

	/**
	 * Sets the value of the realweight property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRealweight(String value) {
		this.realweight = value;
	}

	/**
	 * Gets the value of the standard property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStandard() {
		return standard;
	}

	/**
	 * Sets the value of the standard property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStandard(String value) {
		this.standard = value;
	}

	/**
	 * Gets the value of the unit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the unit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnit(String value) {
		this.unit = value;
	}

	/**
	 * Gets the value of the warehousename property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWarehousename() {
		return warehousename;
	}

	/**
	 * Sets the value of the warehousename property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWarehousename(String value) {
		this.warehousename = value;
	}

}
