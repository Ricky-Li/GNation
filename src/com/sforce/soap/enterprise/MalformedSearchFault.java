
/**
 * MalformedSearchFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class MalformedSearchFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141845L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.MalformedSearchFaultE faultMessage;

    
        public MalformedSearchFault() {
            super("MalformedSearchFault");
        }

        public MalformedSearchFault(java.lang.String s) {
           super(s);
        }

        public MalformedSearchFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MalformedSearchFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.MalformedSearchFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.MalformedSearchFaultE getFaultMessage(){
       return faultMessage;
    }
}
    