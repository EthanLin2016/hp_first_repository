/**
 * HgGoodsInWeighWebServiceImplServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.test.webservicetestWSDL2;


/*
 *  HgGoodsInWeighWebServiceImplServiceStub java implementation
 */
public class HgGoodsInWeighWebServiceImplServiceStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public HgGoodsInWeighWebServiceImplServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public HgGoodsInWeighWebServiceImplServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public HgGoodsInWeighWebServiceImplServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://47.92.171.180:8082/ttwl/webservice/integration/HgInGoodsWeighService");
    }

    /**
     * Default Constructor
     */
    public HgGoodsInWeighWebServiceImplServiceStub()
        throws org.apache.axis2.AxisFault {
        this(
            "http://47.92.171.180:8082/ttwl/webservice/integration/HgInGoodsWeighService");
    }

    /**
     * Constructor taking the target endpoint
     */
    public HgGoodsInWeighWebServiceImplServiceStub(
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "HgGoodsInWeighWebServiceImplService" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://service.ws.hg.wuliu.tietie.com/", "addBuyMetricInfo"));
        _service.addOperation(__operation);

        _operations[0] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplService#addBuyMetricInfo
     * @param addBuyMetricInfo0
     */
    public com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE addBuyMetricInfo(
        com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE addBuyMetricInfo0)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://service.ws.hg.wuliu.tietie.com/HgGoodsInWeighWebService/addBuyMetricInfo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    addBuyMetricInfo0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://service.ws.hg.wuliu.tietie.com/",
                            "addBuyMetricInfo")),
                    new javax.xml.namespace.QName(
                        "http://service.ws.hg.wuliu.tietie.com/",
                        "addBuyMetricInfo"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE.class);

            return (com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "addBuyMetricInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "addBuyMetricInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "addBuyMetricInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplService#startaddBuyMetricInfo
     * @param addBuyMetricInfo0
     */
    public void startaddBuyMetricInfo(
        com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE addBuyMetricInfo0,
        final com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                        .setAction("http://service.ws.hg.wuliu.tietie.com/HgGoodsInWeighWebService/addBuyMetricInfo");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                addBuyMetricInfo0,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://service.ws.hg.wuliu.tietie.com/",
                        "addBuyMetricInfo")),
                new javax.xml.namespace.QName(
                    "http://service.ws.hg.wuliu.tietie.com/", "addBuyMetricInfo"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE.class);
                        callback.receiveResultaddBuyMetricInfo((com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErroraddBuyMetricInfo(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "addBuyMetricInfo"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "addBuyMetricInfo"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "addBuyMetricInfo"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErroraddBuyMetricInfo(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErroraddBuyMetricInfo(f);
                                }
                            } else {
                                callback.receiveErroraddBuyMetricInfo(f);
                            }
                        } else {
                            callback.receiveErroraddBuyMetricInfo(f);
                        }
                    } else {
                        callback.receiveErroraddBuyMetricInfo(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErroraddBuyMetricInfo(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE.class.equals(
                        type)) {
                return com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE.class.equals(
                        type)) {
                return com.test.webservicetestWSDL2.HgGoodsInWeighWebServiceImplServiceStub.AddBuyMetricInfoResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    //http://47.92.171.180:8082/ttwl/webservice/integration/HgInGoodsWeighService
    public static class AddBuyMetricInfoResponse implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = addBuyMetricInfoResponse
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for _return
         */
        protected ResponseResult local_return;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local_returnTracker = false;

        public boolean is_returnSpecified() {
            return local_returnTracker;
        }

        /**
         * Auto generated getter method
         * @return ResponseResult
         */
        public ResponseResult get_return() {
            return local_return;
        }

        /**
         * Auto generated setter method
         * @param param _return
         */
        public void set_return(ResponseResult param) {
            local_returnTracker = param != null;

            this.local_return = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://service.ws.hg.wuliu.tietie.com/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":addBuyMetricInfoResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "addBuyMetricInfoResponse", xmlWriter);
                }
            }

            if (local_returnTracker) {
                if (local_return == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "return cannot be null!!");
                }

                local_return.serialize(new javax.xml.namespace.QName("",
                        "return"), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static AddBuyMetricInfoResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                AddBuyMetricInfoResponse object = new AddBuyMetricInfoResponse();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"addBuyMetricInfoResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (AddBuyMetricInfoResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "return").equals(
                                reader.getName())) {
                        object.set_return(ResponseResult.Factory.parse(reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GoodsDetailsVoBase implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = goodsDetailsVoBase
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for Address
         */
        protected java.lang.String localAddress;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAddressTracker = false;

        /**
         * field for Batch
         */
        protected java.lang.String localBatch;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBatchTracker = false;

        /**
         * field for Contracton
         */
        protected java.lang.String localContracton;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localContractonTracker = false;

        /**
         * field for Materielnum
         */
        protected java.lang.String localMaterielnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMaterielnumTracker = false;

        /**
         * field for Namematerials
         */
        protected java.lang.String localNamematerials;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNamematerialsTracker = false;

        /**
         * field for Ordernum
         */
        protected java.lang.String localOrdernum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localOrdernumTracker = false;

        /**
         * field for Quantity
         */
        protected java.lang.String localQuantity;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localQuantityTracker = false;

        /**
         * field for Ratiweight
         */
        protected java.lang.String localRatiweight;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRatiweightTracker = false;

        /**
         * field for Realweight
         */
        protected java.lang.String localRealweight;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRealweightTracker = false;

        /**
         * field for Standard
         */
        protected java.lang.String localStandard;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStandardTracker = false;

        /**
         * field for Unit
         */
        protected java.lang.String localUnit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localUnitTracker = false;

        /**
         * field for Warehousename
         */
        protected java.lang.String localWarehousename;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWarehousenameTracker = false;

        public boolean isAddressSpecified() {
            return localAddressTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getAddress() {
            return localAddress;
        }

        /**
         * Auto generated setter method
         * @param param Address
         */
        public void setAddress(java.lang.String param) {
            localAddressTracker = param != null;

            this.localAddress = param;
        }

        public boolean isBatchSpecified() {
            return localBatchTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBatch() {
            return localBatch;
        }

        /**
         * Auto generated setter method
         * @param param Batch
         */
        public void setBatch(java.lang.String param) {
            localBatchTracker = param != null;

            this.localBatch = param;
        }

        public boolean isContractonSpecified() {
            return localContractonTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getContracton() {
            return localContracton;
        }

        /**
         * Auto generated setter method
         * @param param Contracton
         */
        public void setContracton(java.lang.String param) {
            localContractonTracker = param != null;

            this.localContracton = param;
        }

        public boolean isMaterielnumSpecified() {
            return localMaterielnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMaterielnum() {
            return localMaterielnum;
        }

        /**
         * Auto generated setter method
         * @param param Materielnum
         */
        public void setMaterielnum(java.lang.String param) {
            localMaterielnumTracker = param != null;

            this.localMaterielnum = param;
        }

        public boolean isNamematerialsSpecified() {
            return localNamematerialsTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getNamematerials() {
            return localNamematerials;
        }

        /**
         * Auto generated setter method
         * @param param Namematerials
         */
        public void setNamematerials(java.lang.String param) {
            localNamematerialsTracker = param != null;

            this.localNamematerials = param;
        }

        public boolean isOrdernumSpecified() {
            return localOrdernumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getOrdernum() {
            return localOrdernum;
        }

        /**
         * Auto generated setter method
         * @param param Ordernum
         */
        public void setOrdernum(java.lang.String param) {
            localOrdernumTracker = param != null;

            this.localOrdernum = param;
        }

        public boolean isQuantitySpecified() {
            return localQuantityTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getQuantity() {
            return localQuantity;
        }

        /**
         * Auto generated setter method
         * @param param Quantity
         */
        public void setQuantity(java.lang.String param) {
            localQuantityTracker = param != null;

            this.localQuantity = param;
        }

        public boolean isRatiweightSpecified() {
            return localRatiweightTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRatiweight() {
            return localRatiweight;
        }

        /**
         * Auto generated setter method
         * @param param Ratiweight
         */
        public void setRatiweight(java.lang.String param) {
            localRatiweightTracker = param != null;

            this.localRatiweight = param;
        }

        public boolean isRealweightSpecified() {
            return localRealweightTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRealweight() {
            return localRealweight;
        }

        /**
         * Auto generated setter method
         * @param param Realweight
         */
        public void setRealweight(java.lang.String param) {
            localRealweightTracker = param != null;

            this.localRealweight = param;
        }

        public boolean isStandardSpecified() {
            return localStandardTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStandard() {
            return localStandard;
        }

        /**
         * Auto generated setter method
         * @param param Standard
         */
        public void setStandard(java.lang.String param) {
            localStandardTracker = param != null;

            this.localStandard = param;
        }

        public boolean isUnitSpecified() {
            return localUnitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getUnit() {
            return localUnit;
        }

        /**
         * Auto generated setter method
         * @param param Unit
         */
        public void setUnit(java.lang.String param) {
            localUnitTracker = param != null;

            this.localUnit = param;
        }

        public boolean isWarehousenameSpecified() {
            return localWarehousenameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWarehousename() {
            return localWarehousename;
        }

        /**
         * Auto generated setter method
         * @param param Warehousename
         */
        public void setWarehousename(java.lang.String param) {
            localWarehousenameTracker = param != null;

            this.localWarehousename = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://service.ws.hg.wuliu.tietie.com/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":goodsDetailsVoBase", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "goodsDetailsVoBase", xmlWriter);
                }
            }

            if (localAddressTracker) {
                namespace = "";
                writeStartElement(null, namespace, "address", xmlWriter);

                if (localAddress == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "address cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localAddress);
                }

                xmlWriter.writeEndElement();
            }

            if (localBatchTracker) {
                namespace = "";
                writeStartElement(null, namespace, "batch", xmlWriter);

                if (localBatch == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "batch cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBatch);
                }

                xmlWriter.writeEndElement();
            }

            if (localContractonTracker) {
                namespace = "";
                writeStartElement(null, namespace, "contracton", xmlWriter);

                if (localContracton == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "contracton cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localContracton);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaterielnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "materielnum", xmlWriter);

                if (localMaterielnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "materielnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaterielnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localNamematerialsTracker) {
                namespace = "";
                writeStartElement(null, namespace, "namematerials", xmlWriter);

                if (localNamematerials == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "namematerials cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNamematerials);
                }

                xmlWriter.writeEndElement();
            }

            if (localOrdernumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "ordernum", xmlWriter);

                if (localOrdernum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "ordernum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localOrdernum);
                }

                xmlWriter.writeEndElement();
            }

            if (localQuantityTracker) {
                namespace = "";
                writeStartElement(null, namespace, "quantity", xmlWriter);

                if (localQuantity == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "quantity cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localQuantity);
                }

                xmlWriter.writeEndElement();
            }

            if (localRatiweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "ratiweight", xmlWriter);

                if (localRatiweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "ratiweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRatiweight);
                }

                xmlWriter.writeEndElement();
            }

            if (localRealweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "realweight", xmlWriter);

                if (localRealweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "realweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRealweight);
                }

                xmlWriter.writeEndElement();
            }

            if (localStandardTracker) {
                namespace = "";
                writeStartElement(null, namespace, "standard", xmlWriter);

                if (localStandard == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "standard cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStandard);
                }

                xmlWriter.writeEndElement();
            }

            if (localUnitTracker) {
                namespace = "";
                writeStartElement(null, namespace, "unit", xmlWriter);

                if (localUnit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "unit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localUnit);
                }

                xmlWriter.writeEndElement();
            }

            if (localWarehousenameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "warehousename", xmlWriter);

                if (localWarehousename == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "warehousename cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWarehousename);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GoodsDetailsVoBase parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GoodsDetailsVoBase object = new GoodsDetailsVoBase();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"goodsDetailsVoBase".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GoodsDetailsVoBase) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "address").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "address" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "batch").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "batch" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBatch(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "contracton").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "contracton" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setContracton(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "materielnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "materielnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaterielnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "namematerials").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "namematerials" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNamematerials(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "ordernum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ordernum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setOrdernum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "quantity").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "quantity" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setQuantity(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "ratiweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ratiweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRatiweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "realweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "realweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRealweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "standard").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "standard" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStandard(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "unit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "unit" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setUnit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "warehousename").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "warehousename" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWarehousename(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class AddBuyMetricInfo implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = addBuyMetricInfo
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for WebserviceHeader
         */
        protected WebserviceHeader localWebserviceHeader;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWebserviceHeaderTracker = false;

        /**
         * field for StartTime
         */
        protected java.lang.String localStartTime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStartTimeTracker = false;

        /**
         * field for EndTime
         */
        protected java.lang.String localEndTime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localEndTimeTracker = false;

        /**
         * field for BuyMetricVos
         * This was an Array!
         */
        protected HgGoodsInWeighInfoVo[] localBuyMetricVos;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBuyMetricVosTracker = false;

        public boolean isWebserviceHeaderSpecified() {
            return localWebserviceHeaderTracker;
        }

        /**
         * Auto generated getter method
         * @return WebserviceHeader
         */
        public WebserviceHeader getWebserviceHeader() {
            return localWebserviceHeader;
        }

        /**
         * Auto generated setter method
         * @param param WebserviceHeader
         */
        public void setWebserviceHeader(WebserviceHeader param) {
            localWebserviceHeaderTracker = param != null;

            this.localWebserviceHeader = param;
        }

        public boolean isStartTimeSpecified() {
            return localStartTimeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStartTime() {
            return localStartTime;
        }

        /**
         * Auto generated setter method
         * @param param StartTime
         */
        public void setStartTime(java.lang.String param) {
            localStartTimeTracker = param != null;

            this.localStartTime = param;
        }

        public boolean isEndTimeSpecified() {
            return localEndTimeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getEndTime() {
            return localEndTime;
        }

        /**
         * Auto generated setter method
         * @param param EndTime
         */
        public void setEndTime(java.lang.String param) {
            localEndTimeTracker = param != null;

            this.localEndTime = param;
        }

        public boolean isBuyMetricVosSpecified() {
            return localBuyMetricVosTracker;
        }

        /**
         * Auto generated getter method
         * @return HgGoodsInWeighInfoVo[]
         */
        public HgGoodsInWeighInfoVo[] getBuyMetricVos() {
            return localBuyMetricVos;
        }

        /**
         * validate the array for BuyMetricVos
         */
        protected void validateBuyMetricVos(HgGoodsInWeighInfoVo[] param) {
        }

        /**
         * Auto generated setter method
         * @param param BuyMetricVos
         */
        public void setBuyMetricVos(HgGoodsInWeighInfoVo[] param) {
            validateBuyMetricVos(param);

            localBuyMetricVosTracker = param != null;

            this.localBuyMetricVos = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param HgGoodsInWeighInfoVo
         */
        public void addBuyMetricVos(HgGoodsInWeighInfoVo param) {
            if (localBuyMetricVos == null) {
                localBuyMetricVos = new HgGoodsInWeighInfoVo[] {  };
            }

            //update the setting tracker
            localBuyMetricVosTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localBuyMetricVos);
            list.add(param);
            this.localBuyMetricVos = (HgGoodsInWeighInfoVo[]) list.toArray(new HgGoodsInWeighInfoVo[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://service.ws.hg.wuliu.tietie.com/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":addBuyMetricInfo", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "addBuyMetricInfo", xmlWriter);
                }
            }

            if (localWebserviceHeaderTracker) {
                if (localWebserviceHeader == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                        "webserviceHeader cannot be null!!");
                }

                localWebserviceHeader.serialize(new javax.xml.namespace.QName(
                        "", "webserviceHeader"), xmlWriter);
            }

            if (localStartTimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "startTime", xmlWriter);

                if (localStartTime == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "startTime cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStartTime);
                }

                xmlWriter.writeEndElement();
            }

            if (localEndTimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "endTime", xmlWriter);

                if (localEndTime == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "endTime cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localEndTime);
                }

                xmlWriter.writeEndElement();
            }

            if (localBuyMetricVosTracker) {
                if (localBuyMetricVos != null) {
                    for (int i = 0; i < localBuyMetricVos.length; i++) {
                        if (localBuyMetricVos[i] != null) {
                            localBuyMetricVos[i].serialize(new javax.xml.namespace.QName(
                                    "", "buyMetricVos"), xmlWriter);
                        } else {
                            // we don't have to do any thing since minOccures is zero
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "buyMetricVos cannot be null!!");
                }
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static AddBuyMetricInfo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                AddBuyMetricInfo object = new AddBuyMetricInfo();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"addBuyMetricInfo".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (AddBuyMetricInfo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list4 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "webserviceHeader").equals(
                                reader.getName())) {
                        object.setWebserviceHeader(WebserviceHeader.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "startTime").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "startTime" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStartTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "endTime").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "endTime" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setEndTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "buyMetricVos").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        list4.add(HgGoodsInWeighInfoVo.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone4 = false;

                        while (!loopDone4) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone4 = true;
                            } else {
                                if (new javax.xml.namespace.QName("",
                                            "buyMetricVos").equals(
                                            reader.getName())) {
                                    list4.add(HgGoodsInWeighInfoVo.Factory.parse(
                                            reader));
                                } else {
                                    loopDone4 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setBuyMetricVos((HgGoodsInWeighInfoVo[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                HgGoodsInWeighInfoVo.class, list4));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class HgGoodsInWeighInfoVo extends GoodsInWeighInfoVoBase
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = hgGoodsInWeighInfoVo
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for Businesstype
         */
        protected java.lang.String localBusinesstype;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localBusinesstypeTracker = false;

        /**
         * field for GoodsDetails
         * This was an Array!
         */
        protected HgGoodsDetailsVo[] localGoodsDetails;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localGoodsDetailsTracker = false;

        /**
         * field for Groweight
         */
        protected java.math.BigDecimal localGroweight;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localGroweightTracker = false;

        /**
         * field for Inpla
         */
        protected java.lang.String localInpla;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localInplaTracker = false;

        /**
         * field for Netweight
         */
        protected java.math.BigDecimal localNetweight;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localNetweightTracker = false;

        /**
         * field for Taretime
         */
        protected java.lang.String localTaretime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTaretimeTracker = false;

        /**
         * field for Tareweight
         */
        protected java.math.BigDecimal localTareweight;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTareweightTracker = false;

        /**
         * field for Wgttime
         */
        protected java.lang.String localWgttime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWgttimeTracker = false;

        public boolean isBusinesstypeSpecified() {
            return localBusinesstypeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getBusinesstype() {
            return localBusinesstype;
        }

        /**
         * Auto generated setter method
         * @param param Businesstype
         */
        public void setBusinesstype(java.lang.String param) {
            localBusinesstypeTracker = param != null;

            this.localBusinesstype = param;
        }

        public boolean isGoodsDetailsSpecified() {
            return localGoodsDetailsTracker;
        }

        /**
         * Auto generated getter method
         * @return HgGoodsDetailsVo[]
         */
        public HgGoodsDetailsVo[] getGoodsDetails() {
            return localGoodsDetails;
        }

        /**
         * validate the array for GoodsDetails
         */
        protected void validateGoodsDetails(HgGoodsDetailsVo[] param) {
        }

        /**
         * Auto generated setter method
         * @param param GoodsDetails
         */
        public void setGoodsDetails(HgGoodsDetailsVo[] param) {
            validateGoodsDetails(param);

            localGoodsDetailsTracker = true;

            this.localGoodsDetails = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param HgGoodsDetailsVo
         */
        public void addGoodsDetails(HgGoodsDetailsVo param) {
            if (localGoodsDetails == null) {
                localGoodsDetails = new HgGoodsDetailsVo[] {  };
            }

            //update the setting tracker
            localGoodsDetailsTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localGoodsDetails);
            list.add(param);
            this.localGoodsDetails = (HgGoodsDetailsVo[]) list.toArray(new HgGoodsDetailsVo[list.size()]);
        }

        public boolean isGroweightSpecified() {
            return localGroweightTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getGroweight() {
            return localGroweight;
        }

        /**
         * Auto generated setter method
         * @param param Groweight
         */
        public void setGroweight(java.math.BigDecimal param) {
            localGroweightTracker = param != null;

            this.localGroweight = param;
        }

        public boolean isInplaSpecified() {
            return localInplaTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getInpla() {
            return localInpla;
        }

        /**
         * Auto generated setter method
         * @param param Inpla
         */
        public void setInpla(java.lang.String param) {
            localInplaTracker = param != null;

            this.localInpla = param;
        }

        public boolean isNetweightSpecified() {
            return localNetweightTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getNetweight() {
            return localNetweight;
        }

        /**
         * Auto generated setter method
         * @param param Netweight
         */
        public void setNetweight(java.math.BigDecimal param) {
            localNetweightTracker = param != null;

            this.localNetweight = param;
        }

        public boolean isTaretimeSpecified() {
            return localTaretimeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTaretime() {
            return localTaretime;
        }

        /**
         * Auto generated setter method
         * @param param Taretime
         */
        public void setTaretime(java.lang.String param) {
            localTaretimeTracker = param != null;

            this.localTaretime = param;
        }

        public boolean isTareweightSpecified() {
            return localTareweightTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigDecimal
         */
        public java.math.BigDecimal getTareweight() {
            return localTareweight;
        }

        /**
         * Auto generated setter method
         * @param param Tareweight
         */
        public void setTareweight(java.math.BigDecimal param) {
            localTareweightTracker = param != null;

            this.localTareweight = param;
        }

        public boolean isWgttimeSpecified() {
            return localWgttimeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWgttime() {
            return localWgttime;
        }

        /**
         * Auto generated setter method
         * @param param Wgttime
         */
        public void setWgttime(java.lang.String param) {
            localWgttimeTracker = param != null;

            this.localWgttime = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://service.ws.hg.wuliu.tietie.com/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":hgGoodsInWeighInfoVo", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "hgGoodsInWeighInfoVo", xmlWriter);
            }

            if (localConsignnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "consignnum", xmlWriter);

                if (localConsignnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "consignnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localConsignnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localContractnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "contractnum", xmlWriter);

                if (localContractnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "contractnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localContractnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localCustomernameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "customername", xmlWriter);

                if (localCustomername == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "customername cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCustomername);
                }

                xmlWriter.writeEndElement();
            }

            if (localDataidTracker) {
                namespace = "";
                writeStartElement(null, namespace, "dataid", xmlWriter);

                if (localDataid == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "dataid cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDataid);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaktxTracker) {
                namespace = "";
                writeStartElement(null, namespace, "maktx", xmlWriter);

                if (localMaktx == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "maktx cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaktx);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaktxdetailTracker) {
                namespace = "";
                writeStartElement(null, namespace, "maktxdetail", xmlWriter);

                if (localMaktxdetail == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "maktxdetail cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaktxdetail);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaktxnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "maktxnum", xmlWriter);

                if (localMaktxnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "maktxnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaktxnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localMsbillTracker) {
                namespace = "";
                writeStartElement(null, namespace, "msbill", xmlWriter);

                if (localMsbill == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "msbill cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMsbill);
                }

                xmlWriter.writeEndElement();
            }

            if (localMsunitTracker) {
                namespace = "";
                writeStartElement(null, namespace, "msunit", xmlWriter);

                if (localMsunit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "msunit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMsunit);
                }

                xmlWriter.writeEndElement();
            }

            if (localSendplaTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sendpla", xmlWriter);

                if (localSendpla == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sendpla cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSendpla);
                }

                xmlWriter.writeEndElement();
            }

            if (localShipnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "shipnum", xmlWriter);

                if (localShipnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "shipnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localShipnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localTarestationnameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "tarestationname", xmlWriter);

                if (localTarestationname == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "tarestationname cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTarestationname);
                }

                xmlWriter.writeEndElement();
            }

            if (localTransunitnameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "transunitname", xmlWriter);

                if (localTransunitname == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "transunitname cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTransunitname);
                }

                xmlWriter.writeEndElement();
            }

            if (localUnitdesTracker) {
                namespace = "";
                writeStartElement(null, namespace, "unitdes", xmlWriter);

                if (localUnitdes == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "unitdes cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localUnitdes);
                }

                xmlWriter.writeEndElement();
            }

            if (localVehnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "vehnum", xmlWriter);

                if (localVehnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "vehnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localVehnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localWeighstationnameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "weighstationname", xmlWriter);

                if (localWeighstationname == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "weighstationname cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWeighstationname);
                }

                xmlWriter.writeEndElement();
            }

            if (localBusinesstypeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "businesstype", xmlWriter);

                if (localBusinesstype == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "businesstype cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBusinesstype);
                }

                xmlWriter.writeEndElement();
            }

            if (localGoodsDetailsTracker) {
                if (localGoodsDetails != null) {
                    for (int i = 0; i < localGoodsDetails.length; i++) {
                        if (localGoodsDetails[i] != null) {
                            localGoodsDetails[i].serialize(new javax.xml.namespace.QName(
                                    "", "goodsDetails"), xmlWriter);
                        } else {
                            writeStartElement(null, "", "goodsDetails",
                                xmlWriter);

                            // write the nil attribute
                            writeAttribute("xsi",
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", "1", xmlWriter);
                            xmlWriter.writeEndElement();
                        }
                    }
                } else {
                    writeStartElement(null, "", "goodsDetails", xmlWriter);

                    // write the nil attribute
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "nil",
                        "1", xmlWriter);
                    xmlWriter.writeEndElement();
                }
            }

            if (localGroweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "groweight", xmlWriter);

                if (localGroweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "groweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localGroweight));
                }

                xmlWriter.writeEndElement();
            }

            if (localInplaTracker) {
                namespace = "";
                writeStartElement(null, namespace, "inpla", xmlWriter);

                if (localInpla == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "inpla cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localInpla);
                }

                xmlWriter.writeEndElement();
            }

            if (localNetweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "netweight", xmlWriter);

                if (localNetweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "netweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localNetweight));
                }

                xmlWriter.writeEndElement();
            }

            if (localTaretimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "taretime", xmlWriter);

                if (localTaretime == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "taretime cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTaretime);
                }

                xmlWriter.writeEndElement();
            }

            if (localTareweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "tareweight", xmlWriter);

                if (localTareweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "tareweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTareweight));
                }

                xmlWriter.writeEndElement();
            }

            if (localWgttimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "wgttime", xmlWriter);

                if (localWgttime == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "wgttime cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWgttime);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static HgGoodsInWeighInfoVo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                HgGoodsInWeighInfoVo object = new HgGoodsInWeighInfoVo();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"hgGoodsInWeighInfoVo".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (HgGoodsInWeighInfoVo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list18 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "consignnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "consignnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setConsignnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "contractnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "contractnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setContractnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "customername").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "customername" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCustomername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "dataid").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "dataid" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDataid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "maktx").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "maktx" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaktx(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "maktxdetail").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "maktxdetail" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaktxdetail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "maktxnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "maktxnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaktxnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "msbill").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "msbill" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMsbill(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "msunit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "msunit" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMsunit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sendpla").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sendpla" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSendpla(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "shipnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "shipnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setShipnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "tarestationname").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "tarestationname" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTarestationname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "transunitname").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "transunitname" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTransunitname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "unitdes").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "unitdes" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setUnitdes(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "vehnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "vehnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setVehnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "weighstationname").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "weighstationname" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWeighstationname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "businesstype").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "businesstype" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBusinesstype(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "goodsDetails").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            list18.add(null);
                            reader.next();
                        } else {
                            list18.add(HgGoodsDetailsVo.Factory.parse(reader));
                        }

                        //loop until we find a start element that is not part of this array
                        boolean loopDone18 = false;

                        while (!loopDone18) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone18 = true;
                            } else {
                                if (new javax.xml.namespace.QName("",
                                            "goodsDetails").equals(
                                            reader.getName())) {
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                            "nil");

                                    if ("true".equals(nillableValue) ||
                                            "1".equals(nillableValue)) {
                                        list18.add(null);
                                        reader.next();
                                    } else {
                                        list18.add(HgGoodsDetailsVo.Factory.parse(
                                                reader));
                                    }
                                } else {
                                    loopDone18 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setGoodsDetails((HgGoodsDetailsVo[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                HgGoodsDetailsVo.class, list18));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "groweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "groweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setGroweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "inpla").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "inpla" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setInpla(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "netweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "netweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNetweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "taretime").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "taretime" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTaretime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "tareweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "tareweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTareweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "wgttime").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "wgttime" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWgttime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class HgGoodsDetailsVo extends GoodsDetailsVoBase implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = hgGoodsDetailsVo
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for Recpnum
         */
        protected java.lang.String localRecpnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRecpnumTracker = false;

        public boolean isRecpnumSpecified() {
            return localRecpnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRecpnum() {
            return localRecpnum;
        }

        /**
         * Auto generated setter method
         * @param param Recpnum
         */
        public void setRecpnum(java.lang.String param) {
            localRecpnumTracker = param != null;

            this.localRecpnum = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://service.ws.hg.wuliu.tietie.com/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":hgGoodsDetailsVo", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "hgGoodsDetailsVo", xmlWriter);
            }

            if (localAddressTracker) {
                namespace = "";
                writeStartElement(null, namespace, "address", xmlWriter);

                if (localAddress == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "address cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localAddress);
                }

                xmlWriter.writeEndElement();
            }

            if (localBatchTracker) {
                namespace = "";
                writeStartElement(null, namespace, "batch", xmlWriter);

                if (localBatch == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "batch cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localBatch);
                }

                xmlWriter.writeEndElement();
            }

            if (localContractonTracker) {
                namespace = "";
                writeStartElement(null, namespace, "contracton", xmlWriter);

                if (localContracton == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "contracton cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localContracton);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaterielnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "materielnum", xmlWriter);

                if (localMaterielnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "materielnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaterielnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localNamematerialsTracker) {
                namespace = "";
                writeStartElement(null, namespace, "namematerials", xmlWriter);

                if (localNamematerials == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "namematerials cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localNamematerials);
                }

                xmlWriter.writeEndElement();
            }

            if (localOrdernumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "ordernum", xmlWriter);

                if (localOrdernum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "ordernum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localOrdernum);
                }

                xmlWriter.writeEndElement();
            }

            if (localQuantityTracker) {
                namespace = "";
                writeStartElement(null, namespace, "quantity", xmlWriter);

                if (localQuantity == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "quantity cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localQuantity);
                }

                xmlWriter.writeEndElement();
            }

            if (localRatiweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "ratiweight", xmlWriter);

                if (localRatiweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "ratiweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRatiweight);
                }

                xmlWriter.writeEndElement();
            }

            if (localRealweightTracker) {
                namespace = "";
                writeStartElement(null, namespace, "realweight", xmlWriter);

                if (localRealweight == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "realweight cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRealweight);
                }

                xmlWriter.writeEndElement();
            }

            if (localStandardTracker) {
                namespace = "";
                writeStartElement(null, namespace, "standard", xmlWriter);

                if (localStandard == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "standard cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStandard);
                }

                xmlWriter.writeEndElement();
            }

            if (localUnitTracker) {
                namespace = "";
                writeStartElement(null, namespace, "unit", xmlWriter);

                if (localUnit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "unit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localUnit);
                }

                xmlWriter.writeEndElement();
            }

            if (localWarehousenameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "warehousename", xmlWriter);

                if (localWarehousename == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "warehousename cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWarehousename);
                }

                xmlWriter.writeEndElement();
            }

            if (localRecpnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "recpnum", xmlWriter);

                if (localRecpnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "recpnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRecpnum);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static HgGoodsDetailsVo parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                HgGoodsDetailsVo object = new HgGoodsDetailsVo();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"hgGoodsDetailsVo".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (HgGoodsDetailsVo) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "address").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "address" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "batch").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "batch" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setBatch(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "contracton").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "contracton" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setContracton(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "materielnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "materielnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaterielnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "namematerials").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "namematerials" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setNamematerials(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "ordernum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ordernum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setOrdernum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "quantity").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "quantity" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setQuantity(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "ratiweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ratiweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRatiweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "realweight").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "realweight" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRealweight(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "standard").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "standard" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStandard(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "unit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "unit" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setUnit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "warehousename").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "warehousename" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWarehousename(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "recpnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "recpnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRecpnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class WebserviceHeader implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = webserviceHeader
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for Account
         */
        protected java.lang.String localAccount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localAccountTracker = false;

        /**
         * field for DataSource
         */
        protected java.lang.String localDataSource;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDataSourceTracker = false;

        /**
         * field for DocumentVersionNumber
         */
        protected java.lang.String localDocumentVersionNumber;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDocumentVersionNumberTracker = false;

        /**
         * field for MessageSendingDateTime
         */
        protected java.lang.String localMessageSendingDateTime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMessageSendingDateTimeTracker = false;

        /**
         * field for Pwd
         */
        protected java.lang.String localPwd;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localPwdTracker = false;

        public boolean isAccountSpecified() {
            return localAccountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getAccount() {
            return localAccount;
        }

        /**
         * Auto generated setter method
         * @param param Account
         */
        public void setAccount(java.lang.String param) {
            localAccountTracker = param != null;

            this.localAccount = param;
        }

        public boolean isDataSourceSpecified() {
            return localDataSourceTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDataSource() {
            return localDataSource;
        }

        /**
         * Auto generated setter method
         * @param param DataSource
         */
        public void setDataSource(java.lang.String param) {
            localDataSourceTracker = param != null;

            this.localDataSource = param;
        }

        public boolean isDocumentVersionNumberSpecified() {
            return localDocumentVersionNumberTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDocumentVersionNumber() {
            return localDocumentVersionNumber;
        }

        /**
         * Auto generated setter method
         * @param param DocumentVersionNumber
         */
        public void setDocumentVersionNumber(java.lang.String param) {
            localDocumentVersionNumberTracker = param != null;

            this.localDocumentVersionNumber = param;
        }

        public boolean isMessageSendingDateTimeSpecified() {
            return localMessageSendingDateTimeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMessageSendingDateTime() {
            return localMessageSendingDateTime;
        }

        /**
         * Auto generated setter method
         * @param param MessageSendingDateTime
         */
        public void setMessageSendingDateTime(java.lang.String param) {
            localMessageSendingDateTimeTracker = param != null;

            this.localMessageSendingDateTime = param;
        }

        public boolean isPwdSpecified() {
            return localPwdTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getPwd() {
            return localPwd;
        }

        /**
         * Auto generated setter method
         * @param param Pwd
         */
        public void setPwd(java.lang.String param) {
            localPwdTracker = param != null;

            this.localPwd = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://service.ws.hg.wuliu.tietie.com/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":webserviceHeader", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "webserviceHeader", xmlWriter);
                }
            }

            if (localAccountTracker) {
                namespace = "";
                writeStartElement(null, namespace, "account", xmlWriter);

                if (localAccount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "account cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localAccount);
                }

                xmlWriter.writeEndElement();
            }

            if (localDataSourceTracker) {
                namespace = "";
                writeStartElement(null, namespace, "dataSource", xmlWriter);

                if (localDataSource == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "dataSource cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDataSource);
                }

                xmlWriter.writeEndElement();
            }

            if (localDocumentVersionNumberTracker) {
                namespace = "";
                writeStartElement(null, namespace, "documentVersionNumber",
                    xmlWriter);

                if (localDocumentVersionNumber == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "documentVersionNumber cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDocumentVersionNumber);
                }

                xmlWriter.writeEndElement();
            }

            if (localMessageSendingDateTimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "messageSendingDateTime",
                    xmlWriter);

                if (localMessageSendingDateTime == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "messageSendingDateTime cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMessageSendingDateTime);
                }

                xmlWriter.writeEndElement();
            }

            if (localPwdTracker) {
                namespace = "";
                writeStartElement(null, namespace, "pwd", xmlWriter);

                if (localPwd == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "pwd cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localPwd);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static WebserviceHeader parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                WebserviceHeader object = new WebserviceHeader();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"webserviceHeader".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (WebserviceHeader) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "account").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "account" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setAccount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "dataSource").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "dataSource" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDataSource(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "documentVersionNumber").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "documentVersionNumber" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDocumentVersionNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "messageSendingDateTime").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "messageSendingDateTime" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMessageSendingDateTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "pwd").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "pwd" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setPwd(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ExtensionMapper {
        public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "hgGoodsDetailsVo".equals(typeName)) {
                return HgGoodsDetailsVo.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "addBuyMetricInfoResponse".equals(typeName)) {
                return AddBuyMetricInfoResponse.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "hgGoodsInWeighInfoVo".equals(typeName)) {
                return HgGoodsInWeighInfoVo.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "webserviceHeader".equals(typeName)) {
                return WebserviceHeader.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "goodsInWeighInfoVoBase".equals(typeName)) {
                return GoodsInWeighInfoVoBase.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "responseResult".equals(typeName)) {
                return ResponseResult.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "goodsDetailsVoBase".equals(typeName)) {
                return GoodsDetailsVoBase.Factory.parse(reader);
            }

            if ("http://service.ws.hg.wuliu.tietie.com/".equals(namespaceURI) &&
                    "addBuyMetricInfo".equals(typeName)) {
                return AddBuyMetricInfo.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class GoodsInWeighInfoVoBase implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = goodsInWeighInfoVoBase
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for Consignnum
         */
        protected java.lang.String localConsignnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localConsignnumTracker = false;

        /**
         * field for Contractnum
         */
        protected java.lang.String localContractnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localContractnumTracker = false;

        /**
         * field for Customername
         */
        protected java.lang.String localCustomername;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCustomernameTracker = false;

        /**
         * field for Dataid
         */
        protected java.lang.String localDataid;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localDataidTracker = false;

        /**
         * field for Maktx
         */
        protected java.lang.String localMaktx;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMaktxTracker = false;

        /**
         * field for Maktxdetail
         */
        protected java.lang.String localMaktxdetail;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMaktxdetailTracker = false;

        /**
         * field for Maktxnum
         */
        protected java.lang.String localMaktxnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMaktxnumTracker = false;

        /**
         * field for Msbill
         */
        protected java.lang.String localMsbill;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMsbillTracker = false;

        /**
         * field for Msunit
         */
        protected java.lang.String localMsunit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localMsunitTracker = false;

        /**
         * field for Sendpla
         */
        protected java.lang.String localSendpla;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSendplaTracker = false;

        /**
         * field for Shipnum
         */
        protected java.lang.String localShipnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localShipnumTracker = false;

        /**
         * field for Tarestationname
         */
        protected java.lang.String localTarestationname;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTarestationnameTracker = false;

        /**
         * field for Transunitname
         */
        protected java.lang.String localTransunitname;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTransunitnameTracker = false;

        /**
         * field for Unitdes
         */
        protected java.lang.String localUnitdes;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localUnitdesTracker = false;

        /**
         * field for Vehnum
         */
        protected java.lang.String localVehnum;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localVehnumTracker = false;

        /**
         * field for Weighstationname
         */
        protected java.lang.String localWeighstationname;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localWeighstationnameTracker = false;

        public boolean isConsignnumSpecified() {
            return localConsignnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getConsignnum() {
            return localConsignnum;
        }

        /**
         * Auto generated setter method
         * @param param Consignnum
         */
        public void setConsignnum(java.lang.String param) {
            localConsignnumTracker = param != null;

            this.localConsignnum = param;
        }

        public boolean isContractnumSpecified() {
            return localContractnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getContractnum() {
            return localContractnum;
        }

        /**
         * Auto generated setter method
         * @param param Contractnum
         */
        public void setContractnum(java.lang.String param) {
            localContractnumTracker = param != null;

            this.localContractnum = param;
        }

        public boolean isCustomernameSpecified() {
            return localCustomernameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCustomername() {
            return localCustomername;
        }

        /**
         * Auto generated setter method
         * @param param Customername
         */
        public void setCustomername(java.lang.String param) {
            localCustomernameTracker = param != null;

            this.localCustomername = param;
        }

        public boolean isDataidSpecified() {
            return localDataidTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDataid() {
            return localDataid;
        }

        /**
         * Auto generated setter method
         * @param param Dataid
         */
        public void setDataid(java.lang.String param) {
            localDataidTracker = param != null;

            this.localDataid = param;
        }

        public boolean isMaktxSpecified() {
            return localMaktxTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMaktx() {
            return localMaktx;
        }

        /**
         * Auto generated setter method
         * @param param Maktx
         */
        public void setMaktx(java.lang.String param) {
            localMaktxTracker = param != null;

            this.localMaktx = param;
        }

        public boolean isMaktxdetailSpecified() {
            return localMaktxdetailTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMaktxdetail() {
            return localMaktxdetail;
        }

        /**
         * Auto generated setter method
         * @param param Maktxdetail
         */
        public void setMaktxdetail(java.lang.String param) {
            localMaktxdetailTracker = param != null;

            this.localMaktxdetail = param;
        }

        public boolean isMaktxnumSpecified() {
            return localMaktxnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMaktxnum() {
            return localMaktxnum;
        }

        /**
         * Auto generated setter method
         * @param param Maktxnum
         */
        public void setMaktxnum(java.lang.String param) {
            localMaktxnumTracker = param != null;

            this.localMaktxnum = param;
        }

        public boolean isMsbillSpecified() {
            return localMsbillTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMsbill() {
            return localMsbill;
        }

        /**
         * Auto generated setter method
         * @param param Msbill
         */
        public void setMsbill(java.lang.String param) {
            localMsbillTracker = param != null;

            this.localMsbill = param;
        }

        public boolean isMsunitSpecified() {
            return localMsunitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getMsunit() {
            return localMsunit;
        }

        /**
         * Auto generated setter method
         * @param param Msunit
         */
        public void setMsunit(java.lang.String param) {
            localMsunitTracker = param != null;

            this.localMsunit = param;
        }

        public boolean isSendplaSpecified() {
            return localSendplaTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSendpla() {
            return localSendpla;
        }

        /**
         * Auto generated setter method
         * @param param Sendpla
         */
        public void setSendpla(java.lang.String param) {
            localSendplaTracker = param != null;

            this.localSendpla = param;
        }

        public boolean isShipnumSpecified() {
            return localShipnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getShipnum() {
            return localShipnum;
        }

        /**
         * Auto generated setter method
         * @param param Shipnum
         */
        public void setShipnum(java.lang.String param) {
            localShipnumTracker = param != null;

            this.localShipnum = param;
        }

        public boolean isTarestationnameSpecified() {
            return localTarestationnameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTarestationname() {
            return localTarestationname;
        }

        /**
         * Auto generated setter method
         * @param param Tarestationname
         */
        public void setTarestationname(java.lang.String param) {
            localTarestationnameTracker = param != null;

            this.localTarestationname = param;
        }

        public boolean isTransunitnameSpecified() {
            return localTransunitnameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTransunitname() {
            return localTransunitname;
        }

        /**
         * Auto generated setter method
         * @param param Transunitname
         */
        public void setTransunitname(java.lang.String param) {
            localTransunitnameTracker = param != null;

            this.localTransunitname = param;
        }

        public boolean isUnitdesSpecified() {
            return localUnitdesTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getUnitdes() {
            return localUnitdes;
        }

        /**
         * Auto generated setter method
         * @param param Unitdes
         */
        public void setUnitdes(java.lang.String param) {
            localUnitdesTracker = param != null;

            this.localUnitdes = param;
        }

        public boolean isVehnumSpecified() {
            return localVehnumTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getVehnum() {
            return localVehnum;
        }

        /**
         * Auto generated setter method
         * @param param Vehnum
         */
        public void setVehnum(java.lang.String param) {
            localVehnumTracker = param != null;

            this.localVehnum = param;
        }

        public boolean isWeighstationnameSpecified() {
            return localWeighstationnameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getWeighstationname() {
            return localWeighstationname;
        }

        /**
         * Auto generated setter method
         * @param param Weighstationname
         */
        public void setWeighstationname(java.lang.String param) {
            localWeighstationnameTracker = param != null;

            this.localWeighstationname = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://service.ws.hg.wuliu.tietie.com/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":goodsInWeighInfoVoBase", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "goodsInWeighInfoVoBase", xmlWriter);
                }
            }

            if (localConsignnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "consignnum", xmlWriter);

                if (localConsignnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "consignnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localConsignnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localContractnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "contractnum", xmlWriter);

                if (localContractnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "contractnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localContractnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localCustomernameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "customername", xmlWriter);

                if (localCustomername == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "customername cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCustomername);
                }

                xmlWriter.writeEndElement();
            }

            if (localDataidTracker) {
                namespace = "";
                writeStartElement(null, namespace, "dataid", xmlWriter);

                if (localDataid == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "dataid cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localDataid);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaktxTracker) {
                namespace = "";
                writeStartElement(null, namespace, "maktx", xmlWriter);

                if (localMaktx == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "maktx cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaktx);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaktxdetailTracker) {
                namespace = "";
                writeStartElement(null, namespace, "maktxdetail", xmlWriter);

                if (localMaktxdetail == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "maktxdetail cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaktxdetail);
                }

                xmlWriter.writeEndElement();
            }

            if (localMaktxnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "maktxnum", xmlWriter);

                if (localMaktxnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "maktxnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMaktxnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localMsbillTracker) {
                namespace = "";
                writeStartElement(null, namespace, "msbill", xmlWriter);

                if (localMsbill == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "msbill cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMsbill);
                }

                xmlWriter.writeEndElement();
            }

            if (localMsunitTracker) {
                namespace = "";
                writeStartElement(null, namespace, "msunit", xmlWriter);

                if (localMsunit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "msunit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localMsunit);
                }

                xmlWriter.writeEndElement();
            }

            if (localSendplaTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sendpla", xmlWriter);

                if (localSendpla == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sendpla cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSendpla);
                }

                xmlWriter.writeEndElement();
            }

            if (localShipnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "shipnum", xmlWriter);

                if (localShipnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "shipnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localShipnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localTarestationnameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "tarestationname", xmlWriter);

                if (localTarestationname == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "tarestationname cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTarestationname);
                }

                xmlWriter.writeEndElement();
            }

            if (localTransunitnameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "transunitname", xmlWriter);

                if (localTransunitname == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "transunitname cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTransunitname);
                }

                xmlWriter.writeEndElement();
            }

            if (localUnitdesTracker) {
                namespace = "";
                writeStartElement(null, namespace, "unitdes", xmlWriter);

                if (localUnitdes == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "unitdes cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localUnitdes);
                }

                xmlWriter.writeEndElement();
            }

            if (localVehnumTracker) {
                namespace = "";
                writeStartElement(null, namespace, "vehnum", xmlWriter);

                if (localVehnum == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "vehnum cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localVehnum);
                }

                xmlWriter.writeEndElement();
            }

            if (localWeighstationnameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "weighstationname", xmlWriter);

                if (localWeighstationname == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "weighstationname cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localWeighstationname);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GoodsInWeighInfoVoBase parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GoodsInWeighInfoVoBase object = new GoodsInWeighInfoVoBase();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"goodsInWeighInfoVoBase".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GoodsInWeighInfoVoBase) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "consignnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "consignnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setConsignnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "contractnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "contractnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setContractnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "customername").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "customername" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCustomername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "dataid").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "dataid" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDataid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "maktx").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "maktx" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaktx(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "maktxdetail").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "maktxdetail" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaktxdetail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "maktxnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "maktxnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMaktxnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "msbill").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "msbill" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMsbill(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "msunit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "msunit" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setMsunit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sendpla").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sendpla" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSendpla(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "shipnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "shipnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setShipnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "tarestationname").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "tarestationname" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTarestationname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "transunitname").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "transunitname" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTransunitname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "unitdes").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "unitdes" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setUnitdes(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "vehnum").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "vehnum" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setVehnum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "weighstationname").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "weighstationname" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setWeighstationname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ResponseResult implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = responseResult
           Namespace URI = http://service.ws.hg.wuliu.tietie.com/
           Namespace Prefix = ns1
         */

        /**
         * field for RspCode
         */
        protected java.lang.String localRspCode;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRspCodeTracker = false;

        /**
         * field for RspData
         */
        protected java.lang.Object localRspData;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRspDataTracker = false;

        /**
         * field for RspMsg
         */
        protected java.lang.String localRspMsg;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRspMsgTracker = false;

        /**
         * field for RspTime
         */
        protected java.lang.String localRspTime;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRspTimeTracker = false;

        /**
         * field for RspType
         */
        protected java.lang.String localRspType;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localRspTypeTracker = false;

        public boolean isRspCodeSpecified() {
            return localRspCodeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRspCode() {
            return localRspCode;
        }

        /**
         * Auto generated setter method
         * @param param RspCode
         */
        public void setRspCode(java.lang.String param) {
            localRspCodeTracker = param != null;

            this.localRspCode = param;
        }

        public boolean isRspDataSpecified() {
            return localRspDataTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.Object
         */
        public java.lang.Object getRspData() {
            return localRspData;
        }

        /**
         * Auto generated setter method
         * @param param RspData
         */
        public void setRspData(java.lang.Object param) {
            localRspDataTracker = param != null;

            this.localRspData = param;
        }

        public boolean isRspMsgSpecified() {
            return localRspMsgTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRspMsg() {
            return localRspMsg;
        }

        /**
         * Auto generated setter method
         * @param param RspMsg
         */
        public void setRspMsg(java.lang.String param) {
            localRspMsgTracker = param != null;

            this.localRspMsg = param;
        }

        public boolean isRspTimeSpecified() {
            return localRspTimeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRspTime() {
            return localRspTime;
        }

        /**
         * Auto generated setter method
         * @param param RspTime
         */
        public void setRspTime(java.lang.String param) {
            localRspTimeTracker = param != null;

            this.localRspTime = param;
        }

        public boolean isRspTypeSpecified() {
            return localRspTypeTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getRspType() {
            return localRspType;
        }

        /**
         * Auto generated setter method
         * @param param RspType
         */
        public void setRspType(java.lang.String param) {
            localRspTypeTracker = param != null;

            this.localRspType = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://service.ws.hg.wuliu.tietie.com/");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":responseResult", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "responseResult", xmlWriter);
                }
            }

            if (localRspCodeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "rspCode", xmlWriter);

                if (localRspCode == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rspCode cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRspCode);
                }

                xmlWriter.writeEndElement();
            }

            if (localRspDataTracker) {
                if (localRspData != null) {
                    if (localRspData instanceof org.apache.axis2.databinding.ADBBean) {
                        ((org.apache.axis2.databinding.ADBBean) localRspData).serialize(new javax.xml.namespace.QName(
                                "", "rspData"), xmlWriter, true);
                    } else {
                        writeStartElement(null, "", "rspData", xmlWriter);
                        org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localRspData,
                            xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "rspData cannot be null!!");
                }
            }

            if (localRspMsgTracker) {
                namespace = "";
                writeStartElement(null, namespace, "rspMsg", xmlWriter);

                if (localRspMsg == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rspMsg cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRspMsg);
                }

                xmlWriter.writeEndElement();
            }

            if (localRspTimeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "rspTime", xmlWriter);

                if (localRspTime == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rspTime cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRspTime);
                }

                xmlWriter.writeEndElement();
            }

            if (localRspTypeTracker) {
                namespace = "";
                writeStartElement(null, namespace, "rspType", xmlWriter);

                if (localRspType == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "rspType cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localRspType);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ResponseResult parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                ResponseResult object = new ResponseResult();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"responseResult".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (ResponseResult) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "rspCode").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rspCode" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRspCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "rspData").equals(
                                reader.getName())) {
                        object.setRspData(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(
                                reader, ExtensionMapper.class));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "rspMsg").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rspMsg" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRspMsg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "rspTime").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rspTime" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRspTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "rspType").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "rspType" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setRspType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class AddBuyMetricInfoResponseE implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://service.ws.hg.wuliu.tietie.com/",
                "addBuyMetricInfoResponse", "ns1");

        /**
         * field for AddBuyMetricInfoResponse
         */
        protected AddBuyMetricInfoResponse localAddBuyMetricInfoResponse;

        /**
         * Auto generated getter method
         * @return AddBuyMetricInfoResponse
         */
        public AddBuyMetricInfoResponse getAddBuyMetricInfoResponse() {
            return localAddBuyMetricInfoResponse;
        }

        /**
         * Auto generated setter method
         * @param param AddBuyMetricInfoResponse
         */
        public void setAddBuyMetricInfoResponse(AddBuyMetricInfoResponse param) {
            this.localAddBuyMetricInfoResponse = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            //We can safely assume an element has only one type associated with it
            if (localAddBuyMetricInfoResponse == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "addBuyMetricInfoResponse cannot be null!");
            }

            localAddBuyMetricInfoResponse.serialize(MY_QNAME, xmlWriter);
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static AddBuyMetricInfoResponseE parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                AddBuyMetricInfoResponseE object = new AddBuyMetricInfoResponseE();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if (reader.isStartElement() &&
                                    new javax.xml.namespace.QName(
                                        "http://service.ws.hg.wuliu.tietie.com/",
                                        "addBuyMetricInfoResponse").equals(
                                        reader.getName())) {
                                object.setAddBuyMetricInfoResponse(AddBuyMetricInfoResponse.Factory.parse(
                                        reader));
                            } // End of if for expected property start element

                            else {
                                // 3 - A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                    "Unexpected subelement " +
                                    reader.getName());
                            }
                        } else {
                            reader.next();
                        }
                    } // end of while loop
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class AddBuyMetricInfoE implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://service.ws.hg.wuliu.tietie.com/",
                "addBuyMetricInfo", "ns1");

        /**
         * field for AddBuyMetricInfo
         */
        protected AddBuyMetricInfo localAddBuyMetricInfo;

        /**
         * Auto generated getter method
         * @return AddBuyMetricInfo
         */
        public AddBuyMetricInfo getAddBuyMetricInfo() {
            return localAddBuyMetricInfo;
        }

        /**
         * Auto generated setter method
         * @param param AddBuyMetricInfo
         */
        public void setAddBuyMetricInfo(AddBuyMetricInfo param) {
            this.localAddBuyMetricInfo = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            //We can safely assume an element has only one type associated with it
            if (localAddBuyMetricInfo == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "addBuyMetricInfo cannot be null!");
            }

            localAddBuyMetricInfo.serialize(MY_QNAME, xmlWriter);
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals("http://service.ws.hg.wuliu.tietie.com/")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                    attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static AddBuyMetricInfoE parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                AddBuyMetricInfoE object = new AddBuyMetricInfoE();

                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    currentQName = reader.getName();

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if (reader.isStartElement() &&
                                    new javax.xml.namespace.QName(
                                        "http://service.ws.hg.wuliu.tietie.com/",
                                        "addBuyMetricInfo").equals(
                                        reader.getName())) {
                                object.setAddBuyMetricInfo(AddBuyMetricInfo.Factory.parse(
                                        reader));
                            } // End of if for expected property start element

                            else {
                                // 3 - A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(
                                    "Unexpected subelement " +
                                    reader.getName());
                            }
                        } else {
                            reader.next();
                        }
                    } // end of while loop
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }
}
