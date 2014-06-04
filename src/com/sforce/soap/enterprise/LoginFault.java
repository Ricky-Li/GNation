
/**
 * LoginFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class LoginFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141897L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.LoginFaultE faultMessage;

    
        public LoginFault() {
            super("LoginFault");
        }

        public LoginFault(java.lang.String s) {
           super(s);
        }

        public LoginFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoginFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.LoginFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.LoginFaultE getFaultMessage(){
       return faultMessage;
    }
}
    