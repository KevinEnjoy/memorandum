# 记事本

#[MarkDown Here](https://github.com/adam-p/markdown-here)
[基本语法](https://github.com/adam-p/markdown-here/wiki/Markdown-Here-Cheatsheet)


https://github.com/KevinEnjoy/memorandum 

https://github.com/Trinea/android-open-project
https://github.com/wasabeef/awesome-android-ui

#已经看过的项目

https://github.com/zhuxiujia/LoopView 

https://bintray.com/tamajit/maven/android-spinnerwheel/view

https://github.com/kyleduo/SwitchButton

https://github.com/koral--/android-gif-drawable

https://github.com/Yalantis/uCrop

https://github.com/mikepenz/Android-Iconics


#未看过的项目

https://github.com/Mr-wangyong/FragmentStack

https://github.com/alt236/Bluetooth-LE-Library---Android

https://github.com/lopspower/CircularFillableLoaders

https://github.com/timqi/SectorProgressView

--------
#库的引用

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


#Mina框架的学习笔记——Android客户端的实现

http://www.cnblogs.com/cpacm/p/3915302.html


#启动模式

http://www.cnblogs.com/meizixiong/archive/2013/07/03/3170591.html

背景模糊
https://github.com/charbgr/BlurNavigationDrawer


#浏览Github的树形插件

地址：https://github.com/buunguyen/octotree

Chrome/火狐插件Octotree（作者： Buu Nguyen）

### Install on Chrome, Firefox and Opera
* Install Octotree from [Chrome Web Store](https://chrome.google.com/webstore/detail/octotree/bkhaagjahfmjljalopjnoealnfndnagc), [Mozilla Add-ons Store](https://addons.mozilla.org/en-US/firefox/addon/octotree/) or [Opera Add-ons Store](https://addons.opera.com/en/extensions/details/octotree/)
* Navigate to any GitHub or GitLab repository (or just refresh this page as an example)
* The code tree should show on the left-hand side of the screen

__Note__: to configure Octotree for GitHub and GitLab Enterprise, see [instructions](#enterprise-urls)

### Install on Safari

Octotree is not available on the Safari gallery. Instead, you must use the prebuilt package or build one from source.

* Download the [Safari prebuilt package](https://github.com/buunguyen/octotree/blob/master/dist/safari.safariextz?raw=true)
* Double-click or drag it to Safari


#JSON API免费接口

http://www.bejson.com/knownjson/webInterface/

必应每日壁纸API
http://www.bing.com/HPImageArchive.aspx?format=js&n=8&idx=1


## [BING 壁纸 API 用法](https://github.com/Eary/bing)
 - 1. 访问 https://api.ioliu.cn/bing/ , 返回bing每日最新背景图, 可选参数`[w,h]`
 - 2. 访问 https://api.ioliu.cn/bing/?d=n (n>=0), 返回以当日为起点第n天前的壁纸, 可选参数`[w,h]`
 - 3. 访问 https://api.ioliu.cn/bing/json/ , 返回bing每日最新壁纸的相关(介绍、图片地址等)信息(json格式), 可选参数`[callback]`.  
 - 4. 访问 https://api.ioliu.cn/bing/rand/ , 返回随机图片, 可选参数`[w,h]`
 - 5. 访问 https://api.ioliu.cn/bing/blur/ , 返回`高斯模糊`图片, 可选参数`[d,w,h]`
 
带`[w,h]`用法： https://api.ioliu.cn/bing/rand/?w=1920&h=1200  

### 目前已知分辨率`[w,h]`
```   
1920x1200   
1920x1080    
1366x768   
1280x768    
1024x768    
800x600    
800x480
768x1280  
720x1280      
640x480   
480x800     
400x240     
320x240 
240x320  
```   

### api https://api.ioliu.cn/bing/json/ 返回的json格式如下(支持`跨域调用`和`jsonp`)：  
```
{
    id: "47",
    title: "有灵气的犄角",
    attribute: "大角羊",
    description: "头顶两只巨大羊角的大角羊喜欢生活在多岩石的干燥地区，它们尤为喜欢各种开阔、干燥的沙漠和岩石山上。在落基山脉，大角羊随处可见，行动敏捷、视力敏锐的它们为这片旷野增添了不少活力。",
    startdate: "20160419",
    enddate: "20160420",
    fullstartdate: "201604191600",
    url: "http://s.cn.bing.net/az/hprichbg/rb/BigHornSheep_ZH-CN6358178150_1920x1080.jpg",
    urlbase: "/az/hprichbg/rb/BigHornSheep_ZH-CN6358178150",
    copyright: "加拿大，阿尔伯塔，卡纳纳斯基斯行政区的落基山脉大角羊 (© Walter Nussbaumer/Corbis)",
    copyrightlink: "http://www.bing.com/search?q=%E5%A4%A7%E8%A7%92%E7%BE%8A&form=hpcapt&mkt=zh-cn",
    hsh: "7da649ef5e67013814d6b618d0a35ece",
    qiniu_url: "BigHornSheep_ZH-CN6358178150",
    date: "2016-04-20"
}
```




#1.0.1 2015年最新Android基础入门教程目录

http://www.runoob.com/w3cnote/android-tutorial-contents.html


#云IDE
https://c9.io


#Express框架基础教程

http://javascript.ruanyifeng.com/nodejs/express.html


#android中string.xml中%1$s、%1$d等的用法
http://dengzhangtao.iteye.com/blog/1827533

#Markdown 语法说明 
http://wowubuntu.com/markdown/




#比较Picasso、Glide 和 Fresco 三种图片加载库

##[ Android  Fresco 与 Picasso 、Glide 的比较](http://blog.qiji.tech/archives/6344)

结论：
Picasso 所能实现的功能 Glide 都能做到，只是所需设置不同。两者的区别是 Picasso 比 Glide 体积小很多且图像质量比 Glide 高，但Glide 的速度比 Picasso 更快，Glide 的长处是处理大型的图片流，如 gif、video，如果要制作视频类应用，Glide 当为首选。
Fresco 可以说是综合了之前图片加载库的优点，其在5.0以下的内存优化非常好，但它的不足是体积太大，按体积进行比较：Fresco>Glide>Picasso，所以 Fresco 在图片较多的应用中更能凸显其价值，如果应用没有太多图片需求，不推荐使用 Fresco。


##[Picasso&Glide&Fresco比较 ](http://mrljdx.com/2015/12/22/Picasso-Glide-Fresco%E6%AF%94%E8%BE%83/)

结论：
1.Glide默认提供配置支持本地图片缓存,缓存的机制是DiskLruCache.可以根据自己的需要,自定义图片缓存的路径.所以在考虑节省用户流量来看可以不考虑Picasso;
2.虽然Fresco也提供更强大的图片缓存和加载机制,不过在比较之后,感觉Fresco还是有待完善.Glide可以很简单的获取网络图片的Bitmap对象,而Fresco需要通过订阅数据源克隆Bitmap对象的引用才能存储值.操作方式不够简洁和友好.
3.Fresco的库文件中,以最新的0.8.1为例,imagepipeline-0.8.1.aar光包得大小就有3.5M ,而Glide包的大小为465K(依赖于1.12MB的android-support-v4)为了让Apk包得体积更小,所以考虑使用Glide.



###关于Glide和Picasso的比较文章推荐:
[Introduction to Glide, Image Loader Library for Android, recommended by Google](https://inthecheesefactory.com/blog/get-to-know-glide-recommended-by-google/en)


##[Fresco](https://github.com/facebook/fresco)

####[Fresco英文文档](http://frescolib.org/docs)

####[Fresco中文文档](http://www.fresco-cn.org/docs)

####[如何手动清理Fresco的缓存](http://blog.csdn.net/biezhihua/article/details/49893323)


##[Glide](https://github.com/bumptech/glide)


####[Glide — Getting Started](http://mrfu.me/2016/02/27/Glide_Getting_Started/)

####[译Glide — Getting Started](http://mrfu.me/2016/02/27/Glide_Getting_Started/)

####[Glide 使用必须知道的基础属性](http://www.jianshu.com/p/cfb3d467687d)

####[Android图片库--Glide Wiki中文翻译 ](http://limuzhi.com/2016/01/24/Android%E5%9B%BE%E7%89%87%E5%BA%93-Glide/)

####[获取磁盘缓存文件的大小](https://github.com/bumptech/glide/issues/789)




#End
