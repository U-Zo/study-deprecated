<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
  $(() => {
    $("#allCheck").click(() => {
      if ($("#allCheck").is(":checked")) {
        $(".check").prop("checked", true)
      } else {
        $(".check").prop("checked", false)
      }
    });

    $(".deleteBtn").click((e) => {
      const num = $(e.target).attr("data-num");
      const xxx = $(e.target);
      $.ajax({
        url: 'loginCheck/cartDelete',
        type: 'get',
        dataType: 'text',
        data: {
          num
        },
        success: () => {
          xxx.parents().filter('tr').remove();
          calcAll();
        },
        error: (xhr, status, error) => {
          console.log(error);
        }
      });
    });

    $(".updateBtn").click((e) => {
      const num = $(e.target).attr("data-num");
      const price = $(e.target).attr("data-price");
      const amount = $("#cartAmount" + num).val();
      $.ajax({
        type: "GET",
        url: "loginCheck/cartUpdate",
        dataType: "text",
        data: {
          num: num,
          amount: amount,
        },
        success: function(responseData, status, xhr) {
          //$("#result").text(responseData);
          $("#sum" + num).text(price * amount);
          calcAll();
          //console.log("success")
        },
        error: function(xhr, status, error) {
          console.log("error");
        }
      });
    });

    $('#delAllCart').on('click', () => {
      $('form').attr('action', 'loginCheck/delAllCart');
      $('form').submit();
    });

    $('.orderBtn').on('click', (e) => {
      const num = e.target['data-num'];
      console.log(num);
    });

    calcAll();
  });

  const calcAll = () => {
    const sumNodes = document.querySelectorAll('[id^=sum]');
    const totalPrice = Array.from(sumNodes).reduce((prev, curr) => {
      return prev + parseInt($(curr).text());
    }, 0);
    $('#totalPrice').text(totalPrice);
  }

  const orderAllConfirm = (form) => {
  }
</script>

<h2 style="text-align: center;">장바구니</h2>
<table width="100%" cellspacing="0" cellpadding="0" border="0">
    <tr>
        <td height="30">
    </tr>
    <!-- <tr>
        <td colspan="5" class="td_default">&nbsp;&nbsp;&nbsp; <font
            size="5"><b>- 장바구니-</b></font> &nbsp;
        </td>
    </tr> -->
    <tr>
        <td height="15">
    </tr>
    <tr>
        <td colspan="10">
            <hr size="1" color="CCCCCC">
        </td>
    </tr>
    <tr>
        <td height="7">
    </tr>
    <tr>
        <td class="td_default" align="center">
            <input type="checkbox" name="allCheck" id="allCheck"> <strong>전체선택</strong></td>
        <td class="td_default" align="center"><strong>주문번호</strong></td>
        <td class="td_default" align="center" colspan="2"><strong>상품정보</strong></td>
        <td class="td_default" align="center"><strong>판매가</strong></td>
        <td class="td_default" align="center" colspan="2"><strong>수량</strong></td>
        <td class="td_default" align="center"><strong>합계</strong></td>
        <td></td>
    </tr>
    <tr>
        <td height="7">
    </tr>
    <tr>
        <td colspan="10">
            <hr size="1" color="CCCCCC">
        </td>
    </tr>
    <form name="myForm">
        <c:forEach var="x" items="${cartList}" varStatus="status">
            <input type="hidden" name="num" value="${x.num}" id="num">
            <input type="hidden" name="gImage" value="${x.gImage}" id="gImage">
            <input type="hidden" name="gName" value="${x.gName}" id="gName">
            <input type="hidden" name="gSize" value="${x.gSize}" id="gSize">
            <input type="hidden" name="gColor" value="${x.gColor}" id="gColor">
            <input type="hidden" name="gPrice" value="${x.gPrice}" id="gPrice">
            <tr>
                <td class="td_default" width="80">
                    <!-- checkbox는 체크된 값만 서블릿으로 넘어간다. 따라서 value에 삭제할 num값을 설정한다. -->
                    <input type="checkbox"
                           name="check" id="check81" class="check" value="${x.num}" />
                </td>
                <td class="td_default" width="80">
                        ${x.num}
                </td>
                <td class="td_default" width="80">
                    <img src="images/items/${x.gImage}.gif" border="0" align="center"
                         width="80" />

                </td>
                <td class="td_default" width="300" style='padding-left: 30px'>
                        ${x.gName}
                    <br>
                    <font size="2" color="#665b5f">[옵션 : 사이즈(${x.gSize})
                        , 색상(${x.gColor})]
                    </font>

                </td>
                <td class="td_default" align="center" width="110">
                        ${x.gPrice}
                </td>
                <td class="td_default" align="center" width="90">
                    <input class="input_default" type="text" name="cartAmount"
                           id="cartAmount${x.num}" style="text-align: right" maxlength="3"
                           size="2" value="${x.gAmount}" />
                </td>
                <td>
                    <input type="button" value="수정"
                           class="updateBtn"
                           data-num="${x.num}"
                           data-price="${x.gPrice}" />
                </td>
                <td class="td_default" align="center" width="80"
                    style='padding-left: 5px'>
				<span id="sum${x.num}">
                        ${x.gAmount * x.gPrice}
                </span>
                </td>
                <td>
                    <input type="button" value="주문" class="orderBtn" data-num="${x.num}" />
                </td>
                <td class="td_default" align="center" width="30"
                    style='padding-left: 10px'>
                    <input type="button" value="삭제" class="deleteBtn" data-num="${x.num}" />
                </td>
                <td height="10"></td>
            </tr>
        </c:forEach>
    </form>
    <tr>
        <td colspan="10">
            <hr size="1" color="CCCCCC">
        </td>
    </tr>
    <tr>
        <td height="30">
    </tr>
    <tr>
        <td colspan="6"></td>
        <td align="right"><b>Total</b></td>
        <td align="center"><span id="totalPrice">0</span></td>
    </tr>
    <tr>
        <td align="center" colspan="5">
            <a class="a_black" href="javascript:orderAllConfirm(myForm)">
                전체 주문하기
            </a>&nbsp;&nbsp;&nbsp;&nbsp;
            <button id="delAllCart">
                선택 삭제하기
            </button>&nbsp;&nbsp;&nbsp;&nbsp;
            <a class="a_black" href="./">
                계속 쇼핑하기
            </a>&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
    </tr>
    <tr>
        <td height="20">
    </tr>
</table>
