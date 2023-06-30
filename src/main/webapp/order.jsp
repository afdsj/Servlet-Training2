<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>후참잘 주문</title>
</head>
<body>
    <h2> 후라이드 참 잘하는 집 입니다</h2>
    <h4> 주문하실 옵션들을 선택하신 후 아래 '주문확인' 버튼을 클릭해 주세요</h4>
    <form action="/ordersuccess" method="get">
      <label>메뉴&emsp;&emsp;&emsp;&nbsp;</label>
      <input type="radio" name="menu" id="fried" value="후라이드치킨"><label for="fried">후라이드치킨</label>
      <input type="radio" name="menu" id="spicy" value="양념치킨"><label for="spicy">양념치킨</label>
      <input type="radio" name="menu" id="snow" value="눈꽃치즈치킨"><label for="snow">눈꽃치즈치킨</label>
      <br/>
      <label>토핑 리스트 </label>
      <input type="checkbox" name="topping" id="topping1" value="고구마튀김"><label for="topping1">고구마튀김</label>
      &ensp;
      <input type="checkbox" name="topping" id="topping3" value="김말이"><label for="topping3">김말이</label>
      &emsp;
      <input type="checkbox" name="topping" id="topping4" value="주먹밥"><label for="topping4">주먹밥</label>
      <br/>
      <label>리뷰 이벤트 </label>
      <input type="radio" name="review" id="cock" value="코카콜라"><label for="cock">코카콜라</label>
      &ensp;&nbsp;&nbsp;
      <input type="radio" name="review" id="cider" value="사이다"><label for="cider">사이다</label>
      &ensp;&nbsp;&nbsp;
      <input type="radio" name="review" id="cheese" value="치즈볼"><label for="cheese">치즈볼</label>
      <br/>
      <input type="submit" value="주문확인">
    </form>
</body>
</html>
