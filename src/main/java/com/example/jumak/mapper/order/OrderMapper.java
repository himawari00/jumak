package com.example.jumak.mapper.order;

import com.example.jumak.domain.dto.delivery.DeliveryAddressDto;
import com.example.jumak.domain.dto.order.PaymentDto;
import com.example.jumak.domain.dto.order.ShoppingListDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.CartVo;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.domain.vo.order.PaymentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderMapper {
//    장바구니 정보 삽입
    void cartInsert(ShoppingListDto shoppingListDto);

    //    장바구니 정보 삭제
    void cartDelete(ShoppingListDto shoppingListDto);

//    장바구니 리스트 조회
    List<CartVo> cartListSelect(Long userNumber);


//    주문자 정보 삽입
    void orderInsert(OrderVo orderVo);

//   주문자 정보 조회(유저 넘버)
      Optional<OrderVo> selectByUNumber(Long userNumber);

//    주문 번호로 조회
   Optional<OrderVo> selectByNumber (Long userNumber);

//    결제 정보 삽입
    void paymentInsert(OrderVo orderVo);
}
