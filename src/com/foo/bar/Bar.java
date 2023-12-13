package com.foo.bar;

import com.foo.Foo;

public class Bar extends Foo {

    @Override
    public void foo(int j){
        Foo foo = new Foo();
        System.out.println(j);
    }
}
