package com.test.webservicetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hgGoodsDetailsVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hgGoodsDetailsVo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.hg.wuliu.tietie.com/}goodsDetailsVoBase">
 *       &lt;sequence>
 *         &lt;element name="recpnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texteight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textfive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textfour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textnine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textseven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textsix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textthree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texttwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgGoodsDetailsVo", propOrder = { "recpnum", "texteight",
		"textfive", "textfour", "textnine", "textone", "textseven", "textsix",
		"textten", "textthree", "texttwo" })
public class HgGoodsDetailsVo extends GoodsDetailsVoBase {

	protected String recpnum;
	protected String texteight;
	protected String textfive;
	protected String textfour;
	protected String textnine;
	protected String textone;
	protected String textseven;
	protected String textsix;
	protected String textten;
	protected String textthree;
	protected String texttwo;

	/**
	 * Gets the value of the recpnum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecpnum() {
		return recpnum;
	}

	/**
	 * Sets the value of the recpnum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRecpnum(String value) {
		this.recpnum = value;
	}

	/**
	 * Gets the value of the texteight property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTexteight() {
		return texteight;
	}

	/**
	 * Sets the value of the texteight property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTexteight(String value) {
		this.texteight = value;
	}

	/**
	 * Gets the value of the textfive property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextfive() {
		return textfive;
	}

	/**
	 * Sets the value of the textfive property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextfive(String value) {
		this.textfive = value;
	}

	/**
	 * Gets the value of the textfour property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextfour() {
		return textfour;
	}

	/**
	 * Sets the value of the textfour property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextfour(String value) {
		this.textfour = value;
	}

	/**
	 * Gets the value of the textnine property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextnine() {
		return textnine;
	}

	/**
	 * Sets the value of the textnine property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextnine(String value) {
		this.textnine = value;
	}

	/**
	 * Gets the value of the textone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextone() {
		return textone;
	}

	/**
	 * Sets the value of the textone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextone(String value) {
		this.textone = value;
	}

	/**
	 * Gets the value of the textseven property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextseven() {
		return textseven;
	}

	/**
	 * Sets the value of the textseven property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextseven(String value) {
		this.textseven = value;
	}

	/**
	 * Gets the value of the textsix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextsix() {
		return textsix;
	}

	/**
	 * Sets the value of the textsix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextsix(String value) {
		this.textsix = value;
	}

	/**
	 * Gets the value of the textten property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextten() {
		return textten;
	}

	/**
	 * Sets the value of the textten property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextten(String value) {
		this.textten = value;
	}

	/**
	 * Gets the value of the textthree property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTextthree() {
		return textthree;
	}

	/**
	 * Sets the value of the textthree property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTextthree(String value) {
		this.textthree = value;
	}

	/**
	 * Gets the value of the texttwo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTexttwo() {
		return texttwo;
	}

	/**
	 * Sets the value of the texttwo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTexttwo(String value) {
		this.texttwo = value;
	}

}
