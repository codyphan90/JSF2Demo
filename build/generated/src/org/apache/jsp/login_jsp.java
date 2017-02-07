package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputSecret_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_inputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputSecret_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_inputText_value_nobody.release();
    _jspx_tagPool_h_inputSecret_value_nobody.release();
    _jspx_tagPool_h_commandButton_value_type_nobody.release();
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_commandButton_value_action_nobody.release();
    _jspx_tagPool_h_form.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id7");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    <html>\r\n");
        out.write("        <head>\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
        out.write("            <title>Login</title>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body>\r\n");
        out.write("            <h1>Login Page</h1>\r\n");
        out.write("            ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </body>\r\n");
        out.write("    </html>\r\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id18");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                Username ");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("<br>\r\n");
        out.write("                Password ");
        if (_jspx_meth_h_inputSecret_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("<br>\r\n");
        out.write("                ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_h_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setJspId("id20");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{regSessionBean.username}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_nobody.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_inputSecret_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputSecret
    com.sun.faces.taglib.html_basic.InputSecretTag _jspx_th_h_inputSecret_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputSecretTag.class) : new com.sun.faces.taglib.html_basic.InputSecretTag();
    _jspx_th_h_inputSecret_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputSecret_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputSecret_0.setJspId("id22");
    _jspx_th_h_inputSecret_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{regSessionBean.password}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_inputSecret_0 = _jspx_th_h_inputSecret_0.doStartTag();
    if (_jspx_th_h_inputSecret_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputSecret_value_nobody.reuse(_jspx_th_h_inputSecret_0);
      return true;
    }
    _jspx_tagPool_h_inputSecret_value_nobody.reuse(_jspx_th_h_inputSecret_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id24");
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Login", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{regSessionBean.checkLogin}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_1.setJspId("id26");
    _jspx_th_h_commandButton_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Reset", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_1.setType(org.apache.jasper.runtime.PageContextImpl.getValueExpression("reset", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_type_nobody.reuse(_jspx_th_h_commandButton_1);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_type_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }
}
