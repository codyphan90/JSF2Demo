<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Home</title>
        </head>
        <body>
            <font color="blue">Welcome, <h:outputText value="#{regSessionBean.username}"/></font>
            <h1>This is JSF page</h1>
            <h:form>
                Search User <h:inputText value="#{regSessionBean.searchValue}"/><br>
                <h:commandButton value="Search" action="#{regSessionBean.searchLikeLastName()}"/><br>
                <br>
                Click <h:commandLink value="here" action="#{regSessionBean.tryLogin}"/> to return login page
            </h:form>
        </body>
    </html>
</f:view>
