package com.imuxuan.art.base.base;

public interface BaseView<T extends BasePresenter> { // View基类

    void setPresenter(T presenter); // 传入Presenter

}
