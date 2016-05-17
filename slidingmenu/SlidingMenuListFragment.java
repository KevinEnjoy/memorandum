package com.example.slidingmenu_kevin;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SlidingMenuListFragment extends ListFragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.sliding_menu_list, null);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		SampleAdapter adapter = new SampleAdapter(getActivity());
//		for (int i = 0; i < 5; i++) {
//			adapter.add(new SampleItem("Sample List", android.R.drawable.ic_menu_search));
//		}
		adapter.add(new SampleItem("帐号管理", R.drawable.menu_account));
		adapter.add(new SampleItem("偏好设置", R.drawable.menu_preferences));
		adapter.add(new SampleItem("操作指南", R.drawable.menu_operate));
		adapter.add(new SampleItem("意见反馈", R.drawable.menu_suggestion));
		adapter.add(new SampleItem("关于我们", R.drawable.menu_about));
		adapter.add(new SampleItem("退出登录", R.drawable.menu_exit));
		setListAdapter(adapter);
	}

	private class SampleItem {
		public String tag;
		public int iconRes;
		public SampleItem(String tag, int iconRes) {
			this.tag = tag; 
			this.iconRes = iconRes;
		}
	}

	public class SampleAdapter extends ArrayAdapter<SampleItem> {

		public SampleAdapter(Context context) {
			super(context, 0);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getContext()).inflate(R.layout.sliding_menu_item, null);
			}
			ImageView icon = (ImageView) convertView.findViewById(R.id.row_icon);
			icon.setImageResource(getItem(position).iconRes);
			TextView title = (TextView) convertView.findViewById(R.id.row_title);
			title.setText(getItem(position).tag);

			return convertView;
		}

	}
}
