<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<script type="text/javascript">
  	
	var cashRegister = {
    total: 0,
//insert the add method here    
	add:function(item){
		this.total=this.total+item;
	},
    
    scan: function (item) {
        switch (item) { 
        case "eggs": 
            this.add(0.98); 
            break;
        
        case "milk": 
            this.add(1.23); 
            break;
        
        //Add other 2 items here
         case "magazine": 
            this.add(4.99); 
            break;
        
        
         case "chocolate": 
            this.add(0.45); 
            break;
        }
        return true;
    }
};

//Scan 2 eggs and 3 magazines
cashRegister.scan("eggs");
cashRegister.scan("eggs");
cashRegister.scan("magazine");
cashRegister.scan("magazine");
cashRegister.scan("magazine");
//Show the total bill
console.log('Your bill is '+cashRegister.total);
document.write("Your bill is "+cashRegister.total);
  	</script>
<body>


<br>
	This is my JSP page.
	<br>
</body>
</html>
