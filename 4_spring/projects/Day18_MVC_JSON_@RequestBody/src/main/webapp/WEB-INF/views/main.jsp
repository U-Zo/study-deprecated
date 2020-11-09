<%--
  Created by IntelliJ IDEA.
  User: KWJ
  Date: 2020-11-09
  Time: 오전 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
      window.onload = () => {
        const aaa = document.querySelector('#aaa');
        const bbb = document.querySelector('#bbb');
        const ccc = document.querySelector('#ccc');
        const ddd = document.querySelector('#ddd');
        const result = document.querySelector('#result');

        aaa.addEventListener('click', () => {
          fetch('aaa')
            .then(response => response.json())
            .then(data => {
              result.innerHTML = JSON.stringify(data);
            })
        });

        bbb.addEventListener('click', async () => {
          const response = await fetch('bbb');
          const data = await response.json();
          result.innerHTML = JSON.stringify(data);
        });

        ccc.addEventListener('click', async () => {
          const response = await fetch('ccc');
          const data = await response.json();
          console.log(data);
          result.innerHTML = JSON.stringify(data);
        });

        ddd.addEventListener('click', () => {
          fetch('ddd?message=kkkk')
            .then(response => response.text())
            .then(data => {
              result.innerHTML = data;
            });
        });
      }
    </script>
</head>
<body>
<button id="aaa">aaa 호출: login 호출</button>
<button id="bbb">bbb 호출: ArrayList</button>
<button id="ccc">ccc 호출: HashMap</button>
<button id="ddd">String</button>
<div id="result"></div>
</body>
</html>
