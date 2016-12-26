<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <title>struts 2.5.8</title>
</head>
<body>
<s:iterator begin="1" end="5">
    <h2>Hello World!</h2>
</s:iterator>
<hr>
<a href="show.action">显示源代码</a>
<hr>
<a href="test">servlet3-test</a>
<hr>
<a href="hello">helloaction</a>
</body>
</html>
