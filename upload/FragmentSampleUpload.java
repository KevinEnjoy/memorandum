

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.FormBodyPart;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class FragmentSampleUpload extends FragmentBase {

    private final String TAG = getClass().getName();
    public final static String NAME = "FragmentSampleUpload";
    private Unbinder unbinder;

    private ActContainer context;

    @BindView(R.id.tv_hello)
    TextView tvHello;

    @BindString(R.string.title_name_sample_fragment)
    String title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sample_upload, null);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View rootView, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);

        context = (ActContainer) getActivity();
        context.setTitleName(title);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    public static FragmentSampleUpload newInstance() {
        return new FragmentSampleUpload();
    }

    @OnClick(R.id.tv_hello)
    public void onClick() {

        new UploadImageThread().start();
    }



//    public String httpUpload(String url, String filepath){
//        File file = new File(filepath);
//        Log.i(TAG, "上传"+filepath);
//        if (!file.exists()) {
//            Log.i("leslie", "file not exists");
//            return null;
//        }
//
//        HttpClient client = new DefaultHttpClient();
//        HttpPost post = new HttpPost(url);
//
//        FileBody fileBody = new FileBody(file, "image/*");
//        FormBodyPart formBodyPart = new FormBodyPart("img",fileBody);
//        formBodyPart.addField("access_token","3108bff37af9d3d143b2f93747f5e0bb");
//        formBodyPart.addField("name","jdis");
//        formBodyPart.addField("parent_id","1");
//
//        MultipartEntity entity = new MultipartEntity();
//        // image 是服务端读取文件的 key
//        //entity.addPart("img", fileBody);
//        entity.addPart(formBodyPart);
//
//        post.setEntity(entity);
//
//        try {
//            HttpResponse response = client.execute(post);
//            String result = EntityUtils.toString(response.getEntity());
//            Log.e(TAG,result);
//            return result;
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public String httpUpload(String url, String filepath){
        File file = new File(filepath);
        Log.i(TAG, "上传"+filepath);
        if (!file.exists()) {
            Log.i("leslie", "file not exists");
            return null;
        }



        try {


            FileBody fileBody = new FileBody(file);
            StringBody comment1 = new StringBody("3108bff37af9d3d143b2f93747f5e0bb");
            StringBody comment2 = new StringBody("jdis");
            StringBody comment3 = new StringBody("1");
            MultipartEntity entity = new MultipartEntity();
            entity.addPart("img", fileBody);
            entity.addPart("access_token", comment1);
            entity.addPart("name", comment2);
            entity.addPart("parent_id", comment3);
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(url);
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            String result = EntityUtils.toString(response.getEntity());
            Log.e(TAG,result);
            return result;
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    class UploadImageThread extends Thread{
        @Override
        public void run() {
            super.run();
            httpUpload("http://120.24.75.48:8082/v1/bx/type","/storage/emulated/0/PNG_USER.png");
        }
    }
}
