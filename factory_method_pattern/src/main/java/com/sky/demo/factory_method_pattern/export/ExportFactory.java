package com.sky.demo.factory_method_pattern.export;

/**
 * Created by rg on 1/8/16.
 * 抽象工厂
 */
public interface ExportFactory {

    public ExportFile factory(String type);
}
