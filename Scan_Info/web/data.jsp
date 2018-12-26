<%@ page language="java" import="java.util.*,com.xue.utils.*" pageEncoding="utf-8"%>
<%
	String path = request.getParameter("path");
	String filePath = request.getRealPath("/") + path;
	// 返回身份证识别的文字信息
	String result = IdUtil.getScanResult(filePath);
	
	out.print(result);
%>