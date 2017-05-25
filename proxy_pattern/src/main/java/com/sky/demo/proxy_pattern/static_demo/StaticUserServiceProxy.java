package com.sky.demo.proxy_pattern.static_demo;

/**
 * Created by user on 17/5/25.
 * 代理对象和实际对象实现的是同一个接口
 *
 * 静态代理的缺点
 * 1、如果想换一种代理内容，就必须新写一个代理对象。这样很容易造成代理对象的膨胀。
 * 2、代理内容无法复用，另一个类如果也想使用这个代理内容，必须自己也写一个，同样，造成的后果就是代理类的无限膨胀
 * 3、接口里面如果新增了一个方法，实际对象实现了这个方法，代理对象也必须新增内容，去给这个新增方法增加代理内容（假如需要的话）
 */
public class StaticUserServiceProxy implements StaticUserService {

    private StaticUserService staticUserService;

    public StaticUserServiceProxy(StaticUserService staticUserService) {
        this.staticUserService = staticUserService;
    }

    @Override
    public void print() {
        System.out.println("proxy begin");

        staticUserService.print();

        System.out.println("proxy end");

    }

}
