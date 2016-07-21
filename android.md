-----------


###关于library project 打包为aar的引用 
aar打包默认只会把lib目录下的jar包带上，通过解压library project生成的aar可以看到。 
怎么才能把aar包嵌套进aar呢？ 

dependencies {
    provided files('libs/nineoldandroids-2.2.0.jar')
}

---------------------

###库的引用

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

###Android App 安装目录

```
手机内存/date/app 
手机内存/system/app 
```

--------


###第三方网站下载Google Play Apps

#####[apkpure](https://apkpure.com)

试过好几种Play应用的网站，这个网站是下载速度最快，下载成功率最高的，而且资源也很丰富，不过一些付费的app还是下载不了，下载方法和其他网站的类似。

#####[酷安](http://www.coolapk.com)

酷安的资源大部分都来自于Google Play，并且酷安小编对软件也都做了言简意赅的说明，建议优先在酷安网查找下载。



###okhttp 
http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0106/2275.html 

http://blog.csdn.net/biezhihua/article/details/50603624 


### header
```
if (header == null) {
    throw new IllegalArgumentException("header may not be null");
}
```



###比较Picasso、Glide 和 Fresco 三种图片加载库

####[ Android  Fresco 与 Picasso 、Glide 的比较](http://blog.qiji.tech/archives/6344)

结论：
Picasso 所能实现的功能 Glide 都能做到，只是所需设置不同。两者的区别是 Picasso 比 Glide 体积小很多且图像质量比 Glide 高，但Glide 的速度比 Picasso 更快，Glide 的长处是处理大型的图片流，如 gif、video，如果要制作视频类应用，Glide 当为首选。
Fresco 可以说是综合了之前图片加载库的优点，其在5.0以下的内存优化非常好，但它的不足是体积太大，按体积进行比较：Fresco>Glide>Picasso，所以 Fresco 在图片较多的应用中更能凸显其价值，如果应用没有太多图片需求，不推荐使用 Fresco。


####[Picasso&Glide&Fresco比较 ](http://mrljdx.com/2015/12/22/Picasso-Glide-Fresco%E6%AF%94%E8%BE%83/)

结论：
1.Glide默认提供配置支持本地图片缓存,缓存的机制是DiskLruCache.可以根据自己的需要,自定义图片缓存的路径.所以在考虑节省用户流量来看可以不考虑Picasso;
2.虽然Fresco也提供更强大的图片缓存和加载机制,不过在比较之后,感觉Fresco还是有待完善.Glide可以很简单的获取网络图片的Bitmap对象,而Fresco需要通过订阅数据源克隆Bitmap对象的引用才能存储值.操作方式不够简洁和友好.
3.Fresco的库文件中,以最新的0.8.1为例,imagepipeline-0.8.1.aar光包得大小就有3.5M ,而Glide包的大小为465K(依赖于1.12MB的android-support-v4)为了让Apk包得体积更小,所以考虑使用Glide.



###关于Glide和Picasso的比较文章推荐:
[Introduction to Glide, Image Loader Library for Android, recommended by Google](https://inthecheesefactory.com/blog/get-to-know-glide-recommended-by-google/en)


###[Fresco](https://github.com/facebook/fresco)

####[Fresco英文文档](http://frescolib.org/docs)

####[Fresco中文文档](http://www.fresco-cn.org/docs)

####[如何手动清理Fresco的缓存](http://blog.csdn.net/biezhihua/article/details/49893323)


###[Glide](https://github.com/bumptech/glide)


####[Glide — Getting Started](http://mrfu.me/2016/02/27/Glide_Getting_Started/)

####[译Glide — Getting Started](http://mrfu.me/2016/02/27/Glide_Getting_Started/)

####[Glide 使用必须知道的基础属性](http://www.jianshu.com/p/cfb3d467687d)

####[Android图片库--Glide Wiki中文翻译 ](http://limuzhi.com/2016/01/24/Android%E5%9B%BE%E7%89%87%E5%BA%93-Glide/)

####[获取磁盘缓存文件的大小](https://github.com/bumptech/glide/issues/789)




###Start 1000+ Loading libs

https://github.com/81813780/AVLoadingIndicatorView

https://github.com/ybq/Android-SpinKit 
```
Android-SpinKit 可以配合ProgressBar使用
```

https://github.com/dinuscxj/LoadingDrawable

还有一个Start500+的，只有三种样式，其实就看上一种旋转的动画。

https://github.com/yankai-victor/Loading

###Google
[如何使用 Google Play 开发者控制台](https://support.google.com/googleplay/android-developer/answer/6112435?hl=zh-Hans)

[Android 开发者培训](https://developer.android.com/training/index.html)

[Android 开发者博客](http://android-developers.blogspot.com/)

[Material design ](https://material.google.com)

###1.0.1 2015年最新Android基础入门教程目录

http://www.runoob.com/w3cnote/android-tutorial-contents.html


###android中string.xml中%1$s、%1$d等的用法
http://dengzhangtao.iteye.com/blog/1827533





###Mina框架的学习笔记——Android客户端的实现

http://www.cnblogs.com/cpacm/p/3915302.html


###启动模式

http://www.cnblogs.com/meizixiong/archive/2013/07/03/3170591.html




###使用Android API最佳实践(Retrofit OKHttp GSON)

Retrofit和OkHttp同属于Square公司的开源项目，这两者是互补的关系，OkHttp是一个实现了HTTP协议的客户端，类似于HttpClient，而Retrofit是一个基于OkHttp的封装库，该库主要简化了http请求的实现过程，使得开发者只需关注自身功能的实现，而不必书写那些比较冗余的代码。但也正是由于Retrofit的高度封装性，其扩展性就相对比较弱，某些比较灵活的功能还需要开发者自己通过OkHttp来实现。

http://blog.jobbole.com/65170/
http://www.mobile-open.com/2016/922023.html


### Android Loader机制 
先说一个典型的应用场景，打开某个界面时，需要先加载本地缓存的数据，然后再请求网络获取最新的数据，刷新UI。这个时候就可以使用Loader来简化操作。
或者应用经常性的对数据源进行增删改，需要UI及时作出相应的刷新时，Loader也适用。

http://willyan.me/2013/05/12/android-loader/


### Android vector标签PathData画图(Vector/SVG)

http://www.cnblogs.com/yuhanghzsd/p/5466846.html


### Android Vector曲折的兼容之路 (Vector/SVG)

http://www.jianshu.com/p/e3614e7abc03

![](http://upload-images.jianshu.io/upload_images/1176696-7befad5f7a754d6d.gif)

Android 5.0发布的时候，Google提供了Vector的支持。Vector Drawable相对于普通的Drawable来说，有以下几个好处：

* Vector图像可以自动进行适配，不需要通过分辨率来设置不同的图片
* Vector图像可以大幅减少图像的体积，同样一张图，用Vector来实现，可能只有PNG的几十分之一
* 使用简单，很多设计工具，都可以直接导出SVG图像，从而转换成Vector图像
* 功能强大，不用写很多代码就可以实现非常复杂的动画
* 成熟、稳定，前端已经非常广泛的进行使用了


### [《Android群英传》作者简书](http://www.jianshu.com/users/dfc0ed52c22b/latest_articles)

#####一扫天下——ZXing使用全解析

http://www.jianshu.com/p/4fe2fcfe3389

https://github.com/zxing/zxing

网上很多都是基于ZXing2.3的，但是现在都3.1了，改了很多bug，也进行了很多优化，最好按本文弄一下。


#####Android自动化测试技巧

http://www.jianshu.com/p/1e42494ac1db

自动化测试是把以人为驱动的测试行为转化为机器执行的一种过程





