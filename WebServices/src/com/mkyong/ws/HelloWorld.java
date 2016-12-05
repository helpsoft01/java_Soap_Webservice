package com.mkyong.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.mekymong.entity.complexUser;
import com.mekymong.entity.user;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface HelloWorld {

	@WebMethod()
	String getHelloWorldAsString();

	@WebMethod
	user getUser();

	@WebMethod()
	user[] getListUsers();

	@WebMethod
	@WebResult(name = "EchoStructReturnMessage", targetNamespace = "http://example.org/complex")
	complexUser getComplexUser();

}