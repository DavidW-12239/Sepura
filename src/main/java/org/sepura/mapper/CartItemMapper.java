package org.sepura.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sepura.entity.CartItem;
import org.sepura.entity.User;

import java.util.List;

@Mapper
public interface CartItemMapper {
    void addCartItem(CartItem cartItem);

    void updateCartItem(CartItem cartItem);

    void delCartItem(CartItem cartItem);
}
