# Java客户端上传文件+参数



1.Httpclient

2.OkHttp

3.OkHttp的封装



## OkHttpUtils

这里使用OkHttp3的封装工具类库[okhttp-utils](https://github.com/hongyangAndroid/okhttp-utils)

`compile 'com.zhy:okhttputils:2.6.2'`

`compile 'com.squareup.okhttp3:okhttp:3.2.0'`



示例:

```java
public static void postFileOkHttpUtils() throws IOException{

		String url = "http://localhost:8080/user";
		//文件路径，这里Java代码在Windows系统的下运行,所以这里是C盘下的文件
		//文件路径根据情况而定
		String filepath = "C:\\image.png";
		Map<String, String> params = new HashMap<String, String>();
		params.put("nickname","昵称");
		params.put("access_token","9755fs531e0ec9a79863c2a014b4b1c5");
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type","application/json;charset=utf-8");

		File file = new File(filepath);
		if(!file.exists()) System.out.println("file is null");
		Response response = OkHttpUtils
				.post()
				.addFile("user_img", "image/png", file)
				.url(url)
				.params(params)
				.build()
				.execute();

		System.out.println( "response="+response.toString() );
		System.out.println( "response="+response.body().string() );
	}

```



## OkHttp3

这里直接使用[OkHttp3](https://github.com/square/okhttp)

`compile 'com.squareup.okhttp3:okhttp:3.2.0'`

示例:

```java
	public static void postFileOkHttp() throws IOException{


		String url = "http://localhost:8080/user";
		//文件路径，这里Java代码在Windows系统的下运行,所以这里是C盘下的文件
		//文件路径根据情况而定
		String filepath = "C:\\image.png";

		File file = new File(filepath);
		if(!file.exists()) System.out.println("file is null");
		RequestBody requestBody = new MultipartBody.Builder()
				.setType(MultipartBody.FORM)
				.addFormDataPart("nickname","ABC")
				.addFormDataPart("access_token","9755fs531e0ec9a79863c2a014b4b1c5")
				.addFormDataPart("user_img", "image_1.png",
						RequestBody.create(MediaType.parse("image/png"), file))
				.build();

		Request request = new Request.Builder()
				.url(url)
				.post(requestBody)
				.build();

		Response response = new OkHttpClient().newCall(request).execute();

		System.out.println( "response="+response.toString() );
		System.out.println( "response="+response.body().string() );
	}
```



## HttpClient

apache的httpclient

`    compile 'commons-httpclient:commons-httpclient:3.1'`

`    compile 'org.apache.httpcomponents:httpclient:x.x'`



示例:

```java
public static String postfile(String file_path) throws Exception {

		String result = null;
		String url = "http://localhost:8080/user";
		
		HttpClient client = new HttpClient();
		PostMethod postMethod = new PostMethod(url); 

		try {

			File file = new File(file_path);
			if (!file.exists()) {
				System.out.println( "文件不存在!");
				return null;
			}
			//Part：类专门用来上传文件
			//其子类FilePart：用来上传文件的类
			//StringPart：普通的文本参数
			FilePart fileParts = new FilePart("img", file); 
			
			System.out.println("---" + fileParts);
			fileParts.setContentType("image/*");

			StringPart parts1= new StringPart("mickname","ABC");
			StringPart parts2=new StringPart("access_token","9755fs531e0ec9a79863c2a014b4b1c5") ;

			Part[] parts = {fileParts,parts1,parts2};
			
			if(parts==null)return null;
			MultipartRequestEntity mre=new MultipartRequestEntity(parts,postMethod.getParams());

			postMethod.setRequestEntity(mre);

			client.getHttpConnectionManager().getParams().setConnectionTimeout(50000);
			int status = client.executeMethod(postMethod);
			System.out.println(status);
			if (status == HttpStatus.SC_OK) {
				
				result = postMethod.getResponseBodyAsString();
				System.out.println(result);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
```

