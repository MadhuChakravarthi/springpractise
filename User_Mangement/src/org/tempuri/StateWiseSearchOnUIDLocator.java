/**
 * StateWiseSearchOnUIDLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StateWiseSearchOnUIDLocator extends org.apache.axis.client.Service implements org.tempuri.StateWiseSearchOnUID {

    public StateWiseSearchOnUIDLocator() {
    }


    public StateWiseSearchOnUIDLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StateWiseSearchOnUIDLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StateWiseSearchOnUIDSoap
    private java.lang.String StateWiseSearchOnUIDSoap_address = "http://uatwebland.ap.gov.in/statewisesearchonUID.asmx";

    public java.lang.String getStateWiseSearchOnUIDSoapAddress() {
        return StateWiseSearchOnUIDSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StateWiseSearchOnUIDSoapWSDDServiceName = "StateWiseSearchOnUIDSoap";

    public java.lang.String getStateWiseSearchOnUIDSoapWSDDServiceName() {
        return StateWiseSearchOnUIDSoapWSDDServiceName;
    }

    public void setStateWiseSearchOnUIDSoapWSDDServiceName(java.lang.String name) {
        StateWiseSearchOnUIDSoapWSDDServiceName = name;
    }

    public org.tempuri.StateWiseSearchOnUIDSoap getStateWiseSearchOnUIDSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StateWiseSearchOnUIDSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStateWiseSearchOnUIDSoap(endpoint);
    }

    public org.tempuri.StateWiseSearchOnUIDSoap getStateWiseSearchOnUIDSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.StateWiseSearchOnUIDSoapStub _stub = new org.tempuri.StateWiseSearchOnUIDSoapStub(portAddress, this);
            _stub.setPortName(getStateWiseSearchOnUIDSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStateWiseSearchOnUIDSoapEndpointAddress(java.lang.String address) {
        StateWiseSearchOnUIDSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.StateWiseSearchOnUIDSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.StateWiseSearchOnUIDSoapStub _stub = new org.tempuri.StateWiseSearchOnUIDSoapStub(new java.net.URL(StateWiseSearchOnUIDSoap_address), this);
                _stub.setPortName(getStateWiseSearchOnUIDSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StateWiseSearchOnUIDSoap".equals(inputPortName)) {
            return getStateWiseSearchOnUIDSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "StateWiseSearchOnUID");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "StateWiseSearchOnUIDSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StateWiseSearchOnUIDSoap".equals(portName)) {
            setStateWiseSearchOnUIDSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
