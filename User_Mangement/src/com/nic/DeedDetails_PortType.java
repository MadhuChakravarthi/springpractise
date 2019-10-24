/**
 * DeedDetails_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nic;

public interface DeedDetails_PortType extends java.rmi.Remote {
    public byte[] documentInfo(int srCode, int regYear, int documentNumber, java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException;
}
