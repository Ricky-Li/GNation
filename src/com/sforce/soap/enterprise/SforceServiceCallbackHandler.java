
/**
 * SforceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.sforce.soap.enterprise;

    /**
     *  SforceServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SforceServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SforceServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SforceServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for setPassword method
            * override this method for handling normal response from setPassword operation
            */
           public void receiveResultsetPassword(
                    com.sforce.soap.enterprise.SforceServiceStub.SetPasswordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setPassword operation
           */
            public void receiveErrorsetPassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeDataCategoryGroupStructures method
            * override this method for handling normal response from describeDataCategoryGroupStructures operation
            */
           public void receiveResultdescribeDataCategoryGroupStructures(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeDataCategoryGroupStructuresResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeDataCategoryGroupStructures operation
           */
            public void receiveErrordescribeDataCategoryGroupStructures(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeDataCategoryGroups method
            * override this method for handling normal response from describeDataCategoryGroups operation
            */
           public void receiveResultdescribeDataCategoryGroups(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeDataCategoryGroupsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeDataCategoryGroups operation
           */
            public void receiveErrordescribeDataCategoryGroups(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDeleted method
            * override this method for handling normal response from getDeleted operation
            */
           public void receiveResultgetDeleted(
                    com.sforce.soap.enterprise.SforceServiceStub.GetDeletedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDeleted operation
           */
            public void receiveErrorgetDeleted(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for process method
            * override this method for handling normal response from process operation
            */
           public void receiveResultprocess(
                    com.sforce.soap.enterprise.SforceServiceStub.ProcessResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from process operation
           */
            public void receiveErrorprocess(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for query method
            * override this method for handling normal response from query operation
            */
           public void receiveResultquery(
                    com.sforce.soap.enterprise.SforceServiceStub.QueryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from query operation
           */
            public void receiveErrorquery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    com.sforce.soap.enterprise.SforceServiceStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for create method
            * override this method for handling normal response from create operation
            */
           public void receiveResultcreate(
                    com.sforce.soap.enterprise.SforceServiceStub.CreateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from create operation
           */
            public void receiveErrorcreate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieve method
            * override this method for handling normal response from retrieve operation
            */
           public void receiveResultretrieve(
                    com.sforce.soap.enterprise.SforceServiceStub.RetrieveResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieve operation
           */
            public void receiveErrorretrieve(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUpdated method
            * override this method for handling normal response from getUpdated operation
            */
           public void receiveResultgetUpdated(
                    com.sforce.soap.enterprise.SforceServiceStub.GetUpdatedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUpdated operation
           */
            public void receiveErrorgetUpdated(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for emptyRecycleBin method
            * override this method for handling normal response from emptyRecycleBin operation
            */
           public void receiveResultemptyRecycleBin(
                    com.sforce.soap.enterprise.SforceServiceStub.EmptyRecycleBinResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from emptyRecycleBin operation
           */
            public void receiveErroremptyRecycleBin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for undelete method
            * override this method for handling normal response from undelete operation
            */
           public void receiveResultundelete(
                    com.sforce.soap.enterprise.SforceServiceStub.UndeleteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from undelete operation
           */
            public void receiveErrorundelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeTabs method
            * override this method for handling normal response from describeTabs operation
            */
           public void receiveResultdescribeTabs(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeTabsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeTabs operation
           */
            public void receiveErrordescribeTabs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeLayout method
            * override this method for handling normal response from describeLayout operation
            */
           public void receiveResultdescribeLayout(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeLayoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeLayout operation
           */
            public void receiveErrordescribeLayout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryAll method
            * override this method for handling normal response from queryAll operation
            */
           public void receiveResultqueryAll(
                    com.sforce.soap.enterprise.SforceServiceStub.QueryAllResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryAll operation
           */
            public void receiveErrorqueryAll(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delete method
            * override this method for handling normal response from delete operation
            */
           public void receiveResultdelete(
                    com.sforce.soap.enterprise.SforceServiceStub.DeleteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delete operation
           */
            public void receiveErrordelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    com.sforce.soap.enterprise.SforceServiceStub.UpdateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    com.sforce.soap.enterprise.SforceServiceStub.LogoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for resetPassword method
            * override this method for handling normal response from resetPassword operation
            */
           public void receiveResultresetPassword(
                    com.sforce.soap.enterprise.SforceServiceStub.ResetPasswordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from resetPassword operation
           */
            public void receiveErrorresetPassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for upsert method
            * override this method for handling normal response from upsert operation
            */
           public void receiveResultupsert(
                    com.sforce.soap.enterprise.SforceServiceStub.UpsertResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from upsert operation
           */
            public void receiveErrorupsert(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeSObjects method
            * override this method for handling normal response from describeSObjects operation
            */
           public void receiveResultdescribeSObjects(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeSObjectsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeSObjects operation
           */
            public void receiveErrordescribeSObjects(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeSObject method
            * override this method for handling normal response from describeSObject operation
            */
           public void receiveResultdescribeSObject(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeSObjectResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeSObject operation
           */
            public void receiveErrordescribeSObject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for convertLead method
            * override this method for handling normal response from convertLead operation
            */
           public void receiveResultconvertLead(
                    com.sforce.soap.enterprise.SforceServiceStub.ConvertLeadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from convertLead operation
           */
            public void receiveErrorconvertLead(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for invalidateSessions method
            * override this method for handling normal response from invalidateSessions operation
            */
           public void receiveResultinvalidateSessions(
                    com.sforce.soap.enterprise.SforceServiceStub.InvalidateSessionsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from invalidateSessions operation
           */
            public void receiveErrorinvalidateSessions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeSoftphoneLayout method
            * override this method for handling normal response from describeSoftphoneLayout operation
            */
           public void receiveResultdescribeSoftphoneLayout(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeSoftphoneLayoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeSoftphoneLayout operation
           */
            public void receiveErrordescribeSoftphoneLayout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryMore method
            * override this method for handling normal response from queryMore operation
            */
           public void receiveResultqueryMore(
                    com.sforce.soap.enterprise.SforceServiceStub.QueryMoreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryMore operation
           */
            public void receiveErrorqueryMore(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sendEmail method
            * override this method for handling normal response from sendEmail operation
            */
           public void receiveResultsendEmail(
                    com.sforce.soap.enterprise.SforceServiceStub.SendEmailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sendEmail operation
           */
            public void receiveErrorsendEmail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for search method
            * override this method for handling normal response from search operation
            */
           public void receiveResultsearch(
                    com.sforce.soap.enterprise.SforceServiceStub.SearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from search operation
           */
            public void receiveErrorsearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerTimestamp method
            * override this method for handling normal response from getServerTimestamp operation
            */
           public void receiveResultgetServerTimestamp(
                    com.sforce.soap.enterprise.SforceServiceStub.GetServerTimestampResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerTimestamp operation
           */
            public void receiveErrorgetServerTimestamp(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for merge method
            * override this method for handling normal response from merge operation
            */
           public void receiveResultmerge(
                    com.sforce.soap.enterprise.SforceServiceStub.MergeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from merge operation
           */
            public void receiveErrormerge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUserInfo method
            * override this method for handling normal response from getUserInfo operation
            */
           public void receiveResultgetUserInfo(
                    com.sforce.soap.enterprise.SforceServiceStub.GetUserInfoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUserInfo operation
           */
            public void receiveErrorgetUserInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describeGlobal method
            * override this method for handling normal response from describeGlobal operation
            */
           public void receiveResultdescribeGlobal(
                    com.sforce.soap.enterprise.SforceServiceStub.DescribeGlobalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describeGlobal operation
           */
            public void receiveErrordescribeGlobal(java.lang.Exception e) {
            }
                


    }
    