<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<#-- this is the content comment. -->
	<div>The current time is [${time?string("yyyy-MM-dd HH:mm:ss.SSS zzzz")}] </div>
	<br />
	用户群：
	<select>
		<#list users as user>
			<option id="${user.id}">${user.username}</option>
		</#list>
	</select>
	
	<#assign foo=true/> ${foo?string("yes", "no")}
	<#assign x=2.582/>
	<#assign y=4/>
	#{x; M2} <#-- 输出2.58 -->
	#{y; m2M2} <#-- 输出4 -->
	<#assign var="null" />
	#{var?length}
</body>
</html>