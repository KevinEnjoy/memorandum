-----------


###����library project ���Ϊaar������ 
aar���Ĭ��ֻ���libĿ¼�µ�jar�����ϣ�ͨ����ѹlibrary project���ɵ�aar���Կ����� 
��ô���ܰ�aar��Ƕ�׽�aar�أ� 

dependencies {
    provided files('libs/nineoldandroids-2.2.0.jar')
}

---------------------

###�������

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

###Android App ��װĿ¼

```
�ֻ��ڴ�/date/app 
�ֻ��ڴ�/system/app 
```

--------


###��������վ����Google Play Apps

#####[apkpure](https://apkpure.com)

�Թ��ü���PlayӦ�õ���վ�������վ�������ٶ���죬���سɹ�����ߵģ�������ԴҲ�ܷḻ������һЩ���ѵ�app�������ز��ˣ����ط�����������վ�����ơ�

#####[�ᰲ](http://www.coolapk.com)

�ᰲ����Դ�󲿷ֶ�������Google Play�����ҿᰲС������Ҳ�������Լ������˵�������������ڿᰲ���������ء�



###okhttp 
http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0106/2275.html 

http://blog.csdn.net/biezhihua/article/details/50603624 


### header
```
if (header == null) {
    throw new IllegalArgumentException("header may not be null");
}
```



###�Ƚ�Picasso��Glide �� Fresco ����ͼƬ���ؿ�

####[ Android  Fresco �� Picasso ��Glide �ıȽ�](http://blog.qiji.tech/archives/6344)

���ۣ�
Picasso ����ʵ�ֵĹ��� Glide ����������ֻ���������ò�ͬ�����ߵ������� Picasso �� Glide ���С�ܶ���ͼ�������� Glide �ߣ���Glide ���ٶȱ� Picasso ���죬Glide �ĳ����Ǵ�����͵�ͼƬ������ gif��video�����Ҫ������Ƶ��Ӧ�ã�Glide ��Ϊ��ѡ��
Fresco ����˵���ۺ���֮ǰͼƬ���ؿ���ŵ㣬����5.0���µ��ڴ��Ż��ǳ��ã������Ĳ��������̫�󣬰�������бȽϣ�Fresco>Glide>Picasso������ Fresco ��ͼƬ�϶��Ӧ���и���͹�����ֵ�����Ӧ��û��̫��ͼƬ���󣬲��Ƽ�ʹ�� Fresco��


####[Picasso&Glide&Fresco�Ƚ� ](http://mrljdx.com/2015/12/22/Picasso-Glide-Fresco%E6%AF%94%E8%BE%83/)

���ۣ�
1.GlideĬ���ṩ����֧�ֱ���ͼƬ����,����Ļ�����DiskLruCache.���Ը����Լ�����Ҫ,�Զ���ͼƬ�����·��.�����ڿ��ǽ�ʡ�û������������Բ�����Picasso;
2.��ȻFrescoҲ�ṩ��ǿ���ͼƬ����ͼ��ػ���,�����ڱȽ�֮��,�о�Fresco�����д�����.Glide���Ժܼ򵥵Ļ�ȡ����ͼƬ��Bitmap����,��Fresco��Ҫͨ����������Դ��¡Bitmap��������ò��ܴ洢ֵ.������ʽ���������Ѻ�.
3.Fresco�Ŀ��ļ���,�����µ�0.8.1Ϊ��,imagepipeline-0.8.1.aar����ô�С����3.5M ,��Glide���Ĵ�СΪ465K(������1.12MB��android-support-v4)Ϊ����Apk���������С,���Կ���ʹ��Glide.



###����Glide��Picasso�ıȽ������Ƽ�:
[Introduction to Glide, Image Loader Library for Android, recommended by Google](https://inthecheesefactory.com/blog/get-to-know-glide-recommended-by-google/en)


###[Fresco](https://github.com/facebook/fresco)

####[FrescoӢ���ĵ�](http://frescolib.org/docs)

####[Fresco�����ĵ�](http://www.fresco-cn.org/docs)

####[����ֶ�����Fresco�Ļ���](http://blog.csdn.net/biezhihua/article/details/49893323)


###[Glide](https://github.com/bumptech/glide)


####[Glide �� Getting Started](http://mrfu.me/2016/02/27/Glide_Getting_Started/)

####[��Glide �� Getting Started](http://mrfu.me/2016/02/27/Glide_Getting_Started/)

####[Glide ʹ�ñ���֪���Ļ�������](http://www.jianshu.com/p/cfb3d467687d)

####[AndroidͼƬ��--Glide Wiki���ķ��� ](http://limuzhi.com/2016/01/24/Android%E5%9B%BE%E7%89%87%E5%BA%93-Glide/)

####[��ȡ���̻����ļ��Ĵ�С](https://github.com/bumptech/glide/issues/789)




###Start 1000+ Loading libs

https://github.com/81813780/AVLoadingIndicatorView

https://github.com/ybq/Android-SpinKit 
```
Android-SpinKit �������ProgressBarʹ��
```

https://github.com/dinuscxj/LoadingDrawable

����һ��Start500+�ģ�ֻ��������ʽ����ʵ�Ϳ���һ����ת�Ķ�����

https://github.com/yankai-victor/Loading

###Google
[���ʹ�� Google Play �����߿���̨](https://support.google.com/googleplay/android-developer/answer/6112435?hl=zh-Hans)

[Android ��������ѵ](https://developer.android.com/training/index.html)

[Android �����߲���](http://android-developers.blogspot.com/)

[Material design ](https://material.google.com)

###1.0.1 2015������Android�������Ž̳�Ŀ¼

http://www.runoob.com/w3cnote/android-tutorial-contents.html


###android��string.xml��%1$s��%1$d�ȵ��÷�
http://dengzhangtao.iteye.com/blog/1827533





###Mina��ܵ�ѧϰ�ʼǡ���Android�ͻ��˵�ʵ��

http://www.cnblogs.com/cpacm/p/3915302.html


###����ģʽ

http://www.cnblogs.com/meizixiong/archive/2013/07/03/3170591.html




###ʹ��Android API���ʵ��(Retrofit OKHttp GSON)

Retrofit��OkHttpͬ����Square��˾�Ŀ�Դ��Ŀ���������ǻ����Ĺ�ϵ��OkHttp��һ��ʵ����HTTPЭ��Ŀͻ��ˣ�������HttpClient����Retrofit��һ������OkHttp�ķ�װ�⣬�ÿ���Ҫ����http�����ʵ�ֹ��̣�ʹ�ÿ�����ֻ���ע�����ܵ�ʵ�֣���������д��Щ�Ƚ�����Ĵ��롣��Ҳ��������Retrofit�ĸ߶ȷ�װ�ԣ�����չ�Ծ���ԱȽ�����ĳЩ�Ƚ����Ĺ��ܻ���Ҫ�������Լ�ͨ��OkHttp��ʵ�֡�

http://blog.jobbole.com/65170/
http://www.mobile-open.com/2016/922023.html


### Android Loader���� 
��˵һ�����͵�Ӧ�ó�������ĳ������ʱ����Ҫ�ȼ��ر��ػ�������ݣ�Ȼ�������������ȡ���µ����ݣ�ˢ��UI�����ʱ��Ϳ���ʹ��Loader���򻯲�����
����Ӧ�þ����ԵĶ�����Դ������ɾ�ģ���ҪUI��ʱ������Ӧ��ˢ��ʱ��LoaderҲ���á�

http://willyan.me/2013/05/12/android-loader/


### Android vector��ǩPathData��ͼ(Vector/SVG)

http://www.cnblogs.com/yuhanghzsd/p/5466846.html


### Android Vector���۵ļ���֮· (Vector/SVG)

http://www.jianshu.com/p/e3614e7abc03

![](http://upload-images.jianshu.io/upload_images/1176696-7befad5f7a754d6d.gif)

Android 5.0������ʱ��Google�ṩ��Vector��֧�֡�Vector Drawable�������ͨ��Drawable��˵�������¼����ô���

* Vectorͼ������Զ��������䣬����Ҫͨ���ֱ��������ò�ͬ��ͼƬ
* Vectorͼ����Դ������ͼ��������ͬ��һ��ͼ����Vector��ʵ�֣�����ֻ��PNG�ļ�ʮ��֮һ
* ʹ�ü򵥣��ܶ���ƹ��ߣ�������ֱ�ӵ���SVGͼ�񣬴Ӷ�ת����Vectorͼ��
* ����ǿ�󣬲���д�ܶ����Ϳ���ʵ�ַǳ����ӵĶ���
* ���졢�ȶ���ǰ���Ѿ��ǳ��㷺�Ľ���ʹ����


### [��AndroidȺӢ�������߼���](http://www.jianshu.com/users/dfc0ed52c22b/latest_articles)

#####һɨ���¡���ZXingʹ��ȫ����

http://www.jianshu.com/p/4fe2fcfe3389

https://github.com/zxing/zxing

���Ϻܶ඼�ǻ���ZXing2.3�ģ��������ڶ�3.1�ˣ����˺ܶ�bug��Ҳ�����˺ܶ��Ż�����ð�����Ūһ�¡�


#####Android�Զ������Լ���

http://www.jianshu.com/p/1e42494ac1db

�Զ��������ǰ�����Ϊ�����Ĳ�����Ϊת��Ϊ����ִ�е�һ�ֹ���





