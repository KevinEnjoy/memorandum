package okhttpTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
okhttp-3.2.0.jar
okio-1.7.0.jar
*/
public class TestOkHttp {

	public static final MediaType JSON = MediaType.parse("application/json;charset=utf-8");
	public static OkHttpClient client = new OkHttpClient();

	public static void main(String[] args) throws IOException {
		
		postFromBody();
		//Test.postJSONBody("http://www.roundsapp.com/post",bowlingJson("Jesse", "Jake"));
		//Test.get();
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
