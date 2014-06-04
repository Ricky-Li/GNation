
/**
 * InvalidNewPasswordFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class InvalidNewPasswordFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141952L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.InvalidNewPasswordFaultE faultMessage;

    
        public InvalidNewPasswordFault() {
            super("InvalidNewPasswordFault");
        }

        public InvalidNewPasswordFault(java.lang.String s) {
           super(s);
        }

        public InvalidNewPasswordFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidNewPasswordFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.InvalidNewPasswordFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.InvalidNewPasswordFaultE getFaultMessage(){
       return faultMessage;
    }
}
    