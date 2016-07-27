package okhttpTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class YunDong {

	public static OkHttpClient client;
	
	static{
		OkHttpClient.Builder builder = new OkHttpClient.Builder();
		builder
		.readTimeout(200, TimeUnit.MILLISECONDS)
		.writeTimeout(600, TimeUnit.MILLISECONDS);
		client = builder.build();
	}
	
	static FormBody body;
	static String url;
	
	public static void main(String[] args) throws IOException{
		
		String test  = "[{\"distance\":51.1734,\"duration\":0,\"report\":\"[{\\\"calories\\\":0,\\\"distance\\\":51.1734,\\\"duration\\\":0,\\\"steps\\\":0,\\\"activity\\\":\\\"walking\\\"}]\",\"calories\":2.2287614006000007,\"steps\":68,\"pm2d5\":120,\"date\":1469376000,\"activeValue\":12036,\"key\":\"70938a814c66c450e91859da9bd4a4aa\"}]";
		
		url = "http://walk.ledongli.cn/xq/io.ashx";
		body = new FormBody.Builder()
				.add("action", "profile")
				.add("pc", "and5e616b593e4548c13de645fc904295c")
				.add("cmd", "updatedaily_eden")
				.add("uid", "58899547")
				.add("list", test)
				.build();
		
		
		new YunDong().runThread();
		
	}
	
	public void runThread(){
		
		for (int i = 0; i < 5; i++) {
			new MyThread().start();
		}
	}
	
	
	class MyThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			while(true){
				
				try{
					String response = post(url,body);
					System.out.println(response);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static String post(String url,FormBody body) throws IOException{

		Request request = new Request.Builder()
				.url(url)
				.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
				.addHeader("User-Agent", "Dalvik/1.6.0 (Linux; U; Android 4.4.4; HM 1S MIUI/V7.5.1.0.KHCCNDE)")
				.post(body)
				.build();
		Response response = client
				.newCall(request)
				.execute();
		return response.body().string();
	}
	
	public static String get(String url) throws IOException{

		//"https://api.github.com/users/JakeWharton"
		Request request = new Request.Builder()
				.url(url).build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}
}
