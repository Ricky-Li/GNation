
/**
 * MetadataServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.sforce.soap._2006._04.metadata;

    /**
     *  MetadataServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MetadataServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MetadataServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MetadataServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.UpdateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delete method
            * override this method for handling normal response from delete operation
            */
           public void receiveResultdelete(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.DeleteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delete operation
           */
            public void receiveErrordelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeMetadata method
            * override this method for handling normal response from describeMetadata operation
            */
           public void receiveResultdescribeMetadata(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.DescribeMetadataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeMetadata operation
           */
            public void receiveErrordescribeMetadata(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deploy method
            * override this method for handling normal response from deploy operation
            */
           public void receiveResultdeploy(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.DeployResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deploy operation
           */
            public void receiveErrordeploy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkStatus method
            * override this method for handling normal response from checkStatus operation
            */
           public void receiveResultcheckStatus(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.CheckStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkStatus operation
           */
            public void receiveErrorcheckStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieve method
            * override this method for handling normal response from retrieve operation
            */
           public void receiveResultretrieve(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.RetrieveResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieve operation
           */
            public void receiveErrorretrieve(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkRetrieveStatus method
            * override this method for handling normal response from checkRetrieveStatus operation
            */
           public void receiveResultcheckRetrieveStatus(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.CheckRetrieveStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkRetrieveStatus operation
           */
            public void receiveErrorcheckRetrieveStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for listMetadata method
            * override this method for handling normal response from listMetadata operation
            */
           public void receiveResultlistMetadata(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.ListMetadataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from listMetadata operation
           */
            public void receiveErrorlistMetadata(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for create method
            * override this method for handling normal response from create operation
            */
           public void receiveResultcreate(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.CreateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from create operation
           */
            public void receiveErrorcreate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkDeployStatus method
            * override this method for handling normal response from checkDeployStatus operation
            */
           public void receiveResultcheckDeployStatus(
                    com.sforce.soap._2006._04.metadata.MetadataServiceStub.CheckDeployStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkDeployStatus operation
           */
            public void receiveErrorcheckDeployStatus(java.lang.Exception e) {
            }
                


    }
    