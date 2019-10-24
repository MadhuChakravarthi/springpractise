/**
 * DeedDetails_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nic;

public class DeedDetails_ServiceLocator extends org.apache.axis.client.Service implements com.nic.DeedDetails_Service {

    public DeedDetails_ServiceLocator() {
    }


    public DeedDetails_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DeedDetails_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DeedDetailsPort
    private java.lang.String DeedDetailsPort_address = "http://registration.ap.gov.in:80/LANDHUBService/DeedDetails";

    public java.lang.String getDeedDetailsPortAddress() {
        return DeedDetailsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DeedDetailsPortWSDDServiceName = "DeedDetailsPort";

    public java.lang.String getDeedDetailsPortWSDDServiceName() {
        return DeedDetailsPortWSDDServiceName;
    }

    public void setDeedDetailsPortWSDDServiceName(java.lang.String name) {
        DeedDetailsPortWSDDServiceName = name;
    }

    public com.nic.DeedDetails_PortType getDeedDetailsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DeedDetailsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDeedDetailsPort(endpoint);
    }

    public com.nic.DeedDetails_PortType getDeedDetailsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nic.DeedDetailsPortBindingStub _stub = new com.nic.DeedDetailsPortBindingStub(portAddress, this);
            _stub.setPortName(getDeedDetailsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDeedDetailsPortEndpointAddress(java.lang.String address) {
        DeedDetailsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nic.DeedDetails_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nic.DeedDetailsPortBindingStub _stub = new com.nic.DeedDetailsPortBindingStub(new java.net.URL(DeedDetailsPort_address), this);
                _stub.setPortName(getDeedDetailsPortWSDDServiceName());
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
        if ("DeedDetailsPort".equals(inputPortName)) {
            return getDeedDetailsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nic.com/", "DeedDetails");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nic.com/", "DeedDetailsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DeedDetailsPort".equals(portName)) {
            setDeedDetailsPortEndpointAddress(address);
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
