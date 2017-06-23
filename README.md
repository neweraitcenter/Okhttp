[![](https://www.jitpack.io/v/neweraitcenter/Okhttp.svg)](https://www.jitpack.io/#neweraitcenter/Okhttp)

Gradle添加依赖:
======
```groovy
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
 Step 2. Add the dependency
 	dependencies {
	        compile 'com.github.neweraitcenter:Okhttp:v1.0.0'
	}
```
使用方法：
=======
```groovy
在项目application里面添加：
OkHttpClient okHttpClient = new OkHttpClient.Builder()
				.addInterceptor(new LoggerInterceptor("TAG"))
				.connectTimeout(10000L, TimeUnit.MILLISECONDS)
				.readTimeout(10000L, TimeUnit.MILLISECONDS)
				//其他配置
				.build();

		OkHttpUtils.initClient(okHttpClient);
```


