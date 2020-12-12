<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
        integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
        crossorigin="anonymous"></script>
<script>
  $(document).ready(function() {
    $("form").on("submit", (e) => {
      var userid = $("#userid").val();
      var passwd = $("#passwd").val();
      if (userid.length === 0) {
        alert("userid 필수")
        $("#userid").focus();
        e.preventDefault();
      } else if (passwd.length === 0) {
        alert("passwd 필수")
        $("#passwd").focus();
        e.preventDefault();
      }
    });
  });
</script>
<c:if test="${! empty mesg }">
    <script>
      alert('${mesg}')
    </script>
</c:if>
<form action="login" method="post">
    아이디:
    <input type="text" name="userid" id="userid">
    <br>
    비밀번호:
    <input type="text" name="passwd" id="passwd">
    <br>
    <input type="submit" value="로그인">
    <input type="reset" value="취소">
    <a href="MemberIdSearchUIServlet">아이디찾기</a>
</form>

<%-- <%

   String mesg = (String)request.getAttribute("mesg");
  if(mesg!=null){
%>
   <script>
     alert('<%=mesg %>');
   </script>
<%
  }
%>

 --%>
