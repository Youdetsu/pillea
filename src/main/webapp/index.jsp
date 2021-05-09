<html>
<head>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script>
        function test(){

            $.ajax({
                url:"ajaxAction.do",
                type:"POST",
                dataType:"json",
                success:function (result) {
                    alert(result.name);
                    $("span").css("color","red");
                    $("span").html(result.name);
                }


            })
        }
        function testObj() {
            alert($("#rr").serialize());
            var user={
                'user.userName':$("input[name='userName']").val(),
                'user.phone':$("input[name='phone']").val()
            };
            /*var userName = $("input[name='userName']").val();
            var phone = $("input[name='phone']").val();
            var user = new Object();
            user.userName = userName;
            user.phone = phone;*/
           // alert(userName);
            $.ajax({
                url:"ajaxUser.do",
                type:"POST",
                data:$("#rr").serialize(),
                dataType:"json",
                success:function (result) {
                    alert("success");
                    alert(result.userName);
                },
                error:function () {
                    alert("error");
                }

            })
        }
    </script>
</head>
<body>
<h2>Hello World!</h2>

</body>
<span></span>
<input type="button" value="点我" onclick="test()">
<input type="button" value="点我2" onclick="testObj()">
<form id="rr">
    <input type="text" name="userName" value="22"/>
    <input type="text" name="phone"/>
</form>
<form action="ajaxUser.do">
<input type="text" name="user.userName" value="22"/>
<input type="text" name="user.phone"/>
    <input type="submit" value="333">
</form>
</html>
