<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/style.css">
    <title>메인화면</title>
</head>
<body>
<% if(session.getAttribute("userid") == null) { %>
	<%@ include file="common/header.jsp" %> 
<%
	} else { %>
	<%@ include file="common/headerLogin.jsp" %>	
<%
	}
%>
   <h1 class="title">주문완료</h1>
    
    <div class="o_step">
        <ul>
            <li class="step3_1">
                <img src="images/step_buy1.png"><br><br>01.장바구니
            </li>
            <li class="step3_2">
                <img src="images/step_buy2.png"><br><br>02.주문서작성
            </li>
            <li class="step3_3">
                <img src="images/step_buy3.png"><br><br>03.주문완료
            </li>
        </ul>
    </div>
    
    <form method="post">
	    <div class="div_k2">
	        
	        <div class="div_finish">
	            <table class="table_finish">
	                <tr>
	                    <th rowspan="3">
	                        <img src="images/check_orange1.png" alt="check_orange" width="100px" height="100px">
	                    </th>
	                    <td><h2>고객님의 주문이 완료 되었습니다.</h2></td>
	                </tr>
	                <tr>
	                    <td>주문내역 및 배송에 관한 안내는 <input type="button" value="주문조회" class="o_borton"> 를 통하여 확인 가능합니다.</td>
	                </tr>
	                <tr>
	                    <td>주문번호 : <b>20201208-0000128</b><br>
	                        주문일자 : 2020-12-08 12:08:01</td>
	                </tr>
	            </table>
	        </div>
	        
	        <div class="div_finish2">
	            <div class="h_finish">
	                <h3>결제정보</h3>
	            </div>
	            <table class="table_finish2">
	                <tr>
	                    <th>총 주문 금액</th>
	                    <th>총 결제금액</th>
	                </tr>
	                <tr>
	                    <td>28,000원</td>
	                    <td>28,000원</td>
	                </tr>
	            </table>
	           
	        </div>
	        
	        <div class="div_finish3">
	            <div class="h_finish">
	                <h3>배송지정보</h3>
	            </div>
	            <table class="table_finish3">
	                <colgroup>
	                    <col width="13%">
	                    <col width="87%">
	                </colgroup>
	                <tr>
	                    <th>받으시는 분</th>
	                    <td>권은영</td>
	                </tr>
	                <tr>
	                    <th>주소</th>
	                    <td>서울시 성동구 마조로</td>
	                </tr>
	                <tr>
	                    <th>휴대전화</th>
	                    <td>010-7123-0374</td>
	                </tr>
	                <tr>
	                    <th>배송메시지</th>
	                    <td>문 앞에 놔주세요</td>
	                </tr>
	            </table>
	        </div>
	        
	        <div class="div_finish4">
	            <input type="button" value="쇼핑계속하기" id="c_button1">&nbsp;&nbsp;
	            <input type="button" value="주문확인하기" id="c_button3" onclick="view_order(this.form)">
	        </div>
	    </div>
	    <input type="hidden" name="userid" value="podongEbi">
    </form>
    <%@ include file="common/footer.jsp" %>
</body>

<script>
	function view_order(frm) {
		frm.action = "controller?type=order";
		frm.submit();
	}
</script>

</html>