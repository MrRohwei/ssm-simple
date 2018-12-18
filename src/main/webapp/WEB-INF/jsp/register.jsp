<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7/007
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="common.jsp"%>
<html>

<head>
    <title>注册页面</title>
</head>
<body>
    <div style="width: 400px;text-align: center;margin: 0 auto;background: #5a92ea;margin-top: 200px;padding: 50px 10px;">
        <input type="text" placeholder="用户名*" name="username"/> <br />
        <input type="password" placeholder="密码*" name="password"/> <br />
        <input type="password" placeholder="确认密码*" name="repassword"/> <br />
        <input type="text" placeholder="邮箱*" name="email"/> <br />
        <input type="text" placeholder="手机号" name="phone"/> <br />

        <input type="button" value="注  册" id="registerBtn"/>

        <span id="print"></span>
    </div>
</body>
</html>

<script>
    $("#registerBtn").click(function(){
        var username = $("input[name=username]").val();
        var password = $("input[name=password]").val();
        var repassword = $("input[name=repassword]").val();
        var email = $("input[name=email]").val();
        var phone = $("input[name=phone]").val();
        if(!username){
            alert("用户名不能为空");
            return;
        }
        if(!password){
            alert("密码不能为空");
            return;
        }
        if(!repassword){
            alert("确认密码不能为空");
            return;
        }else if(repassword != password){
            alert("两次密码输入不一致，请重新输入");
            return;
        }
    // ^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$

        if(!email){
            alert("邮箱不能为空");
            return;
        }else if(!checkEmail(email)){
            alert("邮箱格式不正确");
            return;
        }
        if(!phone){
            alert("您还未输入手机号，请尽快绑定哦！");
        }
        $.ajax({
            url:"sysUser/register",
            type:"POST",
            data:{
                username:username,
                password:password,
                email:email,
                phone:phone
            },
            success:function (obj) {
                if(obj){
                    var code = obj.code;
                    var message = obj.message;
                    var data = obj.data;
                    if(code != "200"){
                        alert(message);
                    }else{
                        alert("注册成功");
                        // $("#print").text(data)
                    }
                }
            },
            error:function () {
                
            }
        })
    });


    function checkEmail(email){
        var reg = new RegExp("^[a-z0-9]+([._\\\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
        if(!reg.test(email)){
            return false;
        }
        return true;
    }
</script>
