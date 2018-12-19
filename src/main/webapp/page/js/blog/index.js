var INDEX = {

    _page:1,
    _type:"POST",

    getBlogList:function () {
        $.ajax({
            url:"index/list",
            type:INDEX._type,
            data:{

            },
            success:function (data) {
                // alert(data);
                // if(data){
                    // for (var i = 0; i < data.length; i++) {
                        // var title = data[i].title;
                        // $("h3[class='blogtitle']").find("a").get(1).text(data[i].title);
                        appendLi(data);
                    // }
                // }
            },
            error:function () {
                alert("error");
            }
        })
    }
}

function appendLi(data){
    if(data){
        var obj = data.data;
        for (var i = 0; i < obj.length; i++) {
            var b = obj[i];
            var li = $("<li></li>");
            var blogtitle = "<h3 class='blogtitle'><span><a href='/jstt/css3/' title='css3' target='_blank' class='classname'>个人博客</a></span><a href='/jstt/css3/2018-03-26/812.html' target='_blank'>"+b.title+"</a></h3>"
            var bloginfo = "<div class='bloginfo'><span class='blogpic'><a href='/jstt/css3/2018-03-26/812.html' title='"+b.title+"'><img src='/page/images/01.jpg' alt='测试测试测试'></a></span>\n" +
                "<p>"+b.content+"</p>\n" +
                "</div>";
            var autor = "<div class=\"autor\"><span class=\"lm f_l\"></span><span class=\"dtime f_l\">"+b.createTime+"</span><span class=\"viewnum f_l\">浏览（<a href=\"/\">1429</a>）</span><span class=\"f_r\"><a href=\"/jstt/css3/2018-03-26/812.html\" class=\"more\">阅读原文&gt;&gt;</a></span></div>";
            $(li).append(blogtitle);
            $(li).append(bloginfo);
            $(li).append(autor);
            $("#bloglistul").append(li);
        }
    }
}