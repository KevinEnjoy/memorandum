package okhttpTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.zhy.http.okhttp.OkHttpUtils;

import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestOkHttp {

	public static final MediaType JSON = MediaType.parse("application/json;charset=utf-8");
	public static OkHttpClient client = new OkHttpClient();

	public static void main(String[] args) throws IOException {

		//postFromBody();
		//Test.postJSONBody("http://www.roundsapp.com/post",bowlingJson("Jesse", "Jake"));
		//Test.get();
		//postImageOkHttpUtils();
		//postfileOkHttp();
	}
	

	

	

	public static void postfileOkHttp() throws IOException{

//		String url = "https://test-kevinwen.c9users.io:8080/hello";
		String url = "http://120.24.75.48:8082/v1/bx/type";
		String filepath = "C:\\image.png";
		File file = new File(filepath);
		if(!file.exists()) System.out.println("file is null");
		RequestBody requestBody = new MultipartBody.Builder()
				.setType(MultipartBody.FORM)
				.addFormDataPart("parent_name","ABC")
				.addFormDataPart("parent_id","2")
				.addFormDataPart("access_token","9755fc531e0ec9a79863c2a014b4b1c5")
				.addFormDataPart("img", "image_1.png",
						RequestBody.create(MediaType.parse("image/png"), file))
				.build();

		Request request = new Request.Builder()
				.url(url)
				.post(requestBody)
				.build();

		Response response = client.newCall(request).execute();
		System.out.println( "response="+response.body().string() );
	}


	public static void postImageOkHttpUtils() throws IOException{

		String url = "https://test-kevinwen.c9users.io:8080/hello";
		String filepath = "C:\\image.png";
		File file = new File(filepath);
		if(!file.exists()) System.out.println("file is null");
		Response response = OkHttpUtils
				.postFile()
				.url(url)
				.file(file)
				.build()
				.execute();

		System.out.println( "response="+response.body().string() );
		
	}



	public static void postFromBody() throws IOException{


		FormBody body = new FormBody.Builder()
				.add("email", "12344dd@qq.com")
				.add("pwd", "6789032323")
				.add("ask", "33")
				.add("answer", "66")
				.build();
		Request request = new Request.Builder()
				.url("http://**:8080/v1/reg")
				.post(body)
				.build();
		Response response = client.newCall(request).execute();
		System.out.println(response.body().string());
	}


	public static void postJSONBody(String url,String json) throws IOException{

		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder()
				.url(url)
				.post(body)
				.build();
		Response response = client.newCall(request).execute();
		System.out.println(response.body().string());
	}

	public static void get() throws IOException{

		Request request = new Request.Builder()
				.url("https://api.github.com/users/JakeWharton").build();
		Response response = client.newCall(request).execute();
		String result = response.body().string();
		System.out.println(result);
	}


	public static String  bowlingJson(String player1, String player2) {
		return "{'winCondition':'HIGH_SCORE',"
				+ "'name':'Bowling',"
				+ "'round':4,"
				+ "'lastSaved':1367702411696,"
				+ "'dateStarted':1367702378785,"
				+ "'players':["
				+ "{'name':'" + player1 + "','history':[10,8,6,7,8],'color':-13388315,'total':39},"
				+ "{'name':'" + player2 + "','history':[6,10,5,10,10],'color':-48060,'total':41}"
				+ "]}";
	}
}
