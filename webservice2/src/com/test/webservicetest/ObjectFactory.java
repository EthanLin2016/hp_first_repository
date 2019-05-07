package com.test.webservicetest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.test.webservicetest package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _AddBuyMetricInfoResponse_QNAME = new QName(
			"http://service.ws.hg.wuliu.tietie.com/",
			"addBuyMetricInfoResponse");
	private final static QName _AddBuyMetricInfo_QNAME = new QName(
			"http://service.ws.hg.wuliu.tietie.com/", "addBuyMetricInfo");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.test.webservicetest
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link HgGoodsDetailsVo }
	 * 
	 */
	public HgGoodsDetailsVo createHgGoodsDetailsVo() {
		return new HgGoodsDetailsVo();
	}

	/**
	 * Create an instance of {@link AddBuyMetricInfoResponse }
	 * 
	 */
	public AddBuyMetricInfoResponse createAddBuyMetricInfoResponse() {
		return new AddBuyMetricInfoResponse();
	}

	/**
	 * Create an instance of {@link ResponseResult }
	 * 
	 */
	public ResponseResult createResponseResult() {
		return new ResponseResult();
	}

	/**
	 * Create an instance of {@link GoodsDetailsVoBase }
	 * 
	 */
	public GoodsDetailsVoBase createGoodsDetailsVoBase() {
		return new GoodsDetailsVoBase();
	}

	/**
	 * Create an instance of {@link AddBuyMetricInfo }
	 * 
	 */
	public AddBuyMetricInfo createAddBuyMetricInfo() {
		return new AddBuyMetricInfo();
	}

	/**
	 * Create an instance of {@link GoodsInWeighInfoVoBase }
	 * 
	 */
	public GoodsInWeighInfoVoBase createGoodsInWeighInfoVoBase() {
		return new GoodsInWeighInfoVoBase();
	}

	/**
	 * Create an instance of {@link WebserviceHeader }
	 * 
	 */
	public WebserviceHeader createWebserviceHeader() {
		return new WebserviceHeader();
	}

	/**
	 * Create an instance of {@link HgGoodsInWeighInfoVo }
	 * 
	 */
	public HgGoodsInWeighInfoVo createHgGoodsInWeighInfoVo() {
		return new HgGoodsInWeighInfoVo();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddBuyMetricInfoResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.ws.hg.wuliu.tietie.com/", name = "addBuyMetricInfoResponse")
	public JAXBElement<AddBuyMetricInfoResponse> createAddBuyMetricInfoResponse(
			AddBuyMetricInfoResponse value) {
		return new JAXBElement<AddBuyMetricInfoResponse>(
				_AddBuyMetricInfoResponse_QNAME,
				AddBuyMetricInfoResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AddBuyMetricInfo }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.ws.hg.wuliu.tietie.com/", name = "addBuyMetricInfo")
	public JAXBElement<AddBuyMetricInfo> createAddBuyMetricInfo(
			AddBuyMetricInfo value) {
		return new JAXBElement<AddBuyMetricInfo>(_AddBuyMetricInfo_QNAME,
				AddBuyMetricInfo.class, null, value);
	}

}
