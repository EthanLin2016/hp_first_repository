package com.test.webservicetest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for addBuyMetricInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="addBuyMetricInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="webserviceHeader" type="{http://service.ws.hg.wuliu.tietie.com/}webserviceHeader" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyMetricVos" type="{http://service.ws.hg.wuliu.tietie.com/}hgGoodsInWeighInfoVo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBuyMetricInfo", propOrder = { "webserviceHeader",
		"startTime", "endTime", "buyMetricVos" })
public class AddBuyMetricInfo {

	protected WebserviceHeader webserviceHeader;
	protected String startTime;
	protected String endTime;
	protected List<HgGoodsInWeighInfoVo> buyMetricVos;

	/**
	 * Gets the value of the webserviceHeader property.
	 * 
	 * @return possible object is {@link WebserviceHeader }
	 * 
	 */
	public WebserviceHeader getWebserviceHeader() {
		return webserviceHeader;
	}

	/**
	 * Sets the value of the webserviceHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link WebserviceHeader }
	 * 
	 */
	public void setWebserviceHeader(WebserviceHeader value) {
		this.webserviceHeader = value;
	}

	/**
	 * Gets the value of the startTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the startTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartTime(String value) {
		this.startTime = value;
	}

	/**
	 * Gets the value of the endTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the value of the endTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndTime(String value) {
		this.endTime = value;
	}

	/**
	 * Gets the value of the buyMetricVos property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the buyMetricVos property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBuyMetricVos().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HgGoodsInWeighInfoVo }
	 * 
	 * 
	 */
	public List<HgGoodsInWeighInfoVo> getBuyMetricVos() {
		if (buyMetricVos == null) {
			buyMetricVos = new ArrayList<HgGoodsInWeighInfoVo>();
		}
		return this.buyMetricVos;
	}

}
