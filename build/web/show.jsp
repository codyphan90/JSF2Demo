<%-- 
    Document   : show
    Created on : Feb 6, 2017, 2:37:36 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Show result</title>
        </head>
        <body>
            <font color="blue">Welcome, <h:outputText value="#{regSessionBean.username}"/></font>
            <h1>Show Result</h1>
            <h:form>
                <h:dataTable value="#{regSessionBean.regSearch}" var="reg"
                             rendered="#{not empty regSessionBean.regSearch}"
                             border="5" frame="box" rules="all" dir="LTR">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Username"/>
                        </f:facet>
                        <h:outputText value="#{reg.username}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Lastname"/>
                        </f:facet>
                        <h:outputText value="#{reg.lastname}" rendered="#{not regSessionBean.editable}"/>
                        <h:inputText value="#{reg.lastname}" rendered="#{regSessionBean.editable}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Roles"/>
                        </f:facet>
                        <h:outputText value="#{reg.roles}" rendered="#{not regSessionBean.editable}"/>
                        <h:selectBooleanCheckbox value="#{reg.roles}" rendered="#{regSessionBean.editable}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Update"/>
                        </f:facet>
                        <h:commandLink value="Edit" action="#{regSessionBean.editAccount}"
                                       rendered="#{not regSessionBean.editable}" />
                        <h:commandLink value="Update" actionListener="#{regSessionBean.updateAccount}"
                                       rendered="#{regSessionBean.editable}">
                        <f:attribute name="req" value="#{reg}"/>
                        </h:commandLink>
                    </h:column>
                </h:dataTable>
            </h:form>
            <c:if test="${empty regSessionBean.regSearch}">
                No record is matched!
            </c:if>
                <h:form>  <h:commandLink value="Back" action="#{regSessionBean.goHome}"/></h:form>
                
        </body>
    </html>
</f:view>
