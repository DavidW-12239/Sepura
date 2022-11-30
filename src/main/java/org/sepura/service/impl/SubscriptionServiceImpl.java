package org.sepura.service.impl;

import org.sepura.mapper.SubscriptionMapper;
import org.sepura.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Autowired
    SubscriptionMapper subscriptionMapper;

    public void addSubscription(String email){
        subscriptionMapper.addSubscription(email);
    }


}
