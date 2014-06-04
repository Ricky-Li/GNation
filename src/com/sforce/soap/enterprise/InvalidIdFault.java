
/**
 * InvalidIdFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class InvalidIdFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141825L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.InvalidIdFaultE faultMessage;

    
        public InvalidIdFault() {
            super("InvalidIdFault");
        }

        public InvalidIdFault(java.lang.String s) {
           super(s);
        }

        public InvalidIdFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidIdFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.InvalidIdFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.InvalidIdFaultE getFaultMessage(){
       return faultMessage;
    }
}
    