<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- id, 패스워드 입력 검사 후 진행하도록  작성  -->
<script src="js/jquery-3.5.1.min.js"></script>
<script>
  $(() => {
    $('form').on('submit', (e) => {
      const userid = $('#userid').val().length;
      const passwd = $('#passwd').val().length;

      if (userid === 0) {
        e.preventDefault();
        alert('아이디를 입력하세요.');
      } else if (passwd === 0) {
        e.preventDefault();
        alert('비밀번호를 입력하세요.');
      }
    });
  });
</script>
<form action="LoginServlet" method="GET">
  아이디:<input type="text" name="userid" id="userid" /><br />
  비밀번호:<input type="text" name="passwd" id="passwd" /><br />
  <input type="submit" value="로그인" /> <input type="reset" value="취소" />
</form>
