<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>New Account Registration</TITLE>
</HEAD>
<BODY>
<CENTER>
<TABLE BORDER=5>
  <TR><TH CLASS="TITLE">Java Server Faces Login Form Using Bean Example</TH></TR>
</TABLE>
<P>
<h:form >
  Email address:   <h:inputText id="user" value="#{Loginbean.user}"/><BR>
  Password:   <h:inputSecret id="pwd" value="#{Loginbean.pwd}"/><BR>

<h:commandButton value="Submit"  action="#{Loginbean.register}"/>

</h:form>


</CENTER></BODY></HTML>
</f:view>