/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-09-19 04:05:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class decidedzone_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>管理定区/调度排班</title>\r\n");
      out.write("<!-- 导入jquery核心类库 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<!-- 导入easyui类库 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\t\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction doAdd(){\r\n");
      out.write("\t\t$('#addDecidedzoneWindow').window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doEdit(){\r\n");
      out.write("\t\talert(\"修改...\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doDelete(){\r\n");
      out.write("\t\talert(\"删除...\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doSearch(){\r\n");
      out.write("\t\t$('#searchWindow').window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doAssociations(){\r\n");
      out.write("\t\r\n");
      out.write("\t\t//先判断是否选择了\r\n");
      out.write("\t\tvar rowData=$('#grid').datagrid('getSelected');\r\n");
      out.write("\t\tif(rowData==null){\r\n");
      out.write("\t\t\t$.messager.alert('警告','请先选择数据','waring');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$('#noassociationSelect').html('');\r\n");
      out.write("\t\t\t$('#associationSelect').html('');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzone_findNoAssoctionCustomer\",function(data){\r\n");
      out.write("\t\t\t\t$(data).each(function(){\r\n");
      out.write("\t\t\t\t\tvar option = $(\"<option value='\"+this.id+\"'>\"+this.name+\"(\"+this.address+\")</option>\");\r\n");
      out.write("\t\t\t\t\t$('#noassociationSelect').append(option);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzone_findHasAssoctionCustomer\",{id:rowData.id},function(data){\r\n");
      out.write("\t\t\t\t$(data).each(function(){\r\n");
      out.write("\t\t\t\t\tvar option = $(\"<option value='\"+this.id+\"'>\"+this.name+\"(\"+this.address+\")</option>\");\r\n");
      out.write("\t\t\t\t\t$('#associationSelect').append(option);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$('#customerWindow').window(\"open\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//工具栏\r\n");
      out.write("\tvar toolbar = [ {\r\n");
      out.write("\t\tid : 'button-search',\t\r\n");
      out.write("\t\ttext : '查询',\r\n");
      out.write("\t\ticonCls : 'icon-search',\r\n");
      out.write("\t\thandler : doSearch\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-add',\r\n");
      out.write("\t\ttext : '增加',\r\n");
      out.write("\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\thandler : doAdd\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-edit',\t\r\n");
      out.write("\t\ttext : '修改',\r\n");
      out.write("\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\thandler : doEdit\r\n");
      out.write("\t},{\r\n");
      out.write("\t\tid : 'button-delete',\r\n");
      out.write("\t\ttext : '删除',\r\n");
      out.write("\t\ticonCls : 'icon-cancel',\r\n");
      out.write("\t\thandler : doDelete\r\n");
      out.write("\t},{\r\n");
      out.write("\t\tid : 'button-association',\r\n");
      out.write("\t\ttext : '关联客户',\r\n");
      out.write("\t\ticonCls : 'icon-sum',\r\n");
      out.write("\t\thandler : doAssociations\r\n");
      out.write("\t}];\r\n");
      out.write("\t// 定义列\r\n");
      out.write("\tvar columns = [ [ {\r\n");
      out.write("\t\tfield : 'id',\r\n");
      out.write("\t\ttitle : '定区编号',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t},{\r\n");
      out.write("\t\tfield : 'name',\r\n");
      out.write("\t\ttitle : '定区名称',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'staff.name',\r\n");
      out.write("\t\ttitle : '负责人',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\treturn row.staff.name;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'staff.telephone',\r\n");
      out.write("\t\ttitle : '联系电话',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\treturn row.staff.telephone;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'staff.station',\r\n");
      out.write("\t\ttitle : '所属公司',\r\n");
      out.write("\t\twidth : 200,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\treturn row.staff.station;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} ] ];\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\r\n");
      out.write("\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 收派标准数据表格\r\n");
      out.write("\t\t$('#grid').datagrid( {\r\n");
      out.write("\t\t\ticonCls : 'icon-forward',\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\tpageList: [2,5,10],\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzone_findByPage\",\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tcolumns : columns,\r\n");
      out.write("\t\t\tonDblClickRow : doDblClickRow,\r\n");
      out.write("\t\t\tsingleSelect:true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 添加、修改定区\r\n");
      out.write("\t\t$('#addDecidedzoneWindow').window({\r\n");
      out.write("\t        title: '添加修改定区',\r\n");
      out.write("\t        width: 600,\r\n");
      out.write("\t        modal: true,\r\n");
      out.write("\t        shadow: true,\r\n");
      out.write("\t        closed: true,\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 查询定区\r\n");
      out.write("\t\t$('#searchWindow').window({\r\n");
      out.write("\t        title: '查询定区',\r\n");
      out.write("\t        width: 400,\r\n");
      out.write("\t        modal: true,\r\n");
      out.write("\t        shadow: true,\r\n");
      out.write("\t        closed: true,\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t$(\"#btn\").click(function(){\r\n");
      out.write("\t\t\talert(\"执行查询...\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#save').click(function(){\r\n");
      out.write("\t\t\tif($('#decidedzoneForm').form('validate')){\r\n");
      out.write("\t\t\t\t$('#decidedzoneForm').submit();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$.messager.alert('警告','输入格式错误','waring');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//左右移动\r\n");
      out.write("\t\t$('#toRight').click(function(){\r\n");
      out.write("\t\t\t// 将未关联 移到 已经关联\r\n");
      out.write("\t\t\t$('#associationSelect').append($('#noassociationSelect option:selected'));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#toLeft').click(function(){\r\n");
      out.write("\t\t\t$('#noassociationSelect').append($('#associationSelect option:selected'));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 点击关联客户，提交表单\r\n");
      out.write("\t\t$('#associationBtn').click(function(){\r\n");
      out.write("\t\t\t// 关联select 中所有option 选中\r\n");
      out.write("\t\t\t$('#associationSelect option').attr('selected','selected');\r\n");
      out.write("\t\t\t// 提交表单\r\n");
      out.write("\t\t\t$('#customerDecidedZoneId').val($('#grid').datagrid('getSelected').id);\r\n");
      out.write("\t\t\t$('#customerForm').submit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction doDblClickRow(rpwIndex,rowData){\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('#association_subarea').datagrid( {\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/subarea_findById\",\r\n");
      out.write("\t\t\tqueryParams:{\"decidedzone.id\":rowData.id},\r\n");
      out.write("\t\t\tcolumns : [ [{\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\ttitle : '分拣编号',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'province',\r\n");
      out.write("\t\t\t\ttitle : '省',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\t\t\treturn row.region.province;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'city',\r\n");
      out.write("\t\t\t\ttitle : '市',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\t\t\treturn row.region.city;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'district',\r\n");
      out.write("\t\t\t\ttitle : '区',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\t\t\treturn row.region.district;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'addresskey',\r\n");
      out.write("\t\t\t\ttitle : '关键字',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'startnum',\r\n");
      out.write("\t\t\t\ttitle : '起始号',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'endnum',\r\n");
      out.write("\t\t\t\ttitle : '终止号',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t} , {\r\n");
      out.write("\t\t\t\tfield : 'single',\r\n");
      out.write("\t\t\t\ttitle : '单双号',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t} , {\r\n");
      out.write("\t\t\t\tfield : 'position',\r\n");
      out.write("\t\t\t\ttitle : '位置',\r\n");
      out.write("\t\t\t\twidth : 200,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t} ] ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t $('#association_customer').datagrid( {\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzone_findCustomer\",\r\n");
      out.write("\t\t\tqueryParams:{\"id\":rowData.id},\r\n");
      out.write("\t\t\tcolumns : [[{\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\ttitle : '客户编号',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\ttitle : '客户名称',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'address',\r\n");
      out.write("\t\t\t\ttitle : '地址',\r\n");
      out.write("\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}]]\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t<div region=\"center\" border=\"false\">\r\n");
      out.write("    \t<table id=\"grid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"south\" border=\"false\" style=\"height:150px\">\r\n");
      out.write("\t\t<div id=\"tabs\" fit=\"true\" class=\"easyui-tabs\">\r\n");
      out.write("\t\t\t<div title=\"关联分区\" id=\"subArea\"\r\n");
      out.write("\t\t\t\tstyle=\"width:100%;height:100%;overflow:hidden\">\r\n");
      out.write("\t\t\t\t<table id=\"association_subarea\"></table>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t<div title=\"关联客户\" id=\"customers\"\r\n");
      out.write("\t\t\t\tstyle=\"width:100%;height:100%;overflow:hidden\">\r\n");
      out.write("\t\t\t\t<table id=\"association_customer\"></table>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 添加 修改分区 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"定区添加修改\" id=\"addDecidedzoneWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"decidedzoneForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzone_saveOrUpdate\"  method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">定区信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>定区编码</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"id\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>定区名称</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>选择负责人</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-combobox\" name=\"staff.id\"  \r\n");
      out.write("    \t\t\t\t\t\t\tdata-options=\"valueField:'id',textField:'name',url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staff_ajaxlist'\" />  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr height=\"300\">\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\">关联分区</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"subareaGrid\"  class=\"easyui-datagrid\" border=\"false\" style=\"width:300px;height:300px\" data-options=\"url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/subarea_findnoassoriations',fitColumns:true,singleSelect:false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>  \r\n");
      out.write("\t\t\t\t\t\t\t        <tr>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'subareaId',width:30,checkbox:true\">编号</th>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'addresskey',width:150\">关键字</th>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'position',width:200,align:'right'\">位置</th>  \r\n");
      out.write("\t\t\t\t\t\t\t        </tr>  \r\n");
      out.write("\t\t\t\t\t\t\t    </thead> \r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 查询定区 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"查询定区窗口\" id=\"searchWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">查询条件</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>定区编码</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"id\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>所属单位</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"staff.station\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>是否关联分区</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"subareaName\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><a id=\"btn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 关联客户窗口 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"关联客户窗口\" id=\"customerWindow\" collapsible=\"false\" closed=\"true\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px;width: 400px;height: 300px;\">\r\n");
      out.write("\t\t<div style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"customerForm\" method=\"post\"   action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzone_assignedCustomerToDecidedzone\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">关联客户</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"customerDecidedZoneId\" />\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"noassociationSelect\" multiple=\"multiple\" size=\"10\"></select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\">>>\" id=\"toRight\"><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"<<<\" id=\"toLeft\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"associationSelect\" name=\"customerIds\" multiple=\"multiple\" size=\"10\"></select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\"><a id=\"associationBtn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save'\">关联客户</a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
