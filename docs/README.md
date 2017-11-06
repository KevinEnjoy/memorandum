# 记事本-https://github.com/KevinEnjoy/memorandum 

```
纸上得来终觉浅，绝知此事要躬行。
```



- [Android](https://github.com/KevinEnjoy/memorandum/blob/master/android.md) 
- [AndroidStudio](https://github.com/KevinEnjoy/memorandum/blob/master/AndroidStudio.md) 
- [Markdown](https://github.com/KevinEnjoy/memorandum/blob/master/markdown.md) 
- [OpenApi](https://github.com/KevinEnjoy/memorandum/blob/master/openApi.md) 
- [Web](https://github.com/KevinEnjoy/memorandum/blob/master/web.md) 
- [插件](https://github.com/KevinEnjoy/memorandum/blob/master/plugs.md) 

### 已经看过的项目

https://github.com/Trinea/android-open-project
https://github.com/wasabeef/awesome-android-ui

https://github.com/zhuxiujia/LoopView 

https://bintray.com/tamajit/maven/android-spinnerwheel/view

https://github.com/kyleduo/SwitchButton

https://github.com/koral--/android-gif-drawable

https://github.com/Yalantis/uCrop

https://github.com/mikepenz/Android-Iconics

 
### 未看过的项目

https://github.com/Bearded-Hen/Android-Bootstrap

https://github.com/Mr-wangyong/FragmentStack

https://github.com/alt236/Bluetooth-LE-Library---Android

https://github.com/lopspower/CircularFillableLoaders

https://github.com/timqi/SectorProgressView

https://github.com/cymcsg/UltimateRecyclerView

https://github.com/Rogero0o/GifLoadingView

https://github.com/Yalantis/pull-to-make-soup
![](https://raw.githubusercontent.com/Yalantis/PullToMakeSoup/master/PullToMakeSoupDemo/Resouces/recipe-finder.gif)


背景模糊
https://github.com/charbgr/BlurNavigationDrawer
--------


--------

### 学习

- 热修复 
- MVP 
- gradle自动打包apk 
- React Native 
- NDK 

热修复  
https://github.com/alibaba/AndFix 
http://www.cnblogs.com/xiaomoxian/p/5265158.html 
http://www.bkjia.com/Androidjc/1055390.html 

MVP  
http://yeungeek.com/2014/06/17/mvp-android/ 
http://jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0202/2397.html 
http://www.lcode.org/android-mvp%E5%BC%80%E5%8F%91%E6%A8%A1%E5%BC%8F%E8%AF%A6%E8%A7%A3/ 






### 贝塞尔曲线
http://gavinliu.cn/2015/03/30/Android-Animation-%E8%B4%9D%E5%A1%9E%E5%B0%94%E6%9B%B2%E7%BA%BF%E4%B9%8B%E7%BE%8E/
https://github.com/gavinliu/BeautifulOfBezier
http://blog.csdn.net/qq_21430549/article/details/50040241
https://github.com/7heaven/Bezier
https://github.com/recruit-lifestyle/WaveSwipeRefreshLayout
https://github.com/Steven-Luo/android-bezier-curve-chart

http://blog.csdn.net/u012319317/article/details/50496602


    //seperate RGB channels and calculate new value for each channel
    //ignore alpha channel
    private int RGBColorTransform(float progress, int fromColor, int toColor) {
        int or = (fromColor >> 16) & 0xFF;
        int og = (fromColor >> 8) & 0xFF;
        int ob = fromColor & 0xFF;
    
        int nr = (toColor >> 16) & 0xFF;
        int ng = (toColor >> 8) & 0xFF;
        int nb = toColor & 0xFF;
    
        int rGap = (int) ((float) (nr - or) * progress);
        int gGap = (int) ((float) (ng - og) * progress);
        int bGap = (int) ((float) (nb - ob) * progress);
    
        return 0xFF000000 | ((or + rGap) << 16) | ((og + gGap) << 8) | (ob + bGap);
    
    }



### [一个博客网站medium](https://medium.com/)

http://36kr.com/p/208436.html


### 微信IoT/微信运动
http://iot.weixin.qq.com/


### Temp
http://blog.coderzh.com/2015/08/29/hugo/
http://www.cnblogs.com/4wei/archive/2012/12/24/2847262.html


### 待阅读

http://blog.mcxiaoke.com/

http://blog.mcxiaoke.com/2014/02/25/android-dev-notes-02/

https://github.com/mcxiaoke/mqtt

http://www.ruanyifeng.com/blog/2016/07/yaml.html

http://oakzmm.com/2015/07/22/okHttp-Volley-Gson/

http://blog.csdn.net/xu_fu/article/details/44004841

http://www.cnblogs.com/bvin/p/4317852.html

[译Volley官方文档三](http://www.jianshu.com/p/40d27cbceb98)

[牛逼的组织Yalantis](https://github.com/Yalantis)
Yalantis 致力于提供世界一流的 Android 和 iOS 应用开发服务，因一些动画很棒的开源库为大家所熟知.

# End
