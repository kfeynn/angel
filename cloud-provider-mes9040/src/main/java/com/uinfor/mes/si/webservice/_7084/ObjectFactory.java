
package com.uinfor.mes.si.webservice._7084;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uinfor.mes.si.webservice._7084 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebServiceResult_QNAME = new QName("http://webservice.si.mes.uinfor.com:7084/", "WebServiceResult");
    private final static QName _Execute_QNAME = new QName("http://webservice.si.mes.uinfor.com:7084/", "execute");
    private final static QName _ExecuteResponse_QNAME = new QName("http://webservice.si.mes.uinfor.com:7084/", "executeResponse");
    private final static QName _WebServiceResultFlag_QNAME = new QName("", "flag");
    private final static QName _WebServiceResultMsg_QNAME = new QName("", "msg");
    private final static QName _WebServiceResultErrorCode_QNAME = new QName("", "errorCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uinfor.mes.si.webservice._7084
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceResult }
     * 
     */
    public WebServiceResult createWebServiceResult() {
        return new WebServiceResult();
    }

    /**
     * Create an instance of {@link WebServiceResult.Data }
     * 
     */
    public WebServiceResult.Data createWebServiceResultData() {
        return new WebServiceResult.Data();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link WebServiceResult.Data.Entry }
     * 
     */
    public WebServiceResult.Data.Entry createWebServiceResultDataEntry() {
        return new WebServiceResult.Data.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.si.mes.uinfor.com:7084/", name = "WebServiceResult")
    public JAXBElement<WebServiceResult> createWebServiceResult(WebServiceResult value) {
        return new JAXBElement<WebServiceResult>(_WebServiceResult_QNAME, WebServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.si.mes.uinfor.com:7084/", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.si.mes.uinfor.com:7084/", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "flag", scope = WebServiceResult.class)
    public JAXBElement<Boolean> createWebServiceResultFlag(Boolean value) {
        return new JAXBElement<Boolean>(_WebServiceResultFlag_QNAME, Boolean.class, WebServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "msg", scope = WebServiceResult.class)
    public JAXBElement<String> createWebServiceResultMsg(String value) {
        return new JAXBElement<String>(_WebServiceResultMsg_QNAME, String.class, WebServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorCode", scope = WebServiceResult.class)
    public JAXBElement<Integer> createWebServiceResultErrorCode(Integer value) {
        return new JAXBElement<Integer>(_WebServiceResultErrorCode_QNAME, Integer.class, WebServiceResult.class, value);
    }

}
