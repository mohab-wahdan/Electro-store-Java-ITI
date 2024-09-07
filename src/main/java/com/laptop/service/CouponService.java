package com.laptop.service;

import com.laptop.entity.Coupon;

import java.util.List;

public interface CouponService {
    Coupon addCoupon(Coupon coupon);
    void deleteCoupon(Coupon coupon);
    Coupon updateCoupon(Coupon coupon);
    Coupon findCouponById(int id);
    List<Coupon> findAllCoupons(int page, int size);
    Coupon findCouponByName(String name);

}