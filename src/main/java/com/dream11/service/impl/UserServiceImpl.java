package com.dream11.service.impl;


import com.dream11.service.UserService;

class A {
    A show() {
        System.out.println("Hi");
        return new A();
    }
}

class B extends A {
    @Override
    B show() {  //CO Variant return typeq

        return new B();
    }
}

public class UserServiceImpl implements UserService {


}
