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
                    <!--form edit account-->
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Update"/>
                        </f:facet>
                        <h:commandLink value="Edit" action="#{regSessionBean.editAccount}"
                                       rendered="#{not regSessionBean.editable}" />
                        <h:commandLink value="Update" actionListener="#{regSessionBean.updateAccount}"
                                       rendered="#{regSessionBean.editable}">
                            <f:attribute name="username" value="#{reg.username}"/>
                        </h:commandLink>
                    </h:column>
                    <!--form delete account-->
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Delete"/>
                        </f:facet>
                        <h:commandLink value="Delete" 
                                       actionListener="#{regSessionBean.deleteAccount}">
                            <f:attribute name="username" value="#{reg.username}" />
                        </h:commandLink>      
                    </h:column>
                </h:dataTable>
            </h:form>
            <!--form create new account-->
            <h:form>
                <h:commandButton binding="#{regSessionBean.addCommand}"
                                 action="#{regSessionBean.addNew}" value="Add New Account"/>
            </h:form>
            <h:form binding="#{regSessionBean.insertForm}" rendered="false">
                <h:outputLabel value="Username" for="username" accesskey="u"/>
                <h:inputText id="username" required="true"
                             value="#{regSessionBean.sUsername}" size="20"/>
                <h:message  for="username"/><br/>
                <h:outputLabel value="Password" for="password" accesskey="p"/>
                <h:inputSecret id="password" required="true"
                               value="#{regSessionBean.sPassword}" size="20"/>
                <h:message for="password"/><br/>
                <h:outputLabel value="Lastname" for="lastname" accesskey="l"/>
                <h:inputText id="lastname" required="true"
                             value="#{regSessionBean.sLastname}" size="40"/>
                <h:message for="lastname"/><br/>
                <h:outputLabel value="Admin" for="roles" accesskey="r"/>
                <h:selectBooleanCheckbox id="roles"
                                         value="#{regSessionBean.bRoles}"/><br/>
                <h:commandButton binding="#{regSessionBean.insertCommand}"
                                 action="#{regSessionBean.insertAccount}"/>
            </h:form>
            <br>
            <c:if test="${empty regSessionBean.regSearch}">
                No record is matched!
                <br>
            </c:if>
            <h:form>  <h:commandLink value="Back" action="#{regSessionBean.goHome}"/></h:form>

            </body>
        </html>
</f:view>
