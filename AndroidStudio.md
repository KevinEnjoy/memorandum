##[Android Studio在线更新失败解决办法：](http://blog.csdn.net/gao_chun/article/details/45667645)

在AndroidStudio安装目录"/bin/studio.exe.vmoptions"(或者/bin/studio64.exe.vmoptions)文件中追加以下几行：
```
    -Djava.net.preferIPv4Stack=true  
    -Didea.updates.url=http://dl.google.com/android/studio/patches/updates.xml  
    -Didea.patches.url=http://dl.google.com/android/studio/patches/  
```



##Android N(API 24)我的配置环境

```
classpath 'com.android.tools.build:gradle:2.1.2'

android {
    compileSdkVersion 24
    buildToolsVersion "24.0.0"

    defaultConfig {
        applicationId "com.demo.version24"
        minSdkVersion 19
        targetSdkVersion 24
        versionCode 1
        versionName "1.0"
    }
}

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:24.0.0'
}
```




##Android Studio导入Eclipse的android项目出现中文乱码 
http://www.flashgou.com/show/177 
http://www.android-studio.org/index.php/docs/guide/129-eclipse-to-androidstdio 
