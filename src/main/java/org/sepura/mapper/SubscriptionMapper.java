package org.sepura.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubscriptionMapper {
    void addSubscription(String email);
}
