<%
    String path = request.getScheme() +"://"+request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    System.out.println(path);

    Double v = 1.0;
%>

<script type="text/javascript" src="<%=path%>/resources/js/jquery-1.9.1.min.js?version=<%=v%>"></script>