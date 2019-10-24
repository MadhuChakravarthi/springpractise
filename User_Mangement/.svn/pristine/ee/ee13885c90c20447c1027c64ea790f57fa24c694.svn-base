package org.tempuri;

public class StateWiseSearchOnUIDSoapProxy implements org.tempuri.StateWiseSearchOnUIDSoap {
  private String _endpoint = null;
  private org.tempuri.StateWiseSearchOnUIDSoap stateWiseSearchOnUIDSoap = null;
  
  public StateWiseSearchOnUIDSoapProxy() {
    _initStateWiseSearchOnUIDSoapProxy();
  }
  
  public StateWiseSearchOnUIDSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initStateWiseSearchOnUIDSoapProxy();
  }
  
  private void _initStateWiseSearchOnUIDSoapProxy() {
    try {
      stateWiseSearchOnUIDSoap = (new org.tempuri.StateWiseSearchOnUIDLocator()).getStateWiseSearchOnUIDSoap();
      if (stateWiseSearchOnUIDSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stateWiseSearchOnUIDSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stateWiseSearchOnUIDSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stateWiseSearchOnUIDSoap != null)
      ((javax.xml.rpc.Stub)stateWiseSearchOnUIDSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.StateWiseSearchOnUIDSoap getStateWiseSearchOnUIDSoap() {
    if (stateWiseSearchOnUIDSoap == null)
      _initStateWiseSearchOnUIDSoapProxy();
    return stateWiseSearchOnUIDSoap;
  }
  
  public java.lang.String stateWiseSearchBasedonUID(java.lang.String UID, int dcode, java.lang.String usr_id, java.lang.String pwd) throws java.rmi.RemoteException{
    if (stateWiseSearchOnUIDSoap == null)
      _initStateWiseSearchOnUIDSoapProxy();
    return stateWiseSearchOnUIDSoap.stateWiseSearchBasedonUID(UID, dcode, usr_id, pwd);
  }
  
  
}