<%-- 
    Document   : invalid
    Created on : Feb 6, 2017, 10:49:22 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Invalid Login</title>
        </head>
        <body>
            <h1><font color="red">Invalid username or password!</font></h1>
            <h:form>
                Click <h:commandLink value="here" action="#{regSessionBean.tryLogin}"/> to try again
            </h:form>
        </body>
    </html>
</f:view>
