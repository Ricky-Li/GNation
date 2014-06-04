
/**
 * InvalidSObjectFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.sforce.soap.enterprise;

public class InvalidSObjectFault extends java.lang.Exception{

    private static final long serialVersionUID = 1347281141776L;
    
    private com.sforce.soap.enterprise.SforceServiceStub.InvalidSObjectFaultE faultMessage;

    
        public InvalidSObjectFault() {
            super("InvalidSObjectFault");
        }

        public InvalidSObjectFault(java.lang.String s) {
           super(s);
        }

        public InvalidSObjectFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidSObjectFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.sforce.soap.enterprise.SforceServiceStub.InvalidSObjectFaultE msg){
       faultMessage = msg;
    }
    
    public com.sforce.soap.enterprise.SforceServiceStub.InvalidSObjectFaultE getFaultMessage(){
       return faultMessage;
    }
}
    