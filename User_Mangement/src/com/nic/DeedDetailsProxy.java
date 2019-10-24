package com.nic;

public class DeedDetailsProxy implements com.nic.DeedDetails_PortType {
  private String _endpoint = null;
  private com.nic.DeedDetails_PortType deedDetails_PortType = null;
  
  public DeedDetailsProxy() {
    _initDeedDetailsProxy();
  }
  
  public DeedDetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initDeedDetailsProxy();
  }
  
  private void _initDeedDetailsProxy() {
    try {
      deedDetails_PortType = (new com.nic.DeedDetails_ServiceLocator()).getDeedDetailsPort();
      if (deedDetails_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)deedDetails_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)deedDetails_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (deedDetails_PortType != null)
      ((javax.xml.rpc.Stub)deedDetails_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nic.DeedDetails_PortType getDeedDetails_PortType() {
    if (deedDetails_PortType == null)
      _initDeedDetailsProxy();
    return deedDetails_PortType;
  }
  
  public byte[] documentInfo(int srCode, int regYear, int documentNumber, java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException{
    if (deedDetails_PortType == null)
      _initDeedDetailsProxy();
    return deedDetails_PortType.documentInfo(srCode, regYear, documentNumber, uid, pwd);
  }
  
  
}