package cn.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.winext.fridgemate.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/18.
 */
public class AdapterListview extends BaseAdapter{

    private ArrayList<HashMap<String, String>> list;
    private Context context;
    private LayoutInflater inflater = null;

    public AdapterListview(ArrayList<HashMap<String, String>> list, Context context){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_layout, null);
            holder.tv = (TextView) convertView.findViewById(R.id.tv_hello);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv.setText((list.get(i).get("key").toString()));
        return convertView;

    }

    final class ViewHolder{
        TextView tv;
    }
}
