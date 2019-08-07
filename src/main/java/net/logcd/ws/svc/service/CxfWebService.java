package net.logcd.ws.svc.service;

import org.dom4j.DocumentException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.IOException;

@WebService
public interface CxfWebService {
    @WebMethod
    String JSON(@WebParam(name = "appSerialNumber") String appSerialNumber, @WebParam(name = "utsNodeInfo") String utsNodeInfo);
   @WebMethod
    String XML(@WebParam(name = "appSerialNumber") String appSerialNumber, @WebParam(name = "utsNodeInfo") String utsNodeInfo) throws IOException, DocumentException;
  @WebMethod
    String JSONXML(@WebParam(name = "appSerialNumber") String appSerialNumber, @WebParam(name = "utsNodeInfo") String utsNodeInfo) throws IOException, DocumentException;
}
