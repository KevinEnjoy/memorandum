# 记事本

https://github.com/KevinEnjoy/memorandum 

https://github.com/Trinea/android-open-project

https://github.com/zhuxiujia/LoopView 

https://bintray.com/tamajit/maven/android-spinnerwheel/view

--------

```java
compile ':library-spinnerwheel@aar' 
compile project(':library-spinnerwheel') 
compile 'com.techbla.widget.spinnerwheel:library:2.2.11' 
```
--------
```java
Glide.with(this)
		        .load(gif_image)
		        .asGif()
		        .centerCrop()
		        .into(imageview_huoyan_test);
```
--------

#Android App 安装目录

手机内存/date/app 
手机内存/system/app 

--------
Android Studio更新日志(上面有2.0/2.1的下载地址)
http://tools.android.com/recent

--------
Android Studio 2.0 RC 3
April 5th, 2016: For information on what's new in 2.0 RC 3, see the release announcement. For additional information about Android Studio, see the main developer site. 
Windows:  https://dl.google.com/dl/android/studio/ide-zips/2.0.0.19/android-studio-ide-143.2738706-windows.zip (289.1 MiB) 
Mac:  https://dl.google.com/dl/android/studio/ide-zips/2.0.0.19/android-studio-ide-143.2738706-mac.zip (287.6 MiB) 
Linux: https://dl.google.com/dl/android/studio/ide-zips/2.0.0.19/android-studio-ide-143.2738706-linux.zip (286.7 MiB) 
SHA-1 Checksums: 
e2834e9c3e6e057e054c13907da2d96ee8c82110 android-studio-ide-143.2738706-windows.zip 
423201b7d0f22dfeea77d7653604eb4f6d5bcd5d android-studio-ide-143.2738706-mac.zip 
1f3c14476da3f8fd53b4385628f9dd282b18a3b3 android-studio-ide-143.2738706-linux.zip 

--------
#okhttp 
http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0106/2275.html 

http://blog.csdn.net/biezhihua/article/details/50603624 

--------

#学习

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

-----------


#关于library project 打包为aar的引用 
aar打包默认只会把lib目录下的jar包带上，通过解压library project生成的aar可以看到。 
怎么才能把aar包嵌套进aar呢？ 

dependencies {
    provided files('libs/nineoldandroids-2.2.0.jar')
}


---------------------
#nodejs上传文件
https://github.com/felixge/node-formidable
http://www.cnblogs.com/zhongweiv/p/nodejs_express_formidable.html
http://kirochen.com/2015/07/21/upload-demo-formidable/


---------------------
#bugly
- 自行配置版本号（默认读AndroidManifest.xml文件中VersionName）
- 配置用户名



#Android Studio导入Eclipse的android项目出现中文乱码 
http://www.flashgou.com/show/177 
http://www.android-studio.org/index.php/docs/guide/129-eclipse-to-androidstdio 


#贝塞尔曲线
http://gavinliu.cn/2015/03/30/Android-Animation-%E8%B4%9D%E5%A1%9E%E5%B0%94%E6%9B%B2%E7%BA%BF%E4%B9%8B%E7%BE%8E/
https://github.com/gavinliu/BeautifulOfBezier
http://blog.csdn.net/qq_21430549/article/details/50040241
https://github.com/7heaven/Bezier
https://github.com/recruit-lifestyle/WaveSwipeRefreshLayout
https://github.com/Steven-Luo/android-bezier-curve-chart




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




# Android Loader机制 
先说一个典型的应用场景，打开某个界面时，需要先加载本地缓存的数据，然后再请求网络获取最新的数据，刷新UI。这个时候就可以使用Loader来简化操作。
或者应用经常性的对数据源进行增删改，需要UI及时作出相应的刷新时，Loader也适用。

http://willyan.me/2013/05/12/android-loader/



#使用Android API最佳实践(Retrofit OKHttp GSON)

Retrofit和OkHttp同属于Square公司的开源项目，这两者是互补的关系，OkHttp是一个实现了HTTP协议的客户端，类似于HttpClient，而Retrofit是一个基于OkHttp的封装库，该库主要简化了http请求的实现过程，使得开发者只需关注自身功能的实现，而不必书写那些比较冗余的代码。但也正是由于Retrofit的高度封装性，其扩展性就相对比较弱，某些比较灵活的功能还需要开发者自己通过OkHttp来实现。

http://blog.jobbole.com/65170/
http://www.mobile-open.com/2016/922023.html


#<a href="https://github.com/avast/android-butterknife-zelezny">ButterKnifeZelezny</a>

Simple plug-in for Android Studio/IDEA that allows one-click creation of Butterknife view injections.

一个直接生成ButterKnife对View声明的插件，看图：

<p><a href="/avast/android-butterknife-zelezny/blob/master/img/zelezny_animated.gif" target="_blank"><img src="https://raw.githubusercontent.com/avast/android-butterknife-zelezny/master/img/zelezny_animated.gif" alt="" style="max-width:100%;"></a></p>

<p><a href="/avast/android-butterknife-zelezny/blob/master/img/zelezny_animated.gif" target="_blank"><img src="https://raw.githubusercontent.com/avast/android-butterknife-zelezny/master/img/butter_knife_zelezny_onclick_anim.gif" alt="" style="max-width:100%;"></a></p>


#End
