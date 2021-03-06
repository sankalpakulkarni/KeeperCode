
package org.mdr.wsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RepositoryAuthenticationException", targetNamespace = "http://mdr.org/wsdl")
public class RepositoryAuthenticationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RepositoryAuthenticationException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RepositoryAuthenticationException_Exception(String message, RepositoryAuthenticationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RepositoryAuthenticationException_Exception(String message, RepositoryAuthenticationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.mdr.wsdl.RepositoryAuthenticationException
     */
    public RepositoryAuthenticationException getFaultInfo() {
        return faultInfo;
    }

}
