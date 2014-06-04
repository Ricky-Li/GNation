
/**
 * MalformedQueryFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class MalformedQueryFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141799L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.MalformedQueryFaultE faultMessage;

    
        public MalformedQueryFault() {
            super("MalformedQueryFault");
        }

        public MalformedQueryFault(java.lang.String s) {
           super(s);
        }

        public MalformedQueryFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MalformedQueryFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.MalformedQueryFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.MalformedQueryFaultE getFaultMessage(){
       return faultMessage;
    }
}
    