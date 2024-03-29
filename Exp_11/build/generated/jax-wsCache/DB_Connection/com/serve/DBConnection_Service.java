
package com.serve;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DB_Connection", targetNamespace = "http://Default/", wsdlLocation = "http://localhost:8080/IP_ASSN/DB_Connection?wsdl")
public class DBConnection_Service
    extends Service
{

    private final static URL DBCONNECTION_WSDL_LOCATION;
    private final static WebServiceException DBCONNECTION_EXCEPTION;
    private final static QName DBCONNECTION_QNAME = new QName("http://Default/", "DB_Connection");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/IP_ASSN/DB_Connection?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DBCONNECTION_WSDL_LOCATION = url;
        DBCONNECTION_EXCEPTION = e;
    }

    public DBConnection_Service() {
        super(__getWsdlLocation(), DBCONNECTION_QNAME);
    }

    public DBConnection_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DBCONNECTION_QNAME, features);
    }

    public DBConnection_Service(URL wsdlLocation) {
        super(wsdlLocation, DBCONNECTION_QNAME);
    }

    public DBConnection_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DBCONNECTION_QNAME, features);
    }

    public DBConnection_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DBConnection_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DBConnection
     */
    @WebEndpoint(name = "DB_ConnectionPort")
    public DBConnection getDBConnectionPort() {
        return super.getPort(new QName("http://Default/", "DB_ConnectionPort"), DBConnection.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DBConnection
     */
    @WebEndpoint(name = "DB_ConnectionPort")
    public DBConnection getDBConnectionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Default/", "DB_ConnectionPort"), DBConnection.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DBCONNECTION_EXCEPTION!= null) {
            throw DBCONNECTION_EXCEPTION;
        }
        return DBCONNECTION_WSDL_LOCATION;
    }

}
