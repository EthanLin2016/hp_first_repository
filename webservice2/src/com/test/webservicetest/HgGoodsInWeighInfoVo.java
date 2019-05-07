package com.test.webservicetest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hgGoodsInWeighInfoVo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hgGoodsInWeighInfoVo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ws.hg.wuliu.tietie.com/}goodsInWeighInfoVoBase">
 *       &lt;sequence>
 *         &lt;element name="businesstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodsDetails" type="{http://service.ws.hg.wuliu.tietie.com/}hgGoodsDetailsVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groweight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inpla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netweight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pregroweight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pretareweight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="taretime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tareweight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *         &lt;element name="wgttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgGoodsInWeighInfoVo", propOrder = { "businesstype",
		"goodsDetails", "groweight", "inpla", "netweight", "pregroweight",
		"pretareweight", "taretime", "tareweight", "texteight", "textfive",
		"textfour", "textnine", "textone", "textseven", "textsix", "textten",
		"textthree", "texttwo", "wgttime" })
public class HgGoodsInWeighInfoVo extends GoodsInWeighInfoVoBase {

	protected String businesstype;
	@XmlElement(nillable = true)
	protected List<HgGoodsDetailsVo> goodsDetails;
	protected BigDecimal groweight;
	protected String inpla;
	protected BigDecimal netweight;
	protected BigDecimal pregroweight;
	protected BigDecimal pretareweight;
	protected String taretime;
	protected BigDecimal tareweight;
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
	protected String wgttime;

	/**
	 * Gets the value of the businesstype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBusinesstype() {
		return businesstype;
	}

	/**
	 * Sets the value of the businesstype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBusinesstype(String value) {
		this.businesstype = value;
	}

	/**
	 * Gets the value of the goodsDetails property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the goodsDetails property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getGoodsDetails().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HgGoodsDetailsVo }
	 * 
	 * 
	 */
	public List<HgGoodsDetailsVo> getGoodsDetails() {
		if (goodsDetails == null) {
			goodsDetails = new ArrayList<HgGoodsDetailsVo>();
		}
		return this.goodsDetails;
	}

	/**
	 * Gets the value of the groweight property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getGroweight() {
		return groweight;
	}

	/**
	 * Sets the value of the groweight property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setGroweight(BigDecimal value) {
		this.groweight = value;
	}

	/**
	 * Gets the value of the inpla property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInpla() {
		return inpla;
	}

	/**
	 * Sets the value of the inpla property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInpla(String value) {
		this.inpla = value;
	}

	/**
	 * Gets the value of the netweight property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getNetweight() {
		return netweight;
	}

	/**
	 * Sets the value of the netweight property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setNetweight(BigDecimal value) {
		this.netweight = value;
	}

	/**
	 * Gets the value of the pregroweight property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getPregroweight() {
		return pregroweight;
	}

	/**
	 * Sets the value of the pregroweight property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setPregroweight(BigDecimal value) {
		this.pregroweight = value;
	}

	/**
	 * Gets the value of the pretareweight property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getPretareweight() {
		return pretareweight;
	}

	/**
	 * Sets the value of the pretareweight property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setPretareweight(BigDecimal value) {
		this.pretareweight = value;
	}

	/**
	 * Gets the value of the taretime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaretime() {
		return taretime;
	}

	/**
	 * Sets the value of the taretime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaretime(String value) {
		this.taretime = value;
	}

	/**
	 * Gets the value of the tareweight property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTareweight() {
		return tareweight;
	}

	/**
	 * Sets the value of the tareweight property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTareweight(BigDecimal value) {
		this.tareweight = value;
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

	/**
	 * Gets the value of the wgttime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWgttime() {
		return wgttime;
	}

	/**
	 * Sets the value of the wgttime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWgttime(String value) {
		this.wgttime = value;
	}

}
