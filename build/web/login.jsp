<%-- 
    Document   : login
    Created on : Feb 6, 2017, 10:38:33 AM
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
            <title>Login</title>
        </head>
        <body>
            <h1>Login Page</h1>
            <h:form>
                Username <h:inputText value="#{regSessionBean.username}"/><br>
                Password <h:inputSecret value="#{regSessionBean.password}"/><br>
                <h:commandButton value="Login" action="#{regSessionBean.checkLogin}" />
                <h:commandButton value="Reset" type="reset" />
            </h:form>
        </body>
    </html>
</f:view>
