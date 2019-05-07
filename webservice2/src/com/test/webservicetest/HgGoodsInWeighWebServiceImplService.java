package com.test.webservicetest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * HgGoodsInWeighWebServiceImplService service = new HgGoodsInWeighWebServiceImplService();
 * HgGoodsInWeighWebService portType = service.getHgGoodsInWeighWebServiceImplPort();
 * portType.addBuyMetricInfo(...);
 * </pre>
 * 
 * </p>
 * 测试地址 47.92.171.180:8082
 * 正式地址106.117.250.38:9090
 */
@WebServiceClient(name = "HgGoodsInWeighWebServiceImplService", targetNamespace = "http://service.ws.hg.wuliu.tietie.com/", wsdlLocation = "http://106.117.250.38:9090/ttwl/webservice/integration/HgInGoodsWeighService?wsdl")
public class HgGoodsInWeighWebServiceImplService extends Service {

	private final static URL HGGOODSINWEIGHWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.test.webservicetest.HgGoodsInWeighWebServiceImplService.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.test.webservicetest.HgGoodsInWeighWebServiceImplService.class
					.getResource(".");
			url = new URL(
					baseUrl,
					"http://106.117.250.38:9090/ttwl/webservice/integration/HgInGoodsWeighService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://106.117.250.38:9090/ttwl/webservice/integration/HgInGoodsWeighService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		HGGOODSINWEIGHWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
	}

	public HgGoodsInWeighWebServiceImplService(URL wsdlLocation,
			QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public HgGoodsInWeighWebServiceImplService() {
		super(HGGOODSINWEIGHWEBSERVICEIMPLSERVICE_WSDL_LOCATION, new QName(
				"http://service.ws.hg.wuliu.tietie.com/",
				"HgGoodsInWeighWebServiceImplService"));
	}

	/**
	 * 
	 * @return returns HgGoodsInWeighWebService
	 */
	@WebEndpoint(name = "HgGoodsInWeighWebServiceImplPort")
	public HgGoodsInWeighWebService getHgGoodsInWeighWebServiceImplPort() {
		return super.getPort(new QName(
				"http://service.ws.hg.wuliu.tietie.com/",
				"HgGoodsInWeighWebServiceImplPort"),
				HgGoodsInWeighWebService.class);
	}

}
