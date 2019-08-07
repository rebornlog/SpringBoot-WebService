package net.logcd.ws.svc.service;

import org.dom4j.DocumentException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.IOException;

/**
 * @author 水木年华
 * @title: XfireService
 * @projectName springboot-svc
 * @description: TODO
 * @date 2019/8/412:19
 */
@WebService
public interface XfireService {
    @WebMethod
    String JSON(@WebParam(name = "appSerialNumber") String appSerialNumber, @WebParam(name = "utsNodeInfo") String utsNodeInfo);
    @WebMethod
    String XML(@WebParam(name = "appSerialNumber") String appSerialNumber, @WebParam(name = "utsNodeInfo") String utsNodeInfo) throws IOException, DocumentException;
    @WebMethod
    String JSONXML(@WebParam(name = "appSerialNumber") String appSerialNumber, @WebParam(name = "utsNodeInfo") String utsNodeInfo) throws IOException, DocumentException;
}
