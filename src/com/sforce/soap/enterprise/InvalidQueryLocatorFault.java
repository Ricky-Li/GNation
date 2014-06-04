
/**
 * InvalidQueryLocatorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class InvalidQueryLocatorFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141935L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.InvalidQueryLocatorFaultE faultMessage;

    
        public InvalidQueryLocatorFault() {
            super("InvalidQueryLocatorFault");
        }

        public InvalidQueryLocatorFault(java.lang.String s) {
           super(s);
        }

        public InvalidQueryLocatorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidQueryLocatorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.InvalidQueryLocatorFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.InvalidQueryLocatorFaultE getFaultMessage(){
       return faultMessage;
    }
}
    