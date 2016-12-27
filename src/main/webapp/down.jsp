<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <title>test-安全下载</title>
</head>
<body>
<h3>struts-action-文件下载</h3>
<a href="downj.action?fn=girl" download>下载美女图片</a>&nbsp;
<hr><a href="downs.action?fn=index" download>下载index.jsp</a>&nbsp;
<a href="downr.action?fn=struts05">源码下载</a>&nbsp;
<hr>
<hr>
<hr>
<a href="test?fn=struts05&ext=rar">源码下载</a>&nbsp;
<hr><a href="test?fn=index&ext=jsp" download>下载index.jsp</a>
<hr><a href="test?fn=girl&ext=jpg" download>下载美女图片</a>
<hr>
</body>
</html>
